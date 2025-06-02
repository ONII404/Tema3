package app;

/**
 * Erick Humerto Rojas Teran. 
 * 1 - Junio - 2025
 */
public class Nodo {

    private int numControl, calificacion;
    private String correoElectronico;
    private Nodo enlace;

    public Nodo(int numControl, int calificacion, String correoElectronico) {
        this.numControl = numControl;
        this.calificacion = calificacion;
        this.correoElectronico = correoElectronico;
    }

    public int getNumControl() {
        return numControl;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
