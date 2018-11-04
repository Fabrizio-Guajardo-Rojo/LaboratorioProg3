package inmobiliaria

interface IFormularioService {

    Formulario get(Serializable id)

    List<Formulario> list(Map args)

    Long count()

    void delete(Serializable id)

    Formulario save(Formulario formulario)

}
