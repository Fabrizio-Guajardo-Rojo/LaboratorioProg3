package inmobiliaria

import grails.gorm.services.Service

@Service(TipoPropiedad)
interface TipoPropiedadService {

    TipoPropiedad get(Serializable id)

    List<TipoPropiedad> list(Map args)

    Long count()

    void delete(Serializable id)

    TipoPropiedad save(TipoPropiedad tipoPropiedad)

}