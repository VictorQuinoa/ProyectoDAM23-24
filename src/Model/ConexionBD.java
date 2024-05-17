package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:postgresql://localhost:5432/mi_base_de_datos";
    private static final String USER = "postgres";
    private static final String PASSWORD = "tu_contraseña";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Carga el controlador de la base de datos
            Class.forName("org.postgresql.Driver");

            // Establece la conexión con la base de datos
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos!");

            // Ejemplo de una consulta
            String query = "SELECT * FROM usuarios";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Procesa los resultados
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombreUsuario = resultSet.getString("nombre_usuario");
                String hashContraseña = resultSet.getString("hash_contraseña");
                String salContraseña = resultSet.getString("sal_contraseña");

                System.out.println("ID: " + id);
                System.out.println("Nombre de Usuario: " + nombreUsuario);
                System.out.println("Hash de la Contraseña: " + hashContraseña);
                System.out.println("Sal de la Contraseña: " + salContraseña);
                System.out.println("---");
            }

            // Cierra el ResultSet y el PreparedStatement
            resultSet.close();
            statement.close();

        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo encontrar el controlador de la base de datos.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        } finally {
            // Asegura que la conexión se cierre
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Conexión cerrada.");
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión.");
                    e.printStackTrace();
                }
            }
        }
    }
}