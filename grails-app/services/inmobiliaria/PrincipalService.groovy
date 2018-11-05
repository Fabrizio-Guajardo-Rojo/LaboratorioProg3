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

    //primer if obtiene los tres datos
    if(((tipo_operacion != null) && (!tipo_operacion.equals(""))) && ((localidad != null) && (!localidad.equals(""))) && ((barrio != null) && (!barrio.equals("")))){
      def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.tipo_operacion=:tipo_operaciones and p.localidad=:localidades and p.barrio=:barrios)", [tipo_operaciones: tipo_operacion, localidades: localidad, barrios: barrio])
      return listaPropiedad1
    }
    // segundo if obtiene localidad y barrio
    else if(((tipo_operacion == null) || (tipo_operacion.equals(""))) && ((localidad != null) && (!localidad.equals(""))) && ((barrio != null) && (!barrio.equals("")))){
        def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.localidad=:localidades and p.barrio=:barrios)", [localidades: localidad, barrios: barrio])
        return listaPropiedad1
        }
        //tercer if obtiene tipo_operacion y barrio
        else if(((tipo_operacion != null) && (!tipo_operacion.equals(""))) && ((localidad == null) || (localidad.equals(""))) && ((barrio != null) && (!barrio.equals("")))){
                def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.tipo_operacion=:tipo_operaciones and p.barrio=:barrios)", [tipo_operaciones: tipo_operacion, barrios: barrio])
                return listaPropiedad1
                }
                //cuarto if obtiene tipo_operacion y localidad
                else if(((tipo_operacion != null) && (!tipo_operacion.equals(""))) && ((localidad != null) && (!localidad.equals(""))) && ((barrio == null) || (barrio.equals("")))){
                        def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.tipo_operacion=:tipo_operaciones and p.localidad=:localidades)", [tipo_operaciones: tipo_operacion, localidades: localidad])
                        return listaPropiedad1
                        }
                        // quinto if obtiene tipo_operacion
                        else if(((tipo_operacion != null) && (!tipo_operacion.equals("")))  && ((localidad == null) || (localidad.equals(""))) && ((barrio == null) || (barrio.equals("")))){
                                def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where p.tipo_operacion=:tipo_operaciones", [tipo_operaciones: tipo_operacion])
                                return listaPropiedad1
                                }
                                // sexto if obtiene localidad
                                else if(((tipo_operacion == null) || (tipo_operacion.equals("")))  && ((localidad != null) && (!localidad.equals(""))) && ((barrio == null) || (barrio.equals("")))){
                                        def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where p.localidad=:localidades", [ localidades: localidad])
                                        return listaPropiedad1
                                        }
                                        // septimo if obtiene barrio
                                        else if(((tipo_operacion == null) || (tipo_operacion.equals("")))  && ((localidad == null) || (localidad.equals(""))) && ((barrio != null) && (!barrio.equals("")))){
                                                def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where p.barrio=:barrios", [barrios: barrio])
                                                return listaPropiedad1
                                                }
    }

    List propiedadesBarrioLocalidadOferta(String tipo_operacion, String localidad, String barrio) {

        def tipo_publicidad="oferta"

        //primer if obtiene los tres datos
        if(((tipo_operacion != null) && (!tipo_operacion.equals(""))) && ((localidad != null) && (!localidad.equals(""))) && ((barrio != null) && (!barrio.equals("")))){
          def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.tipo_operacion=:tipo_operaciones and p.localidad=:localidades and p.barrio=:barrios and p.tipo_publicidad=:tipo_publicidades)", [tipo_operaciones: tipo_operacion, localidades: localidad, barrios: barrio, tipo_publicidades:tipo_publicidad])
          return listaPropiedad1
        }
        // segundo if obtiene localidad y barrio
        else if(((tipo_operacion == null) || (tipo_operacion.equals(""))) && ((localidad != null) && (!localidad.equals(""))) && ((barrio != null) && (!barrio.equals("")))){
                def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.localidad=:localidades and p.barrio=:barrios and p.tipo_publicidad=:tipo_publicidades)", [localidades: localidad, barrios: barrio, tipo_publicidades:tipo_publicidad])
                return listaPropiedad1
                }
                //tercer if obtiene tipo_operacion y barrio
                else if(((tipo_operacion != null) && (!tipo_operacion.equals(""))) && ((localidad == null) || (localidad.equals(""))) && ((barrio != null) && (!barrio.equals("")))){
                        def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.tipo_operacion=:tipo_operaciones and p.barrio=:barrios and p.tipo_publicidad=:tipo_publicidades)", [tipo_operaciones: tipo_operacion, barrios: barrio, tipo_publicidades:tipo_publicidad])
                        return listaPropiedad1
                        }
                        //cuarto if obtiene tipo_operacion y localidad
                        else if(((tipo_operacion != null) && (!tipo_operacion.equals(""))) && ((localidad != null) && (!localidad.equals(""))) && ((barrio == null) || (barrio.equals("")))){
                                def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.tipo_operacion=:tipo_operaciones and p.localidad=:localidades and p.tipo_publicidad=:tipo_publicidades)", [tipo_operaciones: tipo_operacion, localidades: localidad, tipo_publicidades:tipo_publicidad])
                                return listaPropiedad1
                                }
                                // quinto if obtiene tipo_operacion
                                else if(((tipo_operacion != null) && (!tipo_operacion.equals("")))  && ((localidad == null) || (localidad.equals(""))) && ((barrio == null) || (barrio.equals("")))){
                                        def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.tipo_operacion=:tipo_operaciones and p.tipo_publicidad=:tipo_publicidades)", [tipo_operaciones: tipo_operacion, tipo_publicidades:tipo_publicidad])
                                        return listaPropiedad1
                                        }
                                        // sexto if obtiene localidad
                                        else if(((tipo_operacion == null) || (tipo_operacion.equals("")))  && ((localidad != null) && (!localidad.equals(""))) && ((barrio == null) || (barrio.equals("")))){
                                                def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.localidad=:localidades and p.tipo_publicidad=:tipo_publicidades)", [ localidades: localidad, tipo_publicidades:tipo_publicidad])
                                                return listaPropiedad1
                                                }
                                                // septimo if obtiene barrio
                                                else if(((tipo_operacion == null) || (tipo_operacion.equals("")))  && ((localidad == null) || (localidad.equals(""))) && ((barrio != null) && (!barrio.equals("")))){
                                                        def listaPropiedad1 = Propiedad.findAll("from Propiedad as p where (p.barrio=:barrios and p.tipo_publicidad=:tipo_publicidades)", [barrios: barrio, tipo_publicidades:tipo_publicidad])
                                                        return listaPropiedad1
                                                        }
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
