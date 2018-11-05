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





        <!--aqui es una tabla de todas las propiedades  -->
        <div class="container-fluid bg-3 text-center">


        <br><br>
        <div class="container">
          <div class="container text-center">
            <h2 class="tamanioLetra2">Detalles de la Propiedad</h2>
            <br>
            <table class="table">
               <tr class="success">    <td><p class="tamanioLetra">Propiedad</p></td> <td><p class="tamanioLetra">${propiedad.nombre_propiedad}</p></td> </tr>
               <tr class="info">       <td><p class="tamanioLetra">Localidad</p></td>  <td><p class="tamanioLetra">${propiedad.localidad}</p></td>  </tr>
               <tr class="success">    <td><p class="tamanioLetra">Barrio</p></td><td><p class="tamanioLetra">${propiedad.barrio}</p></td> </tr>
               <tr class="info">       <td><p class="tamanioLetra">Precio</p></td><td><p class="tamanioLetra">${propiedad.precio}</p></td> </tr>
               <tr class="success">    <td><p class="tamanioLetra">Calle</p></td> <td><p class="tamanioLetra">${propiedad.tipo_operacion}</p></td></tr>
               <tr class="info">       <td><p class="tamanioLetra">Tipo Propiedad</p></td> <td><p class="tamanioLetra">${propiedad.tipoPropiedad.nombre_tipo}</p></td> </tr>
               <tr class="success">    <td><p class="tamanioLetra">Calle</p></td> <td><p class="tamanioLetra">${propiedad.calle}</p></td> </tr>
               <tr class="info">       <td><p class="tamanioLetra">Numero Calle</p></td> <td><p class="tamanioLetra">${propiedad.numeroCalle}</p></td> </tr>
               <tr class="success">    <td><p class="tamanioLetra">Numero Departamento</p></td> <td><p class="tamanioLetra">${propiedad.numeroDepartamento}</p></td> </tr>
               <tr class="info">       <td><p class="tamanioLetra">Piso Departamento</p></td> <td><p class="tamanioLetra">${propiedad.piso}</p></td> </tr>
               <tr class="success">    <td><p class="tamanioLetra">Cant. Habitaciones</p></td> <td><p class="tamanioLetra">${propiedad.cantidadHabitaciones}</p></td> </tr>
               <tr class="info">       <td><p class="tamanioLetra">Cant. Baños</p></td> <td><p class="tamanioLetra">${propiedad.cantidadBanios}</p></td> </tr>
               <tr class="success">    <td><p class="tamanioLetra">Descripcion</p></td> <td><p class="tamanioLetra">${propiedad.descripcion}</p></td> </tr>

            </table>
          </div>
        </div>




        <br><br><br>

        <h2 class="tamanioLetra2">Formulario</h2><br>
        <div class="row">
          <g:form name="formularioPropiededad" action="formularioPropiedadGuardarAlta">


          <br><br>
          <label for="propiedad">Propiedad de la consulta</label>
          <select id ="propiedad" name="propiedad">
            <option>
            ${propiedad.id}
            </option>
          </select>
          <br><br>

<!--
          <label for="propiedad">pripiedad de la consulta</label>
          <label id ="propiedad" name="propiedad">${propiedad.id}</label>
          <br><br>
-->
            <label for="nombre_formulario">Nombre:</label> <input type="text" id="nombre_formulario" name="nombre_formulario"/>
          <br><br>
            <label for="apellido_formulario">Apeillido:</label> <input type="text" id="apellido_formulario" name="apellido_formulario"/>
          <br><br>
            <label for="telefono_formulario">Telefono:</label> <input type="text" id="telefono_formulario" name="telefono_formulario"/>
          <br><br>
            <label for="domicilio_formulario">Domicilio:</label> <input type="text" id="domicilio_formulario" name="domicilio_formulario"/>
          <br><br>
            <label for="email_formulario">Email:</label> <input type="text" id="email_formulario" name="email_formulario"/>
          <br><br>
            <label for="detalle_formulario">Mensaje / Consulta:</label> <textarea class="form-control" rows="5" id="detalle_formulario" name="detalle_formulario"></textarea>
          <br><br>

          <input type="submit" class="btn btn-default" name="enviar" value="Enviar Formulario"/>
          <br><br>


          <button type="reset" class="btn btn-default">Borrar Datos<button/>
          </g:form>
        </div>




        </div><br>




    </body>
    </html>
