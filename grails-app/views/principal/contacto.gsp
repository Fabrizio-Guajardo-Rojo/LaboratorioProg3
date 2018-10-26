<!doctype html>
    <html>
    <head>
        <meta name="layout" content="main"/>
        <title>Inmobiliaria</title>
    </head>
    <body>
      <content tag="nav">
          <li class="dropdown">
            <g:link url="[action:'index',controller:'principal']">Inicio </g:link>
          </li>
          <li class="dropdown">
              <g:link url="[action:'propiedades',controller:'principal']">Propiedades </g:link> </a>
          </li>
          <li class="dropdown">
              <g:link url="[action:'contacto',controller:'principal']">Contacto </g:link>
          </li>
          <li class="dropdown">
              <g:link url="[action:'sesion',controller:'principal']">Inicio Sesion </g:link> </a>
          </li>
      </content>


        <div class="jumbotron">
          <div class="container text-center">
            <h1>BIENVENIDOS A BEST-INMOBILIARIA</h1>
            <p>Some text that represents "Me"...</p>
          </div>
        </div>

        <div class="container-fluid bg-3 text-center">
          <h2>Formulario de Contacto</h2><br>
          <div class="row">
            <g:form name="formularioContato" url="[controller:'#',action:'#']">
            <br><br>
              <label for="nombre_formulario">Nombre:</label> <input type="text" id="nombre_formulario" name="nombre_formulario"/>
            <br><br>
              <label for="apellido_formulario">Apeillido:</label> <input type="text" id="apellido_formulario" name="apellido_formulario"/>
            <br><br>
              <label for="telefono_formulario">Telefono:</label> <input type="number" id="telefono_formulario" name="telefono_formulario"/>
            <br><br>
              <label for="domicilio_formulario">Domicilio:</label> <input type="text" id="domicilio_formulario" name="domicilio_formulario"/>
            <br><br>
              <label for="email_formulario">Email:</label> <input type="text" id="email_formulario" name="email_formulario"/>
            <br><br>
              <label for="detalle_formulario">Mensaje / Consulta:</label><textarea class="form-control" rows="5" id="detalle_formulario" name="detalle_formulario"></textarea>
            </g:form>
            <g:submitButton name="create" class="save"
          </div>
        </div><br>


    </body>
    </html>
