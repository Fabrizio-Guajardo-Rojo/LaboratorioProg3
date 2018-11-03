package inmobiliaria

class SecurityInterceptor {

  boolean after() { true }

  void afterView() {
      // no-op
  }

  SecurityInterceptor() {


      match(controller:"principal", action:"contacto")
      match(controller:"principal", action:"contactoGuardarAlta")

  }

  boolean before() {
      if (!session.usuario && actionName != "login") {
          redirect(controller: "login", action: "login")
          return false
      }

      if(controllerName=='principal' && (actionName=='contacto')) {
        if(!session.usuario.getRoles().any{it.authority=='ADMINISTRADOR'}) {
            render(view: "/index", model: [message:'No tiene permisos para la accion solicitada'])
            return false
        }
      }


      return true
  }
}
