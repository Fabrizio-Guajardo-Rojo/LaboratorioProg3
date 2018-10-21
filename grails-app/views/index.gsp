<!doctype html>
<html>

<head>
    <meta name="layout" content="main"/>
    <asset:stylesheet src="paginaPrincipal.css"/>
    <title>Welcome to Grails</title>
</head>

<body>
  
  <nav class="navbar navbar-inverse">
    <div class="container-fluid">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">Portfolio</a>
      </div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav">
          <li class="active"><a href="#">Pagina Principal</a></li>
         <!-- <li><a href="#">A cerca </a></li> -->
          <li><a href="#">Propiedades</a></li>
          <li><a href="#">Contacto</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Iniciar Secion </a></li>
        </ul>
      </div>
    </div>
  </nav>

  <div class="jumbotron">
    <div class="container text-center">
      <h1>My Portfolio</h1>
      <p>Some text that represents "Me"...</p>
    </div>
  </div>

  <div class="container-fluid bg-3 text-center">
    <h3>Lista de Ofertas !!!</h3><br>
    <div class="row">
      <div class="col-sm-3">
        <p>Some text..</p>
        <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      </div>
      <div class="col-sm-3">
        <div class="thumbnail">
          <p>Some text..</p>
          <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" style="height:100%">
        </div>
      </div>
      <div class="col-sm-3">
        <div class="thumbnail">
          <p>Some text..</p>
          <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" style="height:100%">
        </div>
      </div>
      <div class="col-sm-3">
        <p>Some text..</p>
        <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      </div>
    </div>
  </div><br>

  <div class="container-fluid bg-3 text-center">
    <div class="row">
      <div class="col-sm-3">
        <p>Some text..</p>
        <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      </div>
      <div class="col-sm-3">
        <p>Some text..</p>
        <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      </div>
      <div class="col-sm-3">
        <p>Some text..</p>
        <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      </div>
      <div class="col-sm-3">
        <p>Some text..</p>
        <img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image">
      </div>
    </div>
  </div><br><br>



  <div id="controllers" role="navigation">
    <h2>Available Controllers:</h2>
        <ul>
          <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
            <li class="controller">
              <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
            </li>
          </g:each>
        </ul>
  </div>


    <footer class="container-fluid text-center footer">
      <p>Derechos Reservados</p>
    </footer>

</body>
</html>
