public class Palabra {
    private String palabraSeleccionada;
    private String avancePalabra;

    public Palabra(String palabraSeleccionada) {
        this.palabraSeleccionada = palabraSeleccionada;
        this.avancePalabra = "";
        this.inicializarPalabraConGuines();
    }
    public String getPalabraSeleccionada() {
        return  palabraSeleccionada;
    }
    public String getAvancePalabra() {
        return avancePalabra;
    }
    public void setPalabraSeleccionada(String palabraSeleccionada) {
        this.palabraSeleccionada = palabraSeleccionada;
    }
    public void inicializarPalabraConGuines () {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < this.palabraSeleccionada.length() ; i++) {
            sb.append("_ ");
        }
        this.avancePalabra = sb.toString().trim();
    }
}
