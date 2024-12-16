package com.mycompany.adivinar_palabra;

import java.util.Random;

public class JuegoAdivinanza {

    private String[] palabrasAleatorias = {
        "casa", "arbol", "rio", "montana", "sol",
        "nube", "mar", "viento", "fuego", "luz",
        "flor", "estrella", "camino", "puerta", "libro",
        "cielo", "tierra", "lago", "nieve", "ciudad",
        "campo", "piedra", "hoja", "noche", "dia"
    };

    /**
     * Método para obtener una palabra aleatoria.
     *
     * @return Una palabra aleatoria seleccionada de la lista.
     */
    public String elegirPalabra() {
        Random random = new Random();
        int index = random.nextInt(this.palabrasAleatorias.length);
        return this.palabrasAleatorias[index];
    }
}
