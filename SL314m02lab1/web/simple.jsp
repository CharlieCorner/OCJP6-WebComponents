<%-- 
    Document   : simple
    Created on : 7/12/2013, 10:04:15 AM
    Author     : charlie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Animal Lovers Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>
            Your favorite animal is a
            <%=request.getParameter("favoriteAnimal")%>
            Wow! Mine is too!
        </p>
    </body>
</html>
