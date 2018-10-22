package inmobiliaria

class Cliente {


	String nombre_cliente
    String apellido_cliente
    BigDecimal dni_cliente
    String domicilio_cliente
    String telefono_cliente
    String email_cliente
    String tipo_cliente

    static hasMany = [propiedades: Propiedad , contratos: Contrato]


    static constraints = {
        nombre_cliente (blank: false, maxSize:50)
        apellido_cliente (blank: false, maxSize:20)
        dni_cliente (blank: false, unique: true)
        domicilio_cliente (blank: false, maxSize: 100)
        telefono_cliente (blank: false, matches: "[0-9]{3}[-][0-9]{6}")
        email_cliente (blank: false, email: true)
        tipo_cliente (blank: false, inList:['Comprador','Vendedor'])
    }
}
