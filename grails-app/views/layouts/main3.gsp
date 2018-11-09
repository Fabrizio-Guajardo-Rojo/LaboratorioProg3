<!doctype html>
  <html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <asset:link rel="icon" href="iconoPagina.ico" type="image/x-ico" />
        <title>Inmobiliaria</title>
        <!-- Bootstrap CSS -->
        <asset:stylesheet src="bootstrap2.css"/>
        <asset:stylesheet src="style.css"/>
        <asset:stylesheet src="font-awesome.min.css"/>
        <asset:stylesheet src="owl.carousel.min.css"/>
        <asset:stylesheet src="simpleLightbox.css"/>
        <asset:stylesheet src="nice-select.css"/>
        <asset:stylesheet src="animate.css"/>
        <asset:stylesheet src="magnific-popup.css"/>
        <!-- main css -->
        <asset:stylesheet src="style.css"/>
        <asset:stylesheet src="responsive.css"/>
        <asset:stylesheet src="estilos1.css"/>

        <g:layoutHead/>

    </head>

    <body data-spy="scroll" data-target="#mainNav" data-offset="70">

        <!--================Header Menu Area =================-->
        <header class="header_area">
            <div class="main_menu" id="mainNav">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <div class="container box_1620">
                      <!-- Brand and toggle get grouped for better mobile display -->
                      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                      </button>
                      <!-- Collect the nav links, forms, and other content for toggling -->
                      <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                        <g:if test="${session!=null && session.usuario!=null}">
                        <ul class="nav navbar-nav menu_nav ml-auto">
                          <li class="nav-item"><a class="nav-link" href="#">Usuario: ${session?.usuario?.nombreUsuario}</a></li>
                          <li class="nav-item"><g:link class="nav-link" url="[action:'index',controller:'principal']">Inicio </g:link></li>
                          <li class="nav-item"><g:link class="nav-link" url="[action:'propiedades',controller:'principal']">Porpiedades </g:link></li>
                          <li class="nav-item"><g:link class="nav-link" url="[action:'propiedadesOfertas',controller:'principal']">Ofertas </g:link></li>
                          <li class="nav-item"><g:link class="nav-link" url="[action:'contacto',controller:'principal']">Contacto </g:link></li>
                          <li class="nav-item"><g:link class="nav-link" url="[action:'opcionesGenerales',controller:'principal']">Administración </g:link></li>
                          <li class="nav-item"><g:link class="nav-link" url="[action:'logout',controller:'login']">Cerrar Sesión </g:link></li>
                        </ul>
                      </g:if>

                      <g:else>
                        <ul class="nav navbar-nav menu_nav ml-auto">
                          <li class="nav-item"><g:link class="nav-link" url="[action:'index',controller:'principal']">Inicio </g:link></li>
                          <li class="nav-item"><g:link class="nav-link" url="[action:'propiedades',controller:'principal']">Porpiedades </g:link></li>
                          <li class="nav-item"><g:link class="nav-link" url="[action:'propiedadesOfertas',controller:'principal']">Ofertas </g:link></li>
                          <li class="nav-item"><g:link class="nav-link" url="[action:'contacto',controller:'principal']">Contacto </g:link></li>
                          <li class="nav-item"><g:link class="nav-link" url="[action:'login',controller:'login']">Iniciar Sesión </g:link></li>
                        </ul>
                      </g:else>
                      </div>
                    </div>
                </nav>
            </div>
        </header>
        <!--================Header Menu Area =================-->

        <!--================Home Banner Area =================-->
        <section class="home_banner_area" id="home">
            <div class="banner_inner">
                <div class="container">
                    <div class="banner_content text-center">
                        <h2>Best-Inmobiliaria</h2>
                    </div>
                </div>
            </div>
        </section>

          <g:layoutBody/>



        <!--================Footer Area =================-->
        <footer class="footer_area p_120">
            <div class="container">

                <div class="copy_right_text">
                    <p>Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | Programacion 3 - <a href="http://tecno.unca.edu.ar">Tecno UNCa</a></p>
                </div>
            </div>
        </footer>
        <!--================End Footer Area =================-->




        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <asset:javascript src="jquery-3.2.1.min.js"/>
        <asset:javascript src="popper.js"/>
        <asset:javascript src="bootstrap.min.js"/>
        <asset:javascript src="stellar.js"/>
        <asset:javascript src="simpleLightbox.min.js"/>
        <asset:javascript src="jquery.nice-select.min.js"/>
        <asset:javascript src="imagesloaded.pkgd.min.js"/>
        <asset:javascript src="isotope-min.js"/>
        <asset:javascript src="owl.carousel.min.js"/>
        <asset:javascript src="jquery.ajaxchimp.min.js"/>
        <asset:javascript src="jquery.waypoints.min.js"/>
        <asset:javascript src="jquery.counterup.js"/>
        <asset:javascript src="mail-script.js"/>
        <asset:javascript src="jquery.magnific-popup.min.js"/>
        <asset:javascript src="theme.js"/>
    </body>

  </html>
