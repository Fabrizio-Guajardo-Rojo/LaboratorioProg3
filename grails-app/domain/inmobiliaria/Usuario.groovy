package inmobiliaria

class Usuario {
    String login
    String nombre
    String apellido
    String password
    String tipo_usuario
    String email

    static constraints = {
      login (login size: 5..15, blank: false, unique: true)
      nombre (blank:false, maxSize:50)
      apellido (blank:false, maxSize:20)
      tipo_usuario(blank:false, inList:['administrador','operador'])
      password (size: 5..15, blank: false)
      email (email: true, blank: false)
    }
}
