package inmobiliaria

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ClienteCompradorServiceSpec extends Specification {

    ClienteCompradorService clienteCompradorService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ClienteComprador(...).save(flush: true, failOnError: true)
        //new ClienteComprador(...).save(flush: true, failOnError: true)
        //ClienteComprador clienteComprador = new ClienteComprador(...).save(flush: true, failOnError: true)
        //new ClienteComprador(...).save(flush: true, failOnError: true)
        //new ClienteComprador(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //clienteComprador.id
    }

    void "test get"() {
        setupData()

        expect:
        clienteCompradorService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ClienteComprador> clienteCompradorList = clienteCompradorService.list(max: 2, offset: 2)

        then:
        clienteCompradorList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        clienteCompradorService.count() == 5
    }

    void "test delete"() {
        Long clienteCompradorId = setupData()

        expect:
        clienteCompradorService.count() == 5

        when:
        clienteCompradorService.delete(clienteCompradorId)
        sessionFactory.currentSession.flush()

        then:
        clienteCompradorService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ClienteComprador clienteComprador = new ClienteComprador()
        clienteCompradorService.save(clienteComprador)

        then:
        clienteComprador.id != null
    }
}
