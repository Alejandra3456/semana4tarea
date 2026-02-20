<%-- 
    Document   : lista
    Created on : 14 feb 2026, 4:40:44 p. m.
    Author     : Usuario
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Producto.Producto"%>
<%@page import="database.pckg.myapp.DB"%>
<%@page import="import java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista jsp</title>
        <style> table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }</style>

    </head>
    <body> 
        
        <a href="registro.jsp"> create new product </a>

        <%
            //solicito mediante un request un atributo indicandole que este es una lista. 
            List<Producto> ProductList = (List<Producto>) request.getAttribute("ProductList");
        %>

        <table>

            <tr>
                <td> Nombre  </td>
                <td> Precio </td>
                <td> Stock </td>

            </tr>
            <% for (Producto Producto : ProductList) { //creamos mediante obtencion de metodo nuestras impresiones%>
            <tr>
                <td> <%= Producto.GetNombre()%> </td>
                <td> <%= Producto.GetPrecio()%> </td>
                <td> <%= Producto.GetStock()%> </td>

            </tr>

            <%}%>

        </table>
        <a href="'index.html'">Regresar</a>

    </body>
</html>