package inmobiliaria

class BootStrap {

    def init = { servletContext ->


      def usuario1 = new Usuario(nombreUsuario: "Daniel" ,password: "12345",email: "daniel@gmail.com")
      if(!usuario1.save(flush: true)) {
        usuario1.errors.each{
          println it
        }
      }

      def rol1 = new Rol(authority: "ADMINISTRADOR")
      if(!rol1.save(flush: true)) {
        rol1.errors.each{
          println it
        }
      }

      def rol2 = new Rol(authority: "OPERADOR")
      if(!rol2.save(flush: true)) {
        rol2.errors.each{
          println it
        }
      }


      def usuarioRol1 = new UsuarioRol(usuario: usuario1, rol: rol1)
      if(!usuarioRol1.save(flush: true)) {
        usuarioRol1.errors.each{
          println it
        }
      }




    }
    def destroy = {
    }
}
