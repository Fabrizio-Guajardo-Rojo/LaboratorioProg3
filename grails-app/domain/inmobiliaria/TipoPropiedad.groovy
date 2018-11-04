package inmobiliaria

class TipoPropiedad {

	String nombre_tipo

    String toString (){
    	return this.nombre_tipo 
    }


    static constraints = {
    	nombre_tipo(blank:false,maxSize:20)
    }
}
