package inmobiliaria

import grails.gorm.transactions.Transactional

@Transactional
class PrincipalService {


  void altaContacto(Map params) {
    def contacto = new Formulario(params).save(flush:true)
  }

}
