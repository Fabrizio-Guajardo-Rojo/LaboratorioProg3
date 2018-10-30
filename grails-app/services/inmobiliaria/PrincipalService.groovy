package inmobiliaria

import grails.gorm.transactions.Transactional
import grails.validation.ValidationException


@Transactional
class PrincipalService {


  void altaContacto(Map params) {
    try {
        def contacto = new Formulario(params).save(flush:true)
    } catch (ValidationException e) {
        respond contacto.errors, view:'contacto'
        return
    }

  }

}
