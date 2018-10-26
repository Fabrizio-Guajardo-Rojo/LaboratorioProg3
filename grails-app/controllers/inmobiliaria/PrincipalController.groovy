package inmobiliaria

class PrincipalController {

  def index() {
    render(view: "/index")
  }

  def contacto(){
    render (view: "contacto")
  }

  def propiedades(){
    render (view: "Propiedades")
  }

  def sesion(){
    render (view: "sesion")
  }


}
