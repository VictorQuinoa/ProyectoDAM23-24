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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
