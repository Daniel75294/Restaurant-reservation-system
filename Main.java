import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorReserva controlador = new ControladorReserva();

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar reserva");
            System.out.println("2. Mostrar reservas");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Teléfono: ");
                String telefono = scanner.nextLine();
                System.out.print("Fecha y hora (yyyy-MM-ddTHH:mm): ");
                String fechaInput = scanner.nextLine();
                try {
                    LocalDateTime fechaHora = LocalDateTime.parse(fechaInput);
                    controlador.registrarReserva(nombre, telefono, fechaHora);
                } catch (Exception e) {
                    System.out.println("Formato de fecha incorrecto. Usa: yyyy-MM-ddTHH:mm");
                }
            } else if (opcion == 2) {
                controlador.mostrarReservas();
            } else if (opcion == 3) {
                System.out.println("Programa finalizado.");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }
}
