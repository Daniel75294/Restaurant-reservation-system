public class Mesa {
    private int id;
    private int capacidad;
    private boolean disponible;

    public Mesa(int id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
        this.disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void reservar() {
        disponible = false;
    }

    public void liberar() {
        disponible = true;
    }

    public int getId() {
        return id;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
