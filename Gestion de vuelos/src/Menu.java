import java.util.Scanner;

public class Menu {
    public static void menu(ListaAeropuerto listaAeropuerto, ListaVuelos listaVuelos){
        Output output = new Output();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Mostrar el listado de Aeropueros.");
            System.out.println("2. Mostrar el listado de las salidas por cada Aeropuerto.");
            System.out.println("3. Mostrar el listado de las entradas por cada Aeropuerto.");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la Opción 1.");
                    System.out.println("A continuacion se mostrará un documento de texto con la informacion requerida.");
                    output.listaAeorpuertos(listaAeropuerto);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la Opción 2.");
                    System.out.println("A continuacion se mostrará un documento de texto con la informacion requerida.");
                    output.listaSalidas(listaVuelos, listaAeropuerto);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ha seleccionado la Opción 3.");
                    System.out.println("A continuacion se mostrará un documento de texto con la informacion requerida.");
                    output.listaEntradas(listaVuelos, listaAeropuerto);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }
}