<%-- 
    Document   : RequestMaterial
    Created on : 7/12/2013, 01:13:11 PM
    Author     : charlie
--%>

<%@page import="java.util.List"%>
<%@page import="com.github.charliecorner.ocjp6.webcomponents.wedding.model.dto.MaterialDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Materiales</title>
    </head>
    <body>
        <h1>This are the materials for the year <%=request.getParameter("year")%></h1>
        <table border="2">
            <thead>
                <th>Año</th>
                <th>Material</th>
            </thead>
            <tbody>
                <%
                    for(MaterialDTO m : (List<MaterialDTO>) request.getAttribute("lista")){
                        %>
                        <tr>
                            <td>
                                <%=m.getYear()%>
                            </td>
                            <td>
                                <%=m.getName()%>
                            </td>
                        </tr>
                        <%
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
