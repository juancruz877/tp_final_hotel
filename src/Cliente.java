public class Cliente {

    private String nombre;
    private String dni;
    private String origen;
    private String domicilioOrigen;

    public Cliente(String nombre, String dni, String origen,
                   String domicilioOrigen) {

        this.nombre = nombre;
        this.dni = dni;
        this.origen = origen;
        this.domicilioOrigen = domicilioOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDomicilioOrigen() {
        return domicilioOrigen;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Origen: " + origen);
        System.out.println("Domicilio de origen: " + domicilioOrigen);
    }
}