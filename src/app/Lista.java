package app;

/**
 * Erick Humerto Rojas Teran. 
 * 1 - Junio - 2025
 */
public class Lista {

    Nodo nodoEstudiante;

    public Lista(Nodo nodoEstudianteNodo) {
        this.nodoEstudiante = null;
    }

    public Lista insertHeadList(int numControl, int calificacion, String correo) {
        Nodo nodoNuevo;
        nodoNuevo = new Nodo(numControl, calificacion, correo);
        nodoNuevo.setEnlace(nodoEstudiante);
        nodoEstudiante = nodoNuevo;
        return this;
    }

    public void mostrar() {
        Nodo n = nodoEstudiante;
        int k = 0;

        System.out.println("=== Lista de Estudiantes ===");

        while (n != null) {
            System.out.println(
                    "Numero de control: " + n.getNumControl()
                    + " Calificacion: " + n.getCalificacion()
                    + " Correo: " + n.getCorreoElectronico()
                    + "\n-----------------------------");
            n = n.getEnlace();
            k++;
        }
    }

    public boolean buscar(int numControl) {
        Nodo index = nodoEstudiante;
        boolean encontrado = false;

        while (index != null) {
            if (index.getNumControl() == numControl) {
                System.out.println("=== Dato encontrado ===");
                System.out.println(
                        "Número de control: " + index.getNumControl() + "\n"
                        + "Calificación: " + index.getCalificacion() + "\n"
                        + "Correo electrónico: " + index.getCorreoElectronico() + "\n"
                        + "-----------------------------");
                encontrado = true;
                break; // Salir del bucle una vez encontrado
            }
            index = index.getEnlace();
        }

        if (!encontrado) {
            System.out.println("¡No se encontró el número de control en la lista!");
        }
        return encontrado;
    }

    public void eliminarPrimero() {
        if (nodoEstudiante != null) {
            nodoEstudiante = nodoEstudiante.getEnlace();
            System.out.println("Primer elemento eliminado correctamente.");
        } else {
            System.out.println("La lista está vacía. No hay elementos para eliminar.");
        }
    }

    public void eliminarPorNumeroControl(int numControl) {
        if (nodoEstudiante == null) {
            System.out.println("La lista está vacía. No hay elementos para eliminar.");
            return;
        }

        // Caso especial: si el nodo a eliminar es el primero
        if (nodoEstudiante.getNumControl() == numControl) {
            nodoEstudiante = nodoEstudiante.getEnlace();
            System.out.println("Elemento eliminado correctamente.");
            return;
        }

        // Buscar el nodo a eliminar
        Nodo actual = nodoEstudiante;
        while (actual.getEnlace() != null && actual.getEnlace().getNumControl() != numControl) {
            actual = actual.getEnlace();
        }

        // Si se encontró el nodo, eliminarlo
        if (actual.getEnlace() != null) {
            actual.setEnlace(actual.getEnlace().getEnlace());
            System.out.println("Elemento eliminado correctamente.");
        } else {
            System.out.println("No se encontró el número de control en la lista.");
        }
    }

}
