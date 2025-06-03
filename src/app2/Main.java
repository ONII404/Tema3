package app2;

import java.util.Scanner;

/**
 *
 * @author ITM-9993
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista listaestudiante = new Lista();
        int numControl, edad = 18;
        String Nombre;
        int opcion = 0;

        do {
            System.out.println("=== Sistema de Administracion de estudiantes ===");
            System.out.println("1. Insertar Estudiante");
            System.out.println("2. Mostrar todos los datos");
            System.out.println("3. Mostrar por numero de control");
            System.out.println("4. Mostrar estudiantes mayores a 18 años");
            System.out.println("10. Salir");
            System.out.print("Opcion:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("introducir numero control");
                    numControl = scanner.nextInt();

                    System.out.println("Introducir nombre: ");
                    Nombre = scanner.next();

                    System.out.println("introducir edad: ");
                    edad = scanner.nextInt();

                    listaestudiante.insertarCabeza(numControl, Nombre, edad);
                    break;
                case 2:
                    listaestudiante.mostrar();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("ingrese el numero de control: ");
                    numControl = scanner.nextInt();
                    listaestudiante.buscar(numControl);
                    break;
                case 4:
                    listaestudiante.buscarPorEdad(edad);
                    break;
                case 10:

                    break;
            }
        } while (opcion != 10);
    }
}
