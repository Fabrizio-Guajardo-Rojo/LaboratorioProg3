package inmobiliaria

import grails.gorm.services.Service

@Service(FormularioPropiedad)
interface FormularioPropiedadService {

    FormularioPropiedad get(Serializable id)

    List<FormularioPropiedad> list(Map args)

    Long count()

    void delete(Serializable id)

    FormularioPropiedad save(FormularioPropiedad formularioPropiedad)

}