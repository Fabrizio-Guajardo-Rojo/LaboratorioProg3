package inmobiliaria

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class FormularioPropiedadController {

    FormularioPropiedadService formularioPropiedadService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond formularioPropiedadService.formularioMostrar(), model:[formularioPropiedadCount: formularioPropiedadService.count()]
    }

    def show(Long id) {
        respond formularioPropiedadService.get(id)
    }

    def create() {
        respond new FormularioPropiedad(params)
    }

    def save(FormularioPropiedad formularioPropiedad) {
        if (formularioPropiedad == null) {
            notFound()
            return
        }

        try {
            formularioPropiedadService.save(formularioPropiedad)
        } catch (ValidationException e) {
            respond formularioPropiedad.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'formularioPropiedad.label', default: 'FormularioPropiedad'), formularioPropiedad.id])
                redirect formularioPropiedad
            }
            '*' { respond formularioPropiedad, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond formularioPropiedadService.get(id)
    }

    def update(FormularioPropiedad formularioPropiedad) {
        if (formularioPropiedad == null) {
            notFound()
            return
        }

        try {
            formularioPropiedadService.save(formularioPropiedad)
        } catch (ValidationException e) {
            respond formularioPropiedad.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'formularioPropiedad.label', default: 'FormularioPropiedad'), formularioPropiedad.id])
                redirect formularioPropiedad
            }
            '*'{ respond formularioPropiedad, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        formularioPropiedadService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'formularioPropiedad.label', default: 'FormularioPropiedad'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'formularioPropiedad.label', default: 'FormularioPropiedad'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
