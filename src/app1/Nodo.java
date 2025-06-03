package app1;

/**
 * Erick Humerto Rojas Teran. 1 - Junio - 2025
 */
public class Nodo {

    int numControl, calificacion;
    String correoElectronico;
    Nodo enlace;

    public Nodo(int numControl, int calificacion, String correoElectronico) {
        this.numControl = numControl;
        this.calificacion = calificacion;
        this.correoElectronico = correoElectronico;
    }
}
