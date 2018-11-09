<!doctype html>
<html>
<head>
    <meta name="layout" content="main2"/>
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
            <g:link url="[action:'propiedadesOfertas',controller:'principal']">Ofertas </g:link>
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
          <g:link url="[action:'propiedadesOfertas',controller:'principal']">Ofertas </g:link>
      </li>
      <li class="dropdown">
          <g:link url="[action:'contacto',controller:'principal']">Contacto </g:link>
      </li>
      <li class="dropdown">
          <g:link url="[action:'login',controller:'login']">Inicio Sesion </g:link> </a>
      </li>
    </content>
    </g:else>
    
    <div class="container">
    <g:if test="${message}">
      <div class="message" role="status">${message}</div>
    </g:if>
      <h1>Login de Usuario</h1>
      <g:form controller="login" action="login" method="post">
          <label for='email'>Ingrese su Email registrado:</label>
          <input type='email' id='email' name='email' required/>
          <br><br>
          <label for='password'>Ingrese su Contraseña:</label>
          <input type="password" id='password' name='password' required/>
          <br><br>
          <input type="submit" value="Login"/>
      </g:form>
    </div>

</body>
</html>
