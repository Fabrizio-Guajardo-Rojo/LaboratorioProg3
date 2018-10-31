<!doctype html>
    <html>
    <head>
        <meta name="layout" content="main"/>
        <title>Inmobiliaria</title>
    </head>
    <body>
    <content tag="nav">
        <li class="dropdown">
            <g:link url="[action:'logout',controller:'login']">Cerrar Sesion </g:link> </a>
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

      <li><g:link controller="clienteComprador" action="index">ABM Clientes Comprardo</g:link></li>
      <li><g:link controller="clienteVendedor" action="index">ABM Clientes vendedor</g:link></li>
      <li><g:link controller="propiedad" action="index">ABM Propiedades </g:link></li>
      <li><g:link controller="contrato" action="index">ABM CONTRATOS</g:link></li>
      <li><g:link controller="usuario" action="index">ABM USUARIOS </g:link></li>
      <li><g:link controller="formulario" action="index">Ver Consultas Pendientes</g:link></li>

  </ul>



        </div><br>


    </body>
    </html>
