import Enums.EstadoHabitacion;
import Enums.MotivoNoDisponible;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static List<Habitacion> habitaciones = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Reserva> reservas = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   SISTEMA DE GESTIÓN HOTELERA - PRUEBAS");
        System.out.println("==================================================");

        cargarDatosDePrueba();

        mostrarHabitaciones();
        mostrarClientes();
        mostrarReservas();

        System.out.println("\nCarga en memoria finalizada exitosamente.");
    }

    private static void cargarDatosDePrueba() {
        System.out.println("\nInicializando datos en memoria");

        Cliente c1 = new Cliente("Juan Perez", "35123456", "Cordoba", "Av. Colon 123");
        Cliente c2 = new Cliente("Maria Lopez", "40987654", "Rosario", "Calle San Martin 456");
        Cliente c3 = new Cliente("Carlos Gomez", "28456123", "Mar del Plata", "Guemes 789");
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        Habitacion h101 = new Habitacion(101, EstadoHabitacion.DISPONIBLE, 2);
        Habitacion h102 = new Habitacion(102, EstadoHabitacion.OCUPADA, 4);
        Habitacion h103 = new Habitacion(103, EstadoHabitacion.NO_DISPONIBLE, MotivoNoDisponible.REPARACION);
        Habitacion h104 = new Habitacion(104, EstadoHabitacion.RESERVADA, 2);
        Habitacion h105 = new Habitacion(105, EstadoHabitacion.NO_DISPONIBLE, MotivoNoDisponible.LIMPIEZA);

        habitaciones.add(h101);
        habitaciones.add(h102);
        habitaciones.add(h103);
        habitaciones.add(h104);
        habitaciones.add(h105);

        Reserva r1 = new Reserva(1, c1, h104, LocalDate.now().plusDays(2), LocalDate.now().plusDays(7));
        Reserva r2 = new Reserva(2, c2, h101, LocalDate.now().plusDays(10), LocalDate.now().plusDays(15));
        reservas.add(r1);
        reservas.add(r2);

        System.out.println("[✓] Se cargaron " + clientes.size() + " clientes, "
                + habitaciones.size() + " habitaciones y "
                + reservas.size() + " reservas.");
    }

    private static void mostrarHabitaciones() {
        System.out.println("\n--- LISTADO DE HABITACIONES ---");
        for (Habitacion h : habitaciones) {
            System.out.println(h.toString());
        }
    }

    private static void mostrarClientes() {
        System.out.println("\n--- LISTADO DE PASAJEROS REGISTRADOS ---");
        for (Cliente c : clientes) {
            System.out.println(c.toString());
        }
    }

    private static void mostrarReservas() {
        System.out.println("\n--- RESERVAS ACTIVAS ---");
        for (Reserva r : reservas) {
            System.out.println(r.toString());
        }
    }
}
