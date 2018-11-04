package inmobiliaria

import grails.rest.RestfulController

class ApiPropiedadesController extends RestfulController<Propiedad> {
  static responseFormats = ['json', 'xml']
  ApiPropiedadesController() {
    super(Propiedad) //Indica al controlador REST qué clase de dominio considerar
  }
}
