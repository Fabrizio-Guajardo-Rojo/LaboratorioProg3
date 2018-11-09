<!doctype html>
    <html>
    <head>
        <meta name="layout" content="main3"/>
        <title>Inmobiliaria</title>
    </head>
    <body>

        <section class="portfolio_details_area p_120">
              	<div class="container">
              		<div class="portfolio_details_inner">
                    <div class="container text-center">
                      <h4 class="letra1">Detalles de la Propiedad</h4><br><br><br><br>
                    </div>

      					<div class="row">
      						<div class="col-md-6">
      							<div class="left_img">
      								<asset:image src="imagenCasa.jpg"/>
      							</div>
      						</div>
      						<div class="col-md-6">
      							<div class="portfolio_right_text">
      								<h4>${propiedad.nombre_propiedad}</h4>
      								<ul class="list">
      									<li><h5 class="span1">Tipo Propiedad: ${propiedad.tipoPropiedad.nombre_tipo}</h5></li>
      									<li><h5 class="span1">Localidad: ${propiedad.localidad}</h5></li>
      									<li><h5 class="span1">Barrio: ${propiedad.barrio}</h5></li>
      									<li><h5 class="span1">Calle: ${propiedad.calle}</h5></li>
                        <li><h5 class="span1">Num. Calle: ${propiedad.numeroCalle}</h5></li>
      									<li><h5 class="span1">Precio: $${propiedad.precio}</h5></li>
      									<li><h5 class="span1">Tipo Operación: ${propiedad.tipo_operacion}</h5></li>
                        <li><h5 class="span1">Num. Departamento: ${propiedad.numeroDepartamento}</h5></li>
                        <li><h5 class="span1">Piso Departamento: ${propiedad.piso}</h5></li>
                        <li><h5 class="span1">Cant. Habitaciones: ${propiedad.cantidadHabitaciones}</h5></li>
                        <li><h5 class="span1">Cant. Baños: ${propiedad.cantidadBanios}</h5></li>
                      </ul>
      							</div>
      						</div>
      					</div>
                  	<div class="portfolio_right_text">
                      <ul class="list">
                        <li><h5 class="span2">Descripcion: ${propiedad.descripcion}</h5></li><br>
                      </ul>
                    </div>

              		</div>
              	</div>
            </section>
            <br><br><br>

            <!--================Contact Area =================-->
            <div class="container text-center">
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
                                        <label for="domicilio_formulario">Domicilio:</label> <input type="text" class="form-control" id="domicilio_formulario" name="domicilio_formulario" placeholder="Ingrese Domicilio"/>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="email_formulario">Email:</label> <input type="text" class="form-control" id="email_formulario" name="email_formulario" placeholder="Mensaje"/>
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
            <!--================Contact Area =================-->




        <!-- ANTIGUO FORMULARIO


        <div class="container-fluid bg-3 text-center">
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


          <label for="propiedad">pripiedad de la consulta</label>
          <label id ="propiedad" name="propiedad">${propiedad.id}</label>
          <br><br>

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

          </g:form>
        </div>

        </div><br>

-->


    </body>
    </html>
