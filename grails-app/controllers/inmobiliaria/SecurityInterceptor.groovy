package inmobiliaria

class SecurityInterceptor {

  boolean after() { true }

  void afterView() {
      // no-op
  }

  SecurityInterceptor() {

      match(controller:"principal", action:"opcionesGenerales")

      match(controller:"clienteComprador", action:"index")
      match(controller:"clienteComprador", action:"create")
      match(controller:"clienteComprador", action:"edit")
      match(controller:"clienteComprador", action:"show")

      match(controller:"clienteVendedor", action:"index")
      match(controller:"clienteVendedor", action:"create")
      match(controller:"clienteVendedor", action:"edit")
      match(controller:"clienteVendedor", action:"show")

      match(controller:"contrato", action:"index")
      match(controller:"contrato", action:"create")
      match(controller:"contrato", action:"edit")
      match(controller:"contrato", action:"show")

      match(controller:"formulario", action:"index")
      match(controller:"formulario", action:"create")
      match(controller:"formulario", action:"edit")
      match(controller:"formulario", action:"show")

      match(controller:"formularioPropiedad", action:"index")
      match(controller:"formularioPropiedad", action:"create")
      match(controller:"formularioPropiedad", action:"edit")
      match(controller:"formularioPropiedad", action:"show")

      match(controller:"propiedad", action:"index")
      match(controller:"propiedad", action:"create")
      match(controller:"propiedad", action:"edit")
      match(controller:"propiedad", action:"show")

      match(controller:"tipoPropiedad", action:"index")
      match(controller:"tipoPropiedad", action:"create")
      match(controller:"tipoPropiedad", action:"edit")
      match(controller:"tipoPropiedad", action:"show")


  }

  boolean before() {
      if (!session.usuario && actionName != "login") {
          redirect(controller: "login", action: "login")
          return false
      }

      if(controllerName=='contrato' && (actionName=='edit' || actionName=='save' || actionName=='create' || actionName=='delete' )) {
        if(!session.usuario.getRoles().any{it.authority=='ADMINISTRADOR'}) {
            render(view: "/principal/opcionesGenerales", model: [message:'No tiene permisos para la accion solicitada'])
            return false
        }
      }


      return true
  }
}
