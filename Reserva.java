import java.time.LocalDateTime;

public class Reserva {
    private Cliente cliente;
    private Mesa mesa;
    private LocalDateTime fechaHora;

    public Reserva(Cliente cliente, Mesa mesa, LocalDateTime fechaHora) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.fechaHora = fechaHora;
    }

    public void mostrarReserva() {
        System.out.println("Reserva de " + cliente.getNombre() +
                " en mesa " + mesa.getId() +
                " para el " + fechaHora);
    }
}
