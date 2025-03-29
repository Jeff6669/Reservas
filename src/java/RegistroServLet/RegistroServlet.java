package RegistroServLet;

import User.Usuario;
import UserDao.UsuarioDAO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recoger datos del formulario
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Verificar si los parámetros están vacíos
        if (nombre == null || email == null || password == null || nombre.isEmpty() || email.isEmpty() || password.isEmpty()) {
            // Si algún campo está vacío, enviar un mensaje de error
            request.setAttribute("error", "Por favor, complete todos los campos.");
            request.getRequestDispatcher("/registro.jsp").forward(request, response);
            return;
        }

        // Crear un nuevo usuario
        Usuario nuevoUsuario = new Usuario(0, nombre, email, password);

        // Registrar el usuario en la base de datos
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        boolean registrado = usuarioDAO.agregarUsuario(nuevoUsuario);

        // Redirigir dependiendo del resultado
        if (registrado) {
            response.sendRedirect("login.jsp"); // Redirigir a login si el registro fue exitoso
        } else {
            // Si el registro falla, devolver un mensaje de error
            request.setAttribute("error", "Error al registrar el usuario. Por favor intente de nuevo.");
            request.getRequestDispatcher("/registro.jsp").forward(request, response);
        }
    }
}
