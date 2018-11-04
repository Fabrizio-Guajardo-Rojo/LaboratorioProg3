package inmobiliaria

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "/propiedadesInfo"(resources:"apiPropiedades")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
