<!doctype html>
    <html>
    <head>
        <meta name="layout" content="main3"/>
        <title>Inmobiliaria</title>
    </head>
    <body>

        <div class="container bg-3 text-center">

        <g:if test="${flash.message}">
          <div class="message" role="status">${flash.message}</div>
        </g:if>

          <g:form action="propiedadesBarrioLocalidadOferta" class="form-wrap mt-4">
            <div class="btn-group" role="group" aria-label="Basic example">
                <g:field type="text" placeholder="Venta/Alquiler" name="tipo_operacion" class="btn-group1"/>
                <g:field type="text" placeholder="Localidad" name="localidad" class="btn-group1"/>
                <g:field type="text" placeholder="Barrio" name="barrio" class="btn-group1"/>
                <g:submitButton name="submit" class="btn-form btn-success" value="Buscar"/>
            </div>
          </g:form>
          <br><br>
                <h4 class="logo">RESULTADO DE BUSQUEDA </h4><br>

                <table class="table-bordered">
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

                          <td><g:link class="btn btn-primary" action="formularioPropiedad" controller="principal" id="${it.id}" > ${it.nombre_propiedad}</g:link></td>
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
