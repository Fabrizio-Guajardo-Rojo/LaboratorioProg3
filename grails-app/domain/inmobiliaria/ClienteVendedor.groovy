package inmobiliaria

class ClienteVendedor extends Cliente{

String dni_clienteVendedor

static hasMany = [propiedades: Propiedad , contratos: Contrato]


String toString (){
    	return this.nombre_cliente + ". " + this.apellido_cliente +".  DNI:"+ this.dni_clienteVendedor
    }

    
    static constraints = {
    	dni_clienteVendedor (blank: false, unique: true)
    }


}
