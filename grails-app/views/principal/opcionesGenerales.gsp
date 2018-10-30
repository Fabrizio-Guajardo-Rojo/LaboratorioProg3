<!doctype html>
    <html>
    <head>
        <meta name="layout" content="main"/>
        <title>Inmobiliaria</title>
    </head>
    <body>
    <content tag="nav">
        <li class="dropdown">
            <g:link url="[action:'sesion',controller:'principal']">Cerrar Sesion </g:link> </a>
        </li>
    </content>


        <div class="jumbotron">
          <div class="container text-center">
            <h1>BIENVENIDOS A BEST-INMOBILIARIA</h1>
          </div>
        </div>


        <div class="container-fluid bg-3 text-center">
<h2> Opciones Generales</h2>
  <ul>

      <li><g:link controller="clienteComprador" action="index">ABM Cliente Comprardo</g:link></li>
      <li><g:link controller="clienteVendedor" action="index">ABM Cliente vendedor</g:link></li>
      <li><g:link controller="propiedades" action="index">ABM Propiedades </g:link></li>
      <li><g:link controller="contratos" action="index">ABM CONTRATOS</g:link></li>
      <li><g:link controller="usuarios" action="index">ABM USUARIOS </g:link></li>
      <li><g:link controller="consultas" action="index">Ver Consultas Pendientes</g:link></li>
      
  </ul>



        </div><br>


    </body>
    </html>
