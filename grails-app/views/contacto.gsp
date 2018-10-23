<!doctype html>
    <html>
    <head>
        <meta name="layout" content="main"/>
        <title>Inmobiliaria</title>
    </head>
    <body>
        <content tag="nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Inicio </a>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Propiedades </a>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Contacto </a>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Iniciar Sesion </a>
            </li>
        </content>


        <div class="jumbotron">
          <div class="container text-center">
            <h1>BIENVENIDOS A BEST-INMOBILIARIA</h1>
            <p>Some text that represents "Me"...</p>
          </div>
        </div>

        <div class="container-fluid bg-3 text-center">
          <h3>Formulario de Contacto</h3><br>
          <div class="row">
            <g:form name="formularioContato" url="[controller:'#',action:'#']">
              <label for="nombre_formulario">Nombre:</label> <input type="text" id="nombre_formulario" name="nombre_formulario"/>
              <label for="apellido_formulario">Apeillido:</label> <input type="text" id="apellido_formulario" name="apellido_formulario"/>
              <label for="telefono_formulario">Telefono:</label> <input type="number" id="telefono_formulario" name="telefono_formulario"/>
              <label for="domicilio_formulario">Domicilio:</label> <input type="text" id="domicilio_formulario" name="domicilio_formulario"/>
              <label for="email_formulario">Email:</label> <input type="text" id="email_formulario" name="email_formulario"/>
              <label for="detalle_formulario">Mensaje / Consulta:</label><textarea class="form-control" rows="5" id="detalle_formulario" name="detalle_formulario"></textarea>
            </g:form>

          </div>
        </div><br>


    </body>
    </html>
