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
    public void insercionNuevoUsuario(String nombre, String apellido1, String apellido2, String DNI, String nombre_usuario, String contrasenha){

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido_1(apellido1);
        usuario.setApellido_2(apellido2);
        usuario.setUsername(nombre_usuario);
        usuario.setDni(DNI);
        usuario.setPassword(contrasenha);

        String sql = "INSERT INTO usuario (dni, nombre, apellido_1, apellido_2, nombre_usuario, contrasenha) VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection conn = DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
            PreparedStatement ptms = conn.prepareStatement(sql)){
            ptms.setString(1, usuario.getDni());
            ptms.setString(2,usuario.getNombre());
            ptms.setString(3,usuario.getApellido_1());
            ptms.setString(4,usuario.getApellido_2());
            ptms.setString(5,usuario.getUsername());
            ptms.setString(6,usuario.getPassword());

            ptms.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean doesRowExist(String tableName, String usernameColumnName, String username, String dniColumnName, String dni) {
        String SQL_SELECT = "SELECT 1 FROM " + tableName + " WHERE " + usernameColumnName + " = ? AND " + dniColumnName + " = ?";
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, dni);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return true; // La fila existe
            } else {
                return false; // La fila no existe
            }
        } catch (SQLException e) {
            System.out.println("Error al realizar la consulta: " + e.getMessage());
            return false;
        }
    }

}



