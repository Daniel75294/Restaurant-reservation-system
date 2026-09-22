import java.util.*;
import java.time.LocalDateTime;

public class ControladorReserva {
    private List<Mesa> mesas;
    private List<Reserva> reservas;

    public ControladorReserva() {
        mesas = new ArrayList<>();
        reservas = new ArrayList<>();
        inicializarMesas();
    }

    private void inicializarMesas() {
        for (int i = 1; i <= 5; i++) {
            mesas.add(new Mesa(i, 4));
        }
    }

    public void registrarReserva(String nombre, String telefono, LocalDateTime fechaHora) {
        Cliente cliente = new Cliente(nombre, telefono);
        for (Mesa mesa : mesas) {
            if (mesa.estaDisponible()) {
                mesa.reservar();
                Reserva reserva = new Reserva(cliente, mesa, fechaHora);
                reservas.add(reserva);
                System.out.println("Reserva realizada exitosamente.");
                return;
            }
        }
        System.out.println("No hay mesas disponibles.");
    }

    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Reserva r : reservas) {
                r.mostrarReserva();
            }
        }
    }
}
