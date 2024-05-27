package BaseDeDatos;

import Model.Usuario;

import java.sql.*;

public class BDHandlerUsuario {
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DATABASE_USER = "postgres";
    private static final String DATABASE_PASSWORD = "debian";

    public Usuario selectUsuario(String nombre, String apellido_1, String apellido_2, String dni, String password, String username){
        String SQL_SELECT_inicioSesion = "SELECT * FROM Usuario WHERE dni = ? and username = ?";
        String SQL_INSERT = "INSERT INTO Usuario (dni,nombre,apellido_1,apellido_2,password,username) VALUES (?,?,?,?,?,?)";
        Usuario usuario = null;
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             PreparedStatement preparedStatementSelect = connection.prepareStatement(SQL_SELECT_inicioSesion)) {

            preparedStatementSelect.setString(1, username);
            ResultSet resultSet = preparedStatementSelect.executeQuery();

            if (!resultSet.next()) {
                try (PreparedStatement preparedStatementInsert = connection.prepareStatement(SQL_INSERT)) {
                    preparedStatementInsert.setString(1, nombre);
                    preparedStatementInsert.setString(2, apellido_1);
                    preparedStatementInsert.setString(3, apellido_2);
                    preparedStatementInsert.setString(4, dni);
                    preparedStatementInsert.setString(5, password);
                    preparedStatementInsert.setString(6, username);
                    preparedStatementInsert.executeUpdate();
                    System.out.println("Usuario añadido correctamente.");
                    usuario = new Usuario(nombre, apellido_1, apellido_2, dni, password, username);
                } catch (SQLException e) {
                    System.out.println("Error al añadir el usuario: " + e.getMessage());
                }
            } else {
                System.out.println("El usuario ya existe.");
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar el usuario: " + e.getMessage());
        }
        return usuario;
    }
    public String recuperarPassword(String dni, String username){
        String SQL_SELECT = "SELECT password FROM Usuario WHERE dni = ? and username = ?";
        String password = null;
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             PreparedStatement preparedStatementSelect = connection.prepareStatement(SQL_SELECT)) {

            preparedStatementSelect.setString(1, dni);
            preparedStatementSelect.setString(2, username);
            ResultSet resultSet = preparedStatementSelect.executeQuery();

            if (resultSet.next()) {
                password = resultSet.getString("password");
                System.out.println("Contraseña recuperada correctamente.");
            } else {
                System.out.println("No se encontró un usuario con el DNI y nombre de usuario proporcionados.");
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar la contraseña: " + e.getMessage());
        }
        return password;
    }
}