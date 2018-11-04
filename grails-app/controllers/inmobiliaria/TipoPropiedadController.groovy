package inmobiliaria

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class TipoPropiedadController {

    TipoPropiedadService tipoPropiedadService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond tipoPropiedadService.list(params), model:[tipoPropiedadCount: tipoPropiedadService.count()]
    }

    def show(Long id) {
        respond tipoPropiedadService.get(id)
    }

    def create() {
        respond new TipoPropiedad(params)
    }

    def save(TipoPropiedad tipoPropiedad) {
        if (tipoPropiedad == null) {
            notFound()
            return
        }

        try {
            tipoPropiedadService.save(tipoPropiedad)
        } catch (ValidationException e) {
            respond tipoPropiedad.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'tipoPropiedad.label', default: 'TipoPropiedad'), tipoPropiedad.id])
                redirect tipoPropiedad
            }
            '*' { respond tipoPropiedad, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond tipoPropiedadService.get(id)
    }

    def update(TipoPropiedad tipoPropiedad) {
        if (tipoPropiedad == null) {
            notFound()
            return
        }

        try {
            tipoPropiedadService.save(tipoPropiedad)
        } catch (ValidationException e) {
            respond tipoPropiedad.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'tipoPropiedad.label', default: 'TipoPropiedad'), tipoPropiedad.id])
                redirect tipoPropiedad
            }
            '*'{ respond tipoPropiedad, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        tipoPropiedadService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'tipoPropiedad.label', default: 'TipoPropiedad'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'tipoPropiedad.label', default: 'TipoPropiedad'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
