package inmobiliaria

class Propiedad {
	//Cliente cliente;
	 // solo tiene un dueño
	//int id_propietario;//cliente dueño de la propiedad






	String nombre_propiedad;
	String localidad;
	String barrio;
	BigDecimal precio;
	

	String calle;
	Integer numeroCalle;
	Integer numeroDepartamento;
	Integer piso;
	Integer cantidadHabitaciones;
	Integer cantidadBanios;
	

	String descripcion;
	String tipo_operacion; // debe tener un tipo diferente para "casas (c),departamentos(d) , locales (l), etc"
	String estado_propiedad; // si esta alquilada o vendida , o libre 
	String tipo_publicidad;

	static belongsTo = [cliente_dueño: ClienteVendedor , tipoPropiedad:TipoPropiedad ]  // falta agregar el "static hasMany = [propiedades: Propiedad]"
	    

	String toString (){
    	return this.nombre_propiedad + ". Tipo Propiedad:" + this.tipoPropiedad +".  Tipo operacion:"+ this.tipo_operacion
    }

    static constraints = {
    nombre_propiedad(blank: false, unique: true)	
    localidad(blank:false)
    barrio(blank:false)
    precio(blank:false)

	calle(blank:false , maxSize : 50)
	numeroCalle(blank:false, maxSize:6 )

	numeroDepartamento(nullable:true, blank:true , maxSize:6)
	piso(nullable:true,blank:true, maxSize:3)
	cantidadHabitaciones(nullable:true,blank:true , maxSize:2)
	cantidadBanios(nullable:true,blank:true , maxSize:2)


    descripcion (maxSize:500)
    
    tipo_operacion(blank:false, inList:['venta','alquiler'])
    estado_propiedad(blank:false, inList:['disponible','no disponible'])
    tipo_publicidad(blank:false, inList:['no oferta','oferta'])
   
   }
}
