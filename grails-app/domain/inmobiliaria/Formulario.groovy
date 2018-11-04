package inmobiliaria

class Formulario {
    String nombre_formulario
    String apellido_formulario
    String telefono_formulario
    String email_formulario
    String detalle_formulario
    String estado


Formulario(String nombre_formulario,String apellido_formulario,String telefono_formulario,String email_formulario,String detalle_formulario)
{
this.nombre_formulario=nombre_formulario
this.apellido_formulario=apellido_formulario
this.telefono_formulario=telefono_formulario
this.email_formulario=email_formulario
this.detalle_formulario=detalle_formulario
this.estado="no contestada"

}
    static constraints = {

      nombre_formulario (blank:false, maxSize:50)
      apellido_formulario (blank:false, maxSize:50)
      telefono_formulario (blank:false, maxSize:16)
      email_formulario (blank:false , email:true)
      detalle_formulario (blank:false, maxSize: 300)
      estado(nullable:true,blank:true ,inList:['no contestada','contestada'])
    }
}
