package inmobiliaria

class ClienteComprador extends Cliente{

	String dni_clienteComprador


	static hasMany = [contratos: Contrato]

    String toString (){
    	return this.nombre_cliente + ". " + this.apellido_cliente +"  DNI:"+ this.dni_clienteComprador
    }

    static constraints = {
    	dni_clienteComprador (blank: false, unique: true)
    }
}
