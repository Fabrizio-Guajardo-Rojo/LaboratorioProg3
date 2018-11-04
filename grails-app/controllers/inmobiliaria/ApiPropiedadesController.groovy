package inmobiliaria

import grails.rest.RestfulController

class ApiPropiedadesController extends RestfulController<Propiedad> {
  static responseFormats = ['json', 'xml']


  ApiPropiedadesController() {
    super(Propiedad) //Indica al controlador REST qué clase de dominio considerar
  }


  def lisApiPropiedadesPorTipoOperacion (String p) {
      if (p) {
      respond Propiedad.findAllByTipo_operacion(p)
      }
      else {
      respond([])
      }
    }

    def lisApiPropiedadesPorTipoPublicidad (String p) {
        if (p) {
        respond Propiedad.findAllByTipo_publicidad(p)
        }
        else {
        respond([])
        }
      }
}
