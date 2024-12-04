/**
 * Clase que representa una palabra que el jugador debe adivinar. Maneja la
 * lógica para el seguimiento del progreso y la validación del juego.
 */
public class Palabra {

    private String palabraSeleccionada; // La palabra que debe adivinarse.
    private String avancePalabra; // Representación actual del progreso, usando guiones bajos para letras no adivinadas.
    private int intentos; // Número de intentos que el jugador ha realizado.

    /**
     * Constructor que inicializa la palabra seleccionada y establece el avance
     * inicial con guiones.
     *
     * @param palabraSeleccionada La palabra que el jugador debe adivinar.
     */
    public Palabra(String palabraSeleccionada) {
        this.palabraSeleccionada = palabraSeleccionada;
        this.avancePalabra = "";
        this.intentos = 0; // Inicializa los intentos en 0.
        this.inicializarPalabraConGuiones();
    }

    /**
     * Obtiene la palabra seleccionada.
     *
     * @return La palabra que el jugador debe adivinar.
     */
    public String getPalabraSeleccionada() {
        return palabraSeleccionada;
    }

    /**
     * Obtiene el avance actual de la palabra con letras adivinadas y guiones.
     *
     * @return Representación del progreso de la palabra.
     */
    public String getAvancePalabra() {
        return avancePalabra;
    }

    /**
     * Obtiene el número de intentos realizados por el jugador.
     *
     * @return Cantidad de intentos realizados.
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * Establece una nueva palabra para ser adivinada.
     *
     * @param palabraSeleccionada La nueva palabra a adivinar.
     */
    public void setPalabraSeleccionada(String palabraSeleccionada) {
        this.palabraSeleccionada = palabraSeleccionada;
    }

    /**
     * Inicializa el avance de la palabra con guiones bajos y espacios. Cada
     * letra se representa como "_".
     */
    public void inicializarPalabraConGuiones() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.palabraSeleccionada.length(); i++) {
            sb.append("_ ");
        }
        this.avancePalabra = sb.toString().trim();
    }

    /**
     * Método para mostrar la palabra inicial con guiones en consola. Cada letra
     * se reemplaza por un "_".
     */
    public void mostrarConGuiones() {
        for (int i = 0; i < this.palabraSeleccionada.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println();
    }

    /**
     * Procesa la letra ingresada por el jugador. Si la letra coincide con
     * alguna de las letras de la palabra seleccionada, se actualiza el avance
     * de la palabra. Incrementa el contador de intentos.
     *
     * @param letra La letra ingresada por el jugador.
     */
    public void recibirLetra(char letra) {
        letra = Character.toLowerCase(letra);
        StringBuilder sb = new StringBuilder(this.avancePalabra);
        boolean letraEncontrada = false;

        for (int i = 0; i < this.palabraSeleccionada.length(); i++) {
            if (letra == this.palabraSeleccionada.charAt(i)) {
                sb.setCharAt(i * 2, letra); // Ajusta la posición considerando los espacios.
                letraEncontrada = true;
            }
        }

        // Si la letra no está en la palabra, se considera un intento fallido.
        if (!letraEncontrada) {
            this.intentos++;
            System.out.println("Letra incorrecta. Intentos: " + this.intentos);
        }

        this.avancePalabra = sb.toString();

        // Valida si la palabra está completamente adivinada.
        validarPalabra();
    }

    /**
     * Valida si el jugador ha adivinado completamente la palabra. Si no quedan
     * guiones bajos en el avance de la palabra, muestra un mensaje de
     * felicitaciones.
     */
    private void validarPalabra() {
        if (!this.avancePalabra.contains("_")) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + this.palabraSeleccionada);
            System.out.println("Número total de intentos: " + this.intentos);
        }
    }
}
