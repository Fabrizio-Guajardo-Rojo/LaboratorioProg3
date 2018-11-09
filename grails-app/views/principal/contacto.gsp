<!doctype html>
<html>
    <head>
        <meta name="layout" content="main3"/>
        <title>Inmobiliaria</title>
    </head>
    <body>

      <div class="container text-center"><br><br><br><br>
        <h4 class="letra1">Formulario de Contacto</h4>
      </div>
      <section class="contact_area p_120">
          <div class="container">
              <div class="row">
                  <div class="col-lg-12 comment-form">
                      <g:form class="row contact_form" novalidate="novalidate" name="formularioPropiededad" action="formularioPropiedadGuardarAlta">
                          <div class="col-md-6">
                              <div class="form-group">
                                  <label for="nombre_formulario">Nombre:</label><input type="text" class="form-control" id="nombre_formulario" name="nombre_formulario" placeholder="Ingrese Nombre"/>
                              </div>
                              <div class="form-group">
                                  <label for="apellido_formulario">Apeillido:</label><input type="text" class="form-control" id="apellido_formulario" name="apellido_formulario" placeholder="Ingrese Apellido"/>
                              </div>
                              <div class="form-group">
                                  <label for="telefono_formulario">Telefono:</label> <input type="text" class="form-control" id="telefono_formulario" name="telefono_formulario" placeholder="Ingrese Telefono"/>
                              </div>
                              <div class="form-group">
                                  <label for="domicilio_formulario">Domicilio:</label> <input type="text" class="form-control" id="domicilio_formulario" name="domicilio_formulario" placeholder="Ingrese Domicilio" />
                              </div>
                          </div>
                          <div class="col-md-6">
                              <div class="form-group">
                                  <label for="email_formulario">Email:</label> <input type="text" class="form-control" id="email_formulario" name="email_formulario" placeholder="Ingrese Email"/>
                              </div>
                              <div class="form-group">
                                  <label for="detalle_formulario">Mensaje / Consulta:</label><textarea class="form-control" id="detalle_formulario" name="detalle_formulario" rows="1" placeholder="Mensaje"></textarea>
                              </div>
                          </div>
                          <div class="col-md-12 text-right">
                              <button type="submit" value="submit" class="banner_btn">Enviar Formulario</button>
                          </div>
                      </g:form>
                  </div>
              </div>
          </div>
      </section>


    </body>
</html>
