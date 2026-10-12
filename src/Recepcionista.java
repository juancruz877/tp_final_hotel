public class Recepcionista extends Usuario {

    public Recepcionista(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("Permisos de Recepcionista:");
        System.out.println("- Acceso a la recepción");
        System.out.println("- Gestión de ");
        System.out.println("- Atención al cliente");
    }
