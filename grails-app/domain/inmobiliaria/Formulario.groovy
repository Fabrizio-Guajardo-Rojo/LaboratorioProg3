package inmobiliaria

class Formulario {
    String nombre_formulario
    String apellido_formulario
    Integer telefono_formulario
    String email_formulario
    String detalle_formulario

    static constraints = {
      nombre_formulario (blank:false, maxSize:50)
      apellido_formulario (blank:false, maxSize:50)
      telefono_formulario (blank:false)
      email_formulario (blank:false , email:true)
      detalle_formulario (blank:false, maxSize: 300)
    }
}