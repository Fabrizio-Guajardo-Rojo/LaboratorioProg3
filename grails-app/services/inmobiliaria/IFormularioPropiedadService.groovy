package inmobiliaria

interface IFormularioPropiedadService {

    FormularioPropiedad get(Serializable id)

    List<FormularioPropiedad> list(Map args)

    Long count()

    void delete(Serializable id)

    FormularioPropiedad save(FormularioPropiedad formularioPropiedad)

}
