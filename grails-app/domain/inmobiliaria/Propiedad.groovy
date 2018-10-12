package inmobiliaria

class Propiedad {
	//Cliente cliente;
	//int id_propietario;//cliente dueño de la propiedad
	String ubicacion;
	String descripcion;
	String tipo_propiedad; // debe tener un tipo diferente para "casas ,departamentos , locales , etc"
	String estado_propiedad; // si esta alquilada o vendida , o libre 

    static constraints = {
    }
}
