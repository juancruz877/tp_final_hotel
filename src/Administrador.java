public class Administrador extends Usuario {

    public Administrador(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("Permisos de Administrador:");
        System.out.println("- Acceso completo al sistema");
        System.out.println("- Gestión de usuarios");
        System.out.println("- Configuración del sistema");
    }
}
