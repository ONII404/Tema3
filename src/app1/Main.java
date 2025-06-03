package app1;

import java.util.Scanner;

/**
 * Erick Humerto Rojas Teran. 1 - Junio - 2025
 */
public class Main {

    public static void main(String[] args) {
        int optionMenu, pregunta = 0;
        boolean salir = false;

        Scanner scanner = new Scanner(System.in);
        Lista listaEstudiantes = new Lista(null);
        Funcionalidades fun = new Funcionalidades(listaEstudiantes);
        fun.cargarDatosPreparados();

        do {
            System.out.print("""
                    Selecciona una opción:
                        1. Insertar
                        2. Buscar
                        3. Ver Todo
                        4. Eliminar primero
                        5. Eliminar por Numero de Control
                        6. Salir
                    """);
            optionMenu = scanner.next().charAt(0);

            switch (optionMenu) {
                case '1':
                    fun.agregar(); // Insertar un numero de control
                    break;
                case '2':
                    System.out.println("Introduce el número de control a buscar:");
                    int numBuscar = scanner.nextInt();
                    fun.buscar(numBuscar);
                    break;
                case '3':
                    fun.mostrar(); // Mostrar todos los datos
                    break;
                case '4':
                    fun.eliminarPrimero(); // Eliminar el primer Numero de control
                    break;
                case '5':
                    System.out.println("Introduce el número de control a eliminar:");
                    int numEliminar = scanner.nextInt();
                    fun.eliminarPorNumeroControl(numEliminar); // Eliminar por número de control
                    break;
                case '6':
                    salir = true; // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }

            if (!salir) {
                System.out.println("¿Deseas realizar otra acción? (S/N)");
                pregunta = scanner.next().charAt(0);
                if (pregunta == 'N' || pregunta == 'n') {
                    salir = true; // Salir del programa si el usuario elige 'N' o 'n'
                }
            }
        } while (!salir);
        System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
        scanner.close();
    }
}

class Funcionalidades {

    int numControl, calificacion;
    String correoElectronico;
    Lista lista;
    Scanner scanner = new Scanner(System.in);

    public Funcionalidades(Lista lista) {
        this.lista = lista;
    }

    public void agregar() {

        System.out.println("Introducir el numero de control:");
        numControl = scanner.nextInt();

        System.out.println("Introduce la calificacion: ");
        calificacion = scanner.nextInt();

        System.out.println("Introducir el correo electronico:");
        correoElectronico = scanner.next();

        lista.insertHeadList(numControl, calificacion, correoElectronico);
        System.out.println("Datos guardados correctamente");

    }

    public void mostrar() {
        lista.mostrar();
    }

    public void buscar(int numControl) {
        lista.buscar(numControl);
    }

    public void eliminarPrimero() {
        lista.eliminarPrimero();
    }

    public void eliminarPorNumeroControl(int numControl) {
        lista.eliminarPorNumeroControl(numControl);
    }

    public void cargarDatosPreparados() {
        lista.insertHeadList(101, 7, "alumno1@gmail.com");
        lista.insertHeadList(102, 6, "alumno2@gmail.com");
        lista.insertHeadList(103, 9, "alumno3@gmail.com");
        lista.insertHeadList(104, 8, "alumno4@gmail.com");
    }
}
