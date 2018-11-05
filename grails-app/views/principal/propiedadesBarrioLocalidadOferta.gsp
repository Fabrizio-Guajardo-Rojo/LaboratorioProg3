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



        <div class="container bg-3 text-center">

        <g:if test="${flash.message}">
          <div class="message" role="status">${flash.message}</div>
        </g:if>

          <g:form action="propiedadesBarrioLocalidadOferta" class="form-wrap mt-4">
            <div class="btn-group" role="group" aria-label="Basic example">
                <g:field type="text" placeholder="Venta/Alquiler" name="tipo_operacion" class="btn-group1"/>
                <g:field type="text" placeholder="Localidad" name="localidad" class="btn-group1"/>
                <g:field type="text" placeholder="Barrio" name="barrio" class="btn-group1"/>
                <g:submitButton name="submit" class="btn-form" value="Buscar"/>
            </div>
          </g:form>
          <br><br>
                <h4 class="logo">RESULTADO DE BUSQUEDA </h4>

                <table>
                    <tr>
                        <td>Propiedad</td>
                        <td>Localidad</td>
                        <td>Barrio</td>
                        <td>Precio</td>
                        <td>Descripcion</td>
                        <td>Tipo Operacion</td>
                        <td>Tipo Propiedad</td>

                    </tr>
                    <g:each in="${listaPropiedad2?}">
                    <tr>

                          <td><g:link action="formularioPropiedad" controller="principal" id="${it.id}" > ${it.nombre_propiedad}</g:link></td>
                          <td>${it.localidad}</td>
                          <td>${it.barrio}</td>
                          <td>${it.precio}</td>
                          <td>${it.descripcion}</td>
                          <td>${it.tipo_operacion}</td>
                          <td>${it.tipoPropiedad.nombre_tipo}</td>

                    </tr>
                    </g:each>
                </table>
        </div><br>




    </body>
    </html>
