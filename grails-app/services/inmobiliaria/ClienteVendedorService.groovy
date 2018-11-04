package inmobiliaria

import grails.gorm.services.Service

@Service(ClienteVendedor)
interface ClienteVendedorService {

    ClienteVendedor get(Serializable id)

    List<ClienteVendedor> list(Map args)

    Long count()

    void delete(Serializable id)

    ClienteVendedor save(ClienteVendedor clienteVendedor)

}