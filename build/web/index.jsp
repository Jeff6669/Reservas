<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bienvenido - Sistema de Reservas de Eventos</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Poppins', sans-serif;
        }
        .hero-section {
            background: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)), url('https://via.placeholder.com/1920x600');
            background-size: cover;
            background-position: center;
            color: white;
            height: 60vh;
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
        }
        .btn-custom {
            background-color: #007bff;
            color: white;
            font-size: 18px;
            padding: 12px 24px;
            border-radius: 30px;
            transition: 0.3s;
        }
        .btn-custom:hover {
            background-color: #0056b3;
            transform: scale(1.05);
        }
        .card {
            border: none;
            transition: 0.3s;
        }
        .card:hover {
            transform: translateY(-5px);
            box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.2);
        }
        footer {
            background: #343a40;
            color: white;
            padding: 20px 0;
        }
        footer a {
            color: #ffc107;
            text-decoration: none;
        }
        footer a:hover {
            color: #ffca28;
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="hero-section">
        <div>
            <h1 class="display-4 font-weight-bold">Bienvenido al Sistema de Reservas</h1>
            <p class="lead">Reserva tus entradas para los mejores eventos con facilidad.</p>
            <a href="login.jsp" class="btn btn-custom btn-lg">Iniciar sesión</a>
        </div>
    </div>

    <div class="container mt-5">
        <h2 class="text-center mb-4 font-weight-bold">Explora nuestros eventos</h2>
        <div class="row text-center">
            <div class="col-md-4">
                <div class="card mb-4 shadow-sm">
                    <img src="https://via.placeholder.com/300x200" class="card-img-top" alt="Evento 1">
                    <div class="card-body">
                        <h5 class="card-title font-weight-bold">Evento 1</h5>
                        <p class="card-text">Una experiencia única que no te puedes perder.</p>
                        <a href="#" class="btn btn-primary">Ver detalles</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card mb-4 shadow-sm">
                    <img src="https://via.placeholder.com/300x200" class="card-img-top" alt="Evento 2">
                    <div class="card-body">
                        <h5 class="card-title font-weight-bold">Evento 2</h5>
                        <p class="card-text">Vive una noche inolvidable con nosotros.</p>
                        <a href="#" class="btn btn-primary">Ver detalles</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card mb-4 shadow-sm">
                    <img src="https://via.placeholder.com/300x200" class="card-img-top" alt="Evento 3">
                    <div class="card-body">
                        <h5 class="card-title font-weight-bold">Evento 3</h5>
                        <p class="card-text">Una cita imperdible con la mejor música en vivo.</p>
                        <a href="#" class="btn btn-primary">Ver detalles</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="text-center mt-4">
            <a href="events.jsp" class="btn btn-lg btn-custom">Ver todos los eventos</a>
        </div>
    </div>

    <footer class="text-center">
        <p>&copy; 2025 Sistema de Reservas de Eventos. Todos los derechos reservados.</p>
        <p>
            <a href="#">Términos y condiciones</a> | 
            <a href="#">Política de privacidad</a>
        </p>
    </footer>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
