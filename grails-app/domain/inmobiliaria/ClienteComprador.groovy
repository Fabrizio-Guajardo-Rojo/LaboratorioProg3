package inmobiliaria

class ClienteComprador extends Cliente{
	static hasMany = [contratos: Contrato]
    static constraints = {
    }
}
