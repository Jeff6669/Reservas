package UserDao;

import User.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection conn;

    // Constructor para recibir la conexión
    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }

    public UsuarioDAO() {
        try {
            // Asumiendo que la conexión es local
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bookings", "Admin", "Admin$1234");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para agregar un usuario a la base de datos
    public boolean agregarUsuario(Usuario usuario) {
        // Primero, comprobar si el email ya está registrado
        if (obtenerUsuarioPorEmail(usuario.getEmail()) != null) {
            // Si el email ya existe, no insertamos el usuario
            return false;
        }

        String query = "INSERT INTO usuarios (nombre, email, password) VALUES (?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getPassword());
            int rowsAffected = pst.executeUpdate();

            return rowsAffected > 0; // Retorna true si se insertó con éxito
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para obtener un usuario por email (para login)
    public Usuario obtenerUsuarioPorEmail(String email) {
        String sql = "SELECT * FROM usuarios WHERE email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Usuario(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("email"),
                    rs.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Si no se encuentra el usuario
    }

    // Método para obtener todos los usuarios (opcional)
    public List<Usuario> obtenerTodosLosUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Usuario(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("email"),
                    rs.getString("password")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
