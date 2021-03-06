<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main2" />
        <g:set var="entityName" value="${message(code: 'formularioPropiedad.label', default: 'FormularioPropiedad')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-formularioPropiedad" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="/principal/opcionesGenerales"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="list-formularioPropiedad" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${formularioPropiedadList}" />

            <div class="pagination">
                <g:paginate total="${formularioPropiedadCount ?: 0}" />
            </div>
        </div>
    </body>
</html>
