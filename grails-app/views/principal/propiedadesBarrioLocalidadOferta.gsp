<!doctype html>
    <html>
    <head>
        <meta name="layout" content="main3"/>
        <title>Inmobiliaria</title>
    </head>
    <body>

        <div class="container bg-3 text-center">
        <g:if test="${flash.message}">
          <br><br>
          <div class="message" role="status">${flash.message}</div>
        </g:if>
        </div>

        <section class="our_blog_area p_120">
         <div class="container">
           <div class="main_title">
             <h2>Propiedades en Oferta</h2>
             <br><br>
             <g:form action="propiedadesBarrioLocalidadOferta">
               <div class="btn-group" role="group" aria-label="Basic example">
                   <g:field type="text" placeholder="Venta/Alquiler" name="tipo_operacion" class="btn-group1"/>
                   <g:field type="text" placeholder="Localidad" name="localidad" class="btn-group1"/>
                   <g:field type="text" placeholder="Barrio" name="barrio" class="btn-group1"/>
                   <g:submitButton name="submit" class="banner_btn" value="Buscar"/>
               </div>
             </g:form>
           </div>
           <div class="conteiner text-center">
             <h5 class="letra2">Resultado de la Busqueda</h5><br><br>
           </div>
           <div class="blog_inner row">

             <g:each in="${listaPropiedad2?}">
             <div class="col-lg-4">
               <div class="o_blog_item">
                 <div class="blog_img">
                   <asset:image class="img-fluid" src="our-blog-3.jpg" alt=""/>
                 </div>
                 <div class="blog_text">
                   <a><h4>Propiedad: ${it.nombre_propiedad}</h4></a>

                   <p>Tipo Propiedad: ${it.tipoPropiedad.nombre_tipo}<br>Localidad: ${it.localidad}<br>Barrio: ${it.barrio}<br>Calle:  Av. Presidente Castillo<br>Detalle: ${it.tipo_publicidad}<br></p>
                   <p><span>Precio</span>: $${it.precio}</p>
                   <p><span>Tipo Operacion</span>: ${it.tipo_operacion}</p>
                   <g:link class="banner_btn" action="formularioPropiedad" controller="principal" id="${it.id}" >Ver Detalles</g:link>
                 </div>
               </div>
             </div>
             </g:each>
           </div>
         </div>
       </section>






    </body>
    </html>
