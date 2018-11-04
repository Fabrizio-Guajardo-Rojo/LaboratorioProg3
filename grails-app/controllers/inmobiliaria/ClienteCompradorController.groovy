package inmobiliaria

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ClienteCompradorController {

    ClienteCompradorService clienteCompradorService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond clienteCompradorService.list(params), model:[clienteCompradorCount: clienteCompradorService.count()]
    }

    def show(Long id) {
        respond clienteCompradorService.get(id)
    }

    def create() {
        respond new ClienteComprador(params)
    }

    def save(ClienteComprador clienteComprador) {
        if (clienteComprador == null) {
            notFound()
            return
        }

        try {
            clienteCompradorService.save(clienteComprador)
        } catch (ValidationException e) {
            respond clienteComprador.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'clienteComprador.label', default: 'ClienteComprador'), clienteComprador.id])
                redirect clienteComprador
            }
            '*' { respond clienteComprador, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond clienteCompradorService.get(id)
    }

    def update(ClienteComprador clienteComprador) {
        if (clienteComprador == null) {
            notFound()
            return
        }

        try {
            clienteCompradorService.save(clienteComprador)
        } catch (ValidationException e) {
            respond clienteComprador.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'clienteComprador.label', default: 'ClienteComprador'), clienteComprador.id])
                redirect clienteComprador
            }
            '*'{ respond clienteComprador, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        clienteCompradorService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'clienteComprador.label', default: 'ClienteComprador'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'clienteComprador.label', default: 'ClienteComprador'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
