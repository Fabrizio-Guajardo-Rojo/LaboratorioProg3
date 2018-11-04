package inmobiliaria

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class FormularioController {

    FormularioService formularioService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond formularioService.formularioMostrar(), model:[formularioCount: formularioService.count()]
    }

    def show(Long id) {
        respond formularioService.get(id)
    }

    def create() {
        respond new Formulario(params)
    }

    def save(Formulario formulario) {
        if (formulario == null) {
            notFound()
            return
        }

        try {
            formularioService.save(formulario)
        } catch (ValidationException e) {
            respond formulario.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'formulario.label', default: 'Formulario'), formulario.id])
                redirect formulario
            }
            '*' { respond formulario, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond formularioService.get(id)
    }

    def update(Formulario formulario) {
        if (formulario == null) {
            notFound()
            return
        }

        try {
            formularioService.save(formulario)
        } catch (ValidationException e) {
            respond formulario.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'formulario.label', default: 'Formulario'), formulario.id])
                redirect formulario
            }
            '*'{ respond formulario, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        formularioService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'formulario.label', default: 'Formulario'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'formulario.label', default: 'Formulario'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
