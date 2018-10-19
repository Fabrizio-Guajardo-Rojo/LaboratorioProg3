package inmobiliaria

class Contrato {
		//int id_cliente ; //cliente que quiere comprar o alquilar dicha propiedad 
	//int id_propiedad;
	//int id_propietario; // es una persona que es nuestro cliente 
	String descripcion;
	float importe;
	Date fecha;


    static constraints = {
    	descripcion (blank:false , maxSize:50)
    	importe (min:0)
    	fecha (min: new Date() )

    }
}
