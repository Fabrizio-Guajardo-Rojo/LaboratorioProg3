package inmobiliaria

class FormularioPropiedad {
    String nombre_formulario
    String apellido_formulario
    Integer telefono_formulario
    String email_formulario
    String detalle_formulario
    String estado
    String respuesta_de_inmobiliaria

    static belongsTo = [propiedad: Propiedad]


    static constraints = {
      
      
      nombre_formulario (blank:false, maxSize:50)
      apellido_formulario (blank:false, maxSize:50)
      telefono_formulario (blank:false)
      email_formulario (blank:false , email:true)
      detalle_formulario (blank:false, maxSize: 300)
      estado( blank:true,inList:['no contestada','contestada'])
      respuesta_de_inmobiliaria(blank:true , maxSize:300)
    }
}
