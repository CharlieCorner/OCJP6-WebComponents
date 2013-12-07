<%-- 
    Document   : result
    Created on : 7/12/2013, 12:26:50 PM
    Author     : charlie
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List brands = (List) request.getAttribute("brands");
            out.println("<h1>Servlet BeerSelect at " + request.getContextPath() + "</h1>");
            out.println("<br> usted debería tomar: ");
            for (Object b : brands) {
                out.println("<br>"+b);
            }
        %>
    </body>
</html>
