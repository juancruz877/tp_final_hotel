import Enums.EstadoHabitacion;
import Enums.MotivoNoDisponible;

public class Habitacion {

    private int numero;
    private String tipo;
    private int capacidad;
    private EstadoHabitacion estado;
    private MotivoNoDisponible motivo;

    public Habitacion(int numero, String tipo, int capacidad) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.estado = EstadoHabitacion.DISPONIBLE;
        this.motivo = null;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public MotivoNoDisponible getMotivo() {
        return motivo;
    }

    public void ocupar() {
        estado = EstadoHabitacion.OCUPADA;
        motivo = null;
    }

    public void liberar() {
        estado = EstadoHabitacion.DISPONIBLE;
        motivo = null;
    }

    public void ponerNoDisponible(MotivoNoDisponible motivo) {
        estado = EstadoHabitacion.NO_DISPONIBLE;
        this.motivo = motivo;
    }

    public void mostrarDatos() {
        System.out.println("Habitación: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Estado: " + estado);

        if (estado == EstadoHabitacion.NO_DISPONIBLE) {
            System.out.println("Motivo: " + motivo);
        }
    }
}