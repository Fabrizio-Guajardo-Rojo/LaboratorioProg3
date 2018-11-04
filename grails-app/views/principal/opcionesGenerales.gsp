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


        <div class="jumbotron">
          <div class="container text-center">
            <h1>BIENVENIDOS A BEST-INMOBILIARIA</h1>
          </div>
        </div>


        <div class="container-fluid bg-3 text-center">
          <h2> Opciones Generales</h2>
          <ul>
            <li><g:link controller="clienteComprador" action="index">ABM Clientes Comprador</g:link></li>
            <li><g:link controller="clienteVendedor" action="index">ABM Clientes vendedor</g:link></li>
            <li><g:link controller="propiedad" action="index">ABM Propiedades </g:link></li>
            <li><g:link controller="tipoPropiedad" action="index">Agragar tipo de propiedad</g:link></li>
            <li><g:link controller="contrato" action="index">ABM CONTRATOS</g:link></li>
            <li><g:link controller="usuario" action="index">ABM USUARIOS </g:link></li>
            <li><g:link controller="formulario" action="index">Ver Consultas Pendientes de posibles vendedores</g:link></li>
            <li><g:link controller="formularioPropiedad" action="index">Ver Consultas Pendientes Propiedad</g:link></li>
        </ul>

        </div><br>


    </body>
    </html>
