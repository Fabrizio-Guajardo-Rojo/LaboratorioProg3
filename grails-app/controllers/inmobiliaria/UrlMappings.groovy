package inmobiliaria

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/propiedadesInfo"(resources:"apiPropiedades"){

          collection {"/lisApiPropiedadesPorTipoOperacion"(controller: "apiPropiedades", action:
          "lisApiPropiedadesPorTipoOperacion")
          }
          collection {"/lisApiPropiedadesPorTipoPublicidad"(controller: "apiPropiedades", action:
          "lisApiPropiedadesPorTipoPublicidad")
          }
        }



        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
