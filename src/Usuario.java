public class Usuario {
    private String nombre;
    private String apellidos;
    private String dni;
    private String password;
    private String username;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String dni, String password, String username) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.password = password;
        this.username = username;
    }
}
