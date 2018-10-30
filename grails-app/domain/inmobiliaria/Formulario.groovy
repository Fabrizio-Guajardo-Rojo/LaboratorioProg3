package inmobiliaria

class Formulario {
    String nombre_formulario
    String apellido_formulario
    String telefono_formulario
    String domicilio_formulario
    String email_formulario
    String detalle_formulario

    static constraints = {
      nombre_formulario (blank:false, maxSize:50)
      apellido_formulario (blank:false, maxSize:50)
      telefono_formulario (blank:false, maxSize:20)
      email_formulario (blank:false , email:true)
      domicilio_formulario (maxSize: 100)
      detalle_formulario (blank:false, maxSize: 300)
    }
}
