package inmobiliaria

import grails.gorm.transactions.Transactional
import grails.validation.ValidationException


@Transactional
class PrincipalService {

  List listarPropiedades(){
        def propiedad = Propiedad.findAllByEstado_propiedad("disponible")

        return propiedad
  }

  List listarPropiedadesOfertas(){
        def propiedad = Propiedad.findAllByEstado_propiedadAndTipo_publicidad("disponible","oferta")

        return propiedad
  }

  List propiedadesBarrioLocalidad(String tipo_operacion, String localidad, String barrio) {

        def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.tipo_operacion=:tipo_operaciones and p.localidad=:localidades and p.barrio=:barrios)", [tipo_operaciones: tipo_operacion, localidades: localidad, barrios: barrio])
        return listaPropiedad1
  }

  List propiedadesBarrioLocalidadOferta(String tipo_operacion, String localidad, String barrio) {
        def tipo_publicidad="oferta"
        def listaPropiedad2 = Propiedad.findAll("from Propiedad as p where (p.tipo_operacion=:tipo_operaciones and p.localidad=:localidades and p.barrio=:barrios and p.tipo_publicidad=:tipo_publicidades)", [tipo_operaciones: tipo_operacion, localidades: localidad, barrios: barrio, tipo_publicidades:tipo_publicidad])
        return listaPropiedad2
  }

  void altaContacto(Map params) {
    try {
        def contacto = new Formulario(params)
        contacto.setEstado("no contestada")
        contacto.save(flush:true)
    } catch (ValidationException e) {
        respond contacto.errors, view:'contacto'
        return
    }

  }

}
