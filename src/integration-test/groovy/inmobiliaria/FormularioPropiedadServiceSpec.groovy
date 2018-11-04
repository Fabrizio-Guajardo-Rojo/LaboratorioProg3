package inmobiliaria

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class FormularioPropiedadServiceSpec extends Specification {

    FormularioPropiedadService formularioPropiedadService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new FormularioPropiedad(...).save(flush: true, failOnError: true)
        //new FormularioPropiedad(...).save(flush: true, failOnError: true)
        //FormularioPropiedad formularioPropiedad = new FormularioPropiedad(...).save(flush: true, failOnError: true)
        //new FormularioPropiedad(...).save(flush: true, failOnError: true)
        //new FormularioPropiedad(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //formularioPropiedad.id
    }

    void "test get"() {
        setupData()

        expect:
        formularioPropiedadService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<FormularioPropiedad> formularioPropiedadList = formularioPropiedadService.list(max: 2, offset: 2)

        then:
        formularioPropiedadList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        formularioPropiedadService.count() == 5
    }

    void "test delete"() {
        Long formularioPropiedadId = setupData()

        expect:
        formularioPropiedadService.count() == 5

        when:
        formularioPropiedadService.delete(formularioPropiedadId)
        sessionFactory.currentSession.flush()

        then:
        formularioPropiedadService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        FormularioPropiedad formularioPropiedad = new FormularioPropiedad()
        formularioPropiedadService.save(formularioPropiedad)

        then:
        formularioPropiedad.id != null
    }
}
