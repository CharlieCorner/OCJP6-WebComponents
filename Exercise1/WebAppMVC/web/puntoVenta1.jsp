<%-- 
    Document   : PuntoVenta1
    Created on : Nov 29, 2013, 7:41:04 PM
    Author     : diazeg
--%>

<%@page import="java.util.List"%>
<%@page import="com.webappMVC.dto.ItemDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Punto de Venta Uno!</h1>
        <h1>Te estoy atendiendo !</h1>
        <h1>Este es mi inventario:</h1>
        <TABLE BORDER=2>
<%
    List<ItemDTO> listItems=(List<ItemDTO>)request.getAttribute("itemList");
        for (ItemDTO itemDTO: listItems){
        %>
        <TR>
        <TD>Item</TD>
        <TD><%= itemDTO.getId() %></TD>
        <TD><%= itemDTO.getDescripcion() %></TD>
        <TD><%= itemDTO.getPrecio() %></TD>
        </TR>
        <%
    }
%>
</TABLE>
    </body>
</html>
