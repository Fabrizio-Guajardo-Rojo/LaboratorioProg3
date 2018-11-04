package inmobiliaria

import grails.gorm.services.Service

@Service(Formulario)
abstract class FormularioPropiedadService implements IFormularioPropiedadService{

   List formularioMostrar(){

   def formulario = FormularioPropiedad.findAllByEstado("no contestada")
   return formulario
   }


}
