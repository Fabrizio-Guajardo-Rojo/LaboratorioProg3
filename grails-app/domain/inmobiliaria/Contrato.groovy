package inmobiliaria

class Contrato {
		//int id_cliente ; //cliente que quiere comprar o alquilar dicha propiedad 
	//int id_propiedad;
	//int id_propietario; // es una persona que es nuestro cliente 
	String descripcion;
	
	Date fecha;
//static belongsTo = [cliente_dueño: Cliente] // el dueñño de la propiedad
//static belongsTo = [cliente_comprador: Cliente] // el cliente de la propiedad
static belongsTo = [propiedad: Propiedad ,  cliente_comprador : ClienteComprador ]// la propiedad en cuestion

    static constraints = {
    	descripcion (blank:false , maxSize:50)
    	//importe (min:0)
    	//fecha (min: new Date() )

    }
}
