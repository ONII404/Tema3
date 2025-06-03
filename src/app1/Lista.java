package app1;

/**
 * Erick Humerto Rojas Teran. 1 - Junio - 2025
 */
public class Lista {

    Nodo nodoEstudiante;

    public Lista(Nodo nodoEstudianteNodo) {
        this.nodoEstudiante = null;
    }

    public Lista insertHeadList(int numControl, int calificacion, String correo) {
        Nodo nodoNuevo;
        nodoNuevo = new Nodo(numControl, calificacion, correo);
        nodoNuevo.enlace = nodoEstudiante;
        nodoEstudiante = nodoNuevo;
        return this;
    }

    public void mostrar() {
        Nodo n = nodoEstudiante;
        int k = 0;

        System.out.println("=== Lista de Estudiantes ===");

        while (n != null) {
            System.out.println(
                    "Numero de control: " + n.numControl
                    + " Calificacion: " + n.calificacion
                    + " Correo: " + n.correoElectronico
                    + "\n-----------------------------");
            n = n.enlace;
            k++;
        }
    }

    public boolean buscar(int numControl) {
        Nodo index = nodoEstudiante;
        boolean encontrado = false;

        while (index != null) {
            if (index.numControl == numControl) {
                System.out.println("=== Dato encontrado ===");
                System.out.println(
                        "Número de control: " + index.numControl + "\n"
                        + "Calificación: " + index.calificacion + "\n"
                        + "Correo electrónico: " + index.correoElectronico + "\n"
                        + "-----------------------------");
                encontrado = true;
                break; // Salir del bucle una vez encontrado
            }
            index = index.enlace;
        }

        if (!encontrado) {
            System.out.println("¡No se encontró el número de control en la lista!");
        }
        return encontrado;
    }

    public void eliminarPrimero() {
        if (nodoEstudiante != null) {
            nodoEstudiante = nodoEstudiante.enlace;
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
        if (nodoEstudiante.numControl == numControl) {
            nodoEstudiante = nodoEstudiante.enlace;
            System.out.println("Elemento eliminado correctamente.");
            return;
        }

        // Buscar el nodo a eliminar
        Nodo actual = nodoEstudiante;
        while (actual.enlace != null && actual.enlace.numControl != numControl) {
            actual = actual.enlace;
        }

        // Si se encontró el nodo, eliminarlo
        if (actual.enlace != null) {
            actual = actual.enlace.enlace;
            System.out.println("Elemento eliminado correctamente.");
        } else {
            System.out.println("No se encontró el número de control en la lista.");
        }
    }

}
