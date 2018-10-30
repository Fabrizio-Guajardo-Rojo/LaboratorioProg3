package inmobiliaria

class PrincipalController {

def principalService

def index() {
  render(view: "/index")
}



def propiedades(){
  render (view: "Propiedades")
}

def sesion(){
  render (view: "opcionesGenerales")
}

//FORMULARIO
def contacto(){
  [contacto: new Formulario()]
  render (view: "contacto")
}

def contactoGuardarAlta() {
  principalService.altaContacto(params)
  render (view: "/index")
}

}
