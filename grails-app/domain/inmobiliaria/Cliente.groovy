package inmobiliaria

class Cliente {


	String nombre_cliente
    String apellido_cliente
    BigDecimal dni_cliente
    String domicilio_cliente
    String telefono_cliente
    String tipo_cliente

    static hasMany = [propiedades: Propiedad , contratos: Contrato]


    static constraints = {
    }
}
