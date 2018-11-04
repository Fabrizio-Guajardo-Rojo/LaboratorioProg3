package inmobiliaria

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TipoPropiedadServiceSpec extends Specification {

    TipoPropiedadService tipoPropiedadService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TipoPropiedad(...).save(flush: true, failOnError: true)
        //new TipoPropiedad(...).save(flush: true, failOnError: true)
        //TipoPropiedad tipoPropiedad = new TipoPropiedad(...).save(flush: true, failOnError: true)
        //new TipoPropiedad(...).save(flush: true, failOnError: true)
        //new TipoPropiedad(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tipoPropiedad.id
    }

    void "test get"() {
        setupData()

        expect:
        tipoPropiedadService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TipoPropiedad> tipoPropiedadList = tipoPropiedadService.list(max: 2, offset: 2)

        then:
        tipoPropiedadList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tipoPropiedadService.count() == 5
    }

    void "test delete"() {
        Long tipoPropiedadId = setupData()

        expect:
        tipoPropiedadService.count() == 5

        when:
        tipoPropiedadService.delete(tipoPropiedadId)
        sessionFactory.currentSession.flush()

        then:
        tipoPropiedadService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TipoPropiedad tipoPropiedad = new TipoPropiedad()
        tipoPropiedadService.save(tipoPropiedad)

        then:
        tipoPropiedad.id != null
    }
}
