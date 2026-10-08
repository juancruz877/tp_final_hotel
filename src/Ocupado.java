import java.time.LocalDate

public class Ocupacion {

    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Ocupacion (cliente, habitacion, LocalDate checkIn) {

        this.cliente = cliente;
        this.habitacion = habitacion;
        this.checkIn = checkIn;
        this.checkOut = null;

    }

    public void realizarCheckOut(){
        checkOut = LocalDate.now();
        habitacion.liberar();
    }

    public boolean estaActiva(){
        return checkOut == null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }
}

