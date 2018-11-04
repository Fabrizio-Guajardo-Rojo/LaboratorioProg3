package inmobiliaria

class PrincipalController {

    def principalService

    def index() {
      render(view: "/index")
    }


    def propiedades(){
    [listado: principalService.listarPropiedades() ]
    }

    def propiedadesOfertas(){
      [listado: principalService.listarPropiedadesOfertas() ]
    }

    // esto es para buscar por tipo_operacion, barrio y localidad

        def propiedadesBarrioLocalidad(){
        [listaPropiedad1: principalService.propiedadesBarrioLocalidad(params.tipo_operacion, params.localidad, params.barrio)]
    }

        def propiedadesBarrioLocalidadOferta(){
        [listaPropiedad2: principalService.propiedadesBarrioLocalidadOferta(params.tipo_operacion, params.localidad, params.barrio)]
    }

    def opcionesGenerales(){
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


    def formularioPropiedad(){
      render (view:"formularioPropiedad")
    }

}
