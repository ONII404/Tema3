package app2;

public class Lista {

    Nodo primero, fin;

    public Lista() {
        primero = null;
    }

    /**
     *
     * @param numeroControl
     * @param nombre
     * @param edad
     * @return
     */
    public Lista insertarCabeza(int numeroControl, String nombre, int edad) {
        Nodo nodoTemporal;
        nodoTemporal = new Nodo(numeroControl, nombre, edad);
        nodoTemporal.enlace = primero;
        primero = nodoTemporal;
        System.out.println("Datos introducidos correctamentes!");
        return this;
    }

    public void mostrar() {
        Nodo nodo = primero;
        int k = 0;

        System.out.println("=== Lista de Estudiantes ===");
        while (nodo != null) {
            System.out.println(
                    "Numero de control: " + nodo.numControl
                    + " Nombre: " + nodo.nombre
                    + " Edad: " + nodo.edad
                    + "\n-----------------------------");
            nodo = nodo.enlace;
            k++;
        }
    }

    public void buscar(int numeroControl) {
        Nodo indice = primero;
        while (indice != null) {
            if (indice.numControl == numeroControl) {
                System.out.println("=== Dato Encontrado ===");
                System.out.println("Numero control: " + indice.numControl);
                System.out.println("Nombre: " + indice.nombre);
                System.out.println("Edad: " + indice.edad);
                break;
            }
            indice = indice.enlace;
        }
    }

    public void buscarPorEdad(int edad) {
        Nodo indice = primero;
        System.out.println("=== Datos Encontrado ===");
        while (indice != null) {
            if (indice.edad >= 18) {
                System.out.println("Numero control: " + indice.numControl);
                System.out.println("Nombre: " + indice.nombre);
                System.out.println("Edad: " + indice.edad);
                System.out.println("-----------------------------");
            }
            indice = indice.enlace;
        }
    }

}
