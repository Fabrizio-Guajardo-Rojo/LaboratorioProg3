package inmobiliaria

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ClienteVendedorController {

    ClienteVendedorService clienteVendedorService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond clienteVendedorService.list(params), model:[clienteVendedorCount: clienteVendedorService.count()]
    }

    def show(Long id) {
        respond clienteVendedorService.get(id)
    }

    def create() {
        respond new ClienteVendedor(params)
    }

    def save(ClienteVendedor clienteVendedor) {
        if (clienteVendedor == null) {
            notFound()
            return
        }

        try {
            clienteVendedorService.save(clienteVendedor)
        } catch (ValidationException e) {
            respond clienteVendedor.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'clienteVendedor.label', default: 'ClienteVendedor'), clienteVendedor.id])
                redirect clienteVendedor
            }
            '*' { respond clienteVendedor, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond clienteVendedorService.get(id)
    }

    def update(ClienteVendedor clienteVendedor) {
        if (clienteVendedor == null) {
            notFound()
            return
        }

        try {
            clienteVendedorService.save(clienteVendedor)
        } catch (ValidationException e) {
            respond clienteVendedor.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'clienteVendedor.label', default: 'ClienteVendedor'), clienteVendedor.id])
                redirect clienteVendedor
            }
            '*'{ respond clienteVendedor, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        clienteVendedorService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'clienteVendedor.label', default: 'ClienteVendedor'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'clienteVendedor.label', default: 'ClienteVendedor'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
