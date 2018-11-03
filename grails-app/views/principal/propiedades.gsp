<!doctype html>
    <html>
    <head>
        <meta name="layout" content="main"/>
        <title>Inmobiliaria</title>
    </head>
    <body>
      <g:if test="${session!=null && session.usuario!=null}">
      <content tag="nav">
          <li>
              <a href="#"><span class="glyphicon glyphicon-user"></span> Usuario: ${session?.usuario?.nombreUsuario}</a>
          </li>
          <li>
            <g:link url="[action:'index',controller:'principal']">Inicio </g:link>
          </li>
          <li>
              <g:link url="[action:'propiedades',controller:'principal']">Propiedades </g:link> </a>
          </li>
          <li>
              <g:link url="[action:'#',controller:'#']">Ofertas </g:link>
          </li>
          <li>
              <g:link url="[action:'contacto',controller:'principal']">Contacto </g:link>
          </li>
          <li>
              <g:link url="[action:'opcionesGenerales',controller:'principal']">Administracion </g:link>
          </li>
          <li>
              <g:link url="[action:'logout',controller:'login']">Cerrar Sesion </g:link> </a>
          </li>
      </content>
    </g:if>

    <g:else>
      <content tag="nav">
        <li class="dropdown">
          <g:link url="[action:'index',controller:'principal']">Inicio </g:link>
        </li>
        <li class="dropdown">
            <g:link url="[action:'propiedades',controller:'principal']">Propiedades </g:link> </a>
        </li>
        <li>
            <g:link url="[action:'#',controller:'#']">Ofertas </g:link>
        </li>
        <li class="dropdown">
            <g:link url="[action:'contacto',controller:'principal']">Contacto </g:link>
        </li>
        <li class="dropdown">
            <g:link url="[action:'login',controller:'login']">Inicio Sesion </g:link> </a>
        </li>
      </content>
    </g:else>

        <div class="jumbotron">
          <div class="container text-center">
            <h1>BIENVENIDOS A BEST-INMOBILIARIA</h1>
            <p>Some text that represents "Me"...</p>
          </div>
        </div>


        <div class="container-fluid bg-3 text-center">




        </div><br>


    </body>
    </html>
