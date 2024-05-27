package BaseDeDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class ConexionBD {
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DATABASE_USER = "postgres";
    private static final String DATABASE_PASSWORD = "debian";

    public Connection conectar() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            System.out.println("Conexión establecida con la base de datos :).");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return connection;
    }
    public void addUser(String nombre, String apellido_1, String apellido_2, String dni, String password, String username){
        String SQL = "INSERT INTO Usuario (nombre,apellido_1,apellido_2,dni,password,username) VALUES (?,?,?,?,?,?,?)";
        try (Connection connection = conectar();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido_1);
            preparedStatement.setString(3, apellido_2);
            preparedStatement.setString(4, dni);
            preparedStatement.setString(5, password);
            preparedStatement.setString(6, username);
            preparedStatement.executeUpdate();
            System.out.println("Usuario añadido correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al añadir el usuario: " + e.getMessage());
        }
    }

    public void desconectar(Connection connection) {
        try {
            connection.close();
            System.out.println("Conexión cerrada con la base de datos :).");
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión con la base de datos: " + e.getMessage());
        }
    }

}
