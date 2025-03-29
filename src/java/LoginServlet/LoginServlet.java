
package LoginServlet;

import User.Usuario;
import UserDao.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Llamar al DAO para verificar si el usuario existe y la contraseña es correcta
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = usuarioDAO.obtenerUsuarioPorEmail(email);

        // Verificar si el usuario existe y la contraseña es correcta
        if (usuario != null && usuario.getPassword().equals(password)) {
            // Iniciar sesión: guardar usuario en sesión
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);

            // Redirigir al usuario a la página principal o al dashboard
            response.sendRedirect("index.jsp"); // O a cualquier otra página que desees
        } else {
            // Si el login falla, mostrar mensaje de error
            request.setAttribute("error", "Correo o contraseña incorrectos");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
