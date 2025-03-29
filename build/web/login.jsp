<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Sistema de Reservas</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h2 class="text-center mt-5">Iniciar sesión</h2>
        <form action="LoginServlet" method="post" class="mt-4">
            <div class="form-group">
                <label for="email">Correo electrónico:</label>
                <input type="email" id="email" name="email" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="password">Contraseña:</label>
                <input type="password" id="password" name="password" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Iniciar sesión</button>
        </form>
        <p class="text-center mt-3">
            ¿No tienes cuenta? <a href="Registro.jsp">Regístrate aquí</a>
        </p>
    </div>
</body>
</html>
<!-- Mostrar mensaje de error si existe -->
<c:if test="${not empty error}">
    <div class="alert alert-danger text-center">${error}</div>
</c:if>
