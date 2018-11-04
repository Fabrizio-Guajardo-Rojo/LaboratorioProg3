package inmobiliaria

import grails.gorm.services.Service

@Service(Formulario)
abstract class FormularioService implements IFormularioService{

   List formularioMostrar(){

   def formulario = Formulario.findAllByEstado("no contestada")
   return formulario
   }


}
