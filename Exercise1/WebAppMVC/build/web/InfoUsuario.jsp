<%-- 
    Document   : InfoUsuario
    Created on : 6/12/2013, 10:55:38 PM
    Author     : charlie
--%>

<%@page import="java.util.List"%>
<%@page import="com.webappMVC.dto.UsuarioDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>La info de un usuario</title>
    </head>
    <body>
        <h1>Aqui hay unos usuarios</h1>
        <table border="2">
            <thead>
                <th>
                    <b>Nombre</b>
                </th>
                <th>
                    <b>Apellido Paterno</b>
                </th>
                <th>
                    <b>Apellido Materno</b>
                </th>
                <th>
                    <b>Edad</b>
                </th>
            </thead>
            <tbody>
                <%
                    List<UsuarioDTO> listaUsuarios=(List<UsuarioDTO>)request.getAttribute("listaUsuarios");
                    for(UsuarioDTO u:listaUsuarios){
                %>
                        <tr>
                            <td>
                                <%=u.getNombre()%>
                            </td>
                            <td>
                                <%=u.getApellidoPaterno()%>
                            </td>
                            <td>
                                <%=u.getApellidoMaterno()%>
                            </td>
                            <td>
                                <%=u.getEdad()%>
                            </td>
                        </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
