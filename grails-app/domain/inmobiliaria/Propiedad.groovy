package inmobiliaria

class Propiedad {
	//Cliente cliente;
	 // solo tiene un dueño
	//int id_propietario;//cliente dueño de la propiedad
	String ubicacion;
	String descripcion;
	String tipo_propiedad; // debe tener un tipo diferente para "casas (c),departamentos(d) , locales (l), etc"
	String estado_propiedad; // si esta alquilada o vendida , o libre 
	static belongsTo = [cliente_dueño: Cliente]  // falta agregar el "static hasMany = [propiedades: Propiedad]"
	static hasMany = [contratos: Contrato]

    static constraints = {
    
    descripcion (maxSize:500)
    ubicacion (maxSize:500)
    tipo_propiedad (maxSize:500)
    estado_propiedad (maxSize:500)
   

    }
}
