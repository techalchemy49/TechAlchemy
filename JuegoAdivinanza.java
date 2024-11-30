import java.util.Random;

public class JuegoAdivinanza {
    private int intentos;
    private double progreso;
    private String[] palabrasAleatoreas = {"casa", "arbol", "rio", "montaña", "sol",
            "nube","mar", "vienmto", "fuego", "luz",
            "flor", "strella", "camino", "puerta", "libro",
            "cielo", "tierra", "lago", "nieve", "ciudad",
            "campo", "piedrita", "hoja", "noche", "dia"
    };
    public JuegoAdivinanza() {
        this.intentos = 0;
        this.progreso =0;
    }
    public int getIntentos() {
        return intentos;
    }
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    public double getProgreso() {
        return progreso;
    }
    public void setProgreso(double progreso) {
       this.progreso = progreso;
    }
}
