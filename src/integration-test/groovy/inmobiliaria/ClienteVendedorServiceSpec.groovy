package inmobiliaria

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ClienteVendedorServiceSpec extends Specification {

    ClienteVendedorService clienteVendedorService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ClienteVendedor(...).save(flush: true, failOnError: true)
        //new ClienteVendedor(...).save(flush: true, failOnError: true)
        //ClienteVendedor clienteVendedor = new ClienteVendedor(...).save(flush: true, failOnError: true)
        //new ClienteVendedor(...).save(flush: true, failOnError: true)
        //new ClienteVendedor(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //clienteVendedor.id
    }

    void "test get"() {
        setupData()

        expect:
        clienteVendedorService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ClienteVendedor> clienteVendedorList = clienteVendedorService.list(max: 2, offset: 2)

        then:
        clienteVendedorList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        clienteVendedorService.count() == 5
    }

    void "test delete"() {
        Long clienteVendedorId = setupData()

        expect:
        clienteVendedorService.count() == 5

        when:
        clienteVendedorService.delete(clienteVendedorId)
        sessionFactory.currentSession.flush()

        then:
        clienteVendedorService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ClienteVendedor clienteVendedor = new ClienteVendedor()
        clienteVendedorService.save(clienteVendedor)

        then:
        clienteVendedor.id != null
    }
}
