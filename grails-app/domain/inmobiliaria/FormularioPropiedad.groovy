package inmobiliaria

class FormularioPropiedad {
    String nombre_formulario
    String apellido_formulario
    String telefono_formulario
    String email_formulario
    String detalle_formulario
    String estado

    static belongsTo = [propiedad: Propiedad]


    static constraints = {


      nombre_formulario (blank:false, maxSize:50)
      apellido_formulario (blank:false, maxSize:50)
      telefono_formulario (blank:false, maxSize:16)
      email_formulario (blank:false , email:true)
      detalle_formulario (blank:false, maxSize: 300)
      estado( blank:false,inList:['no contestada','contestada'])
    }
}
