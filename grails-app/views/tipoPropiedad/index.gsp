<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main2" />
        <g:set var="entityName" value="${message(code: 'tipoPropiedad.label', default: 'TipoPropiedad')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-tipoPropiedad" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="/principal/opcionesGenerales"><g:message code="default.home.label"/></a></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="list-tipoPropiedad" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${tipoPropiedadList}" />

            <div class="pagination">
                <g:paginate total="${tipoPropiedadCount ?: 0}" />
            </div>
        </div>
    </body>
</html>
