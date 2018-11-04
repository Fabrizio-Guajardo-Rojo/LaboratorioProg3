package inmobiliaria

import grails.gorm.services.Service

@Service(ClienteComprador)
interface ClienteCompradorService {

    ClienteComprador get(Serializable id)

    List<ClienteComprador> list(Map args)

    Long count()

    void delete(Serializable id)

    ClienteComprador save(ClienteComprador clienteComprador)

}