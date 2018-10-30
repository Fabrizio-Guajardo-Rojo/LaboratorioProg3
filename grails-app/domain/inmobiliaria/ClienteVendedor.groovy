package inmobiliaria

class ClienteVendedor extends Cliente{
static hasMany = [propiedades: Propiedad , contratos: Contrato]
    static constraints = {
    }
}
