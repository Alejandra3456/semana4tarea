<%-- 
    Document   : registro
    Created on : 14 feb 2026, 4:37:55 p. m.
    Author     : Usuario
--%>

<%@page import="database.pckg.DB"%>
<%@page import="import java.sql.*;"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro jsp</title>
    </head>
    <body>       
        <h1>Crea un nuevo producto</h1>  
        <form method="POST" action="productosServlet">
            Nombre:
            <input type="text" name="txtNombre" /><br>
            Precio:
            <input type="number" name="txtPrecio" /><br>
            Stock: 
            <input type="number" name="txtStock" /><br>   
            <button type="submit">Save</button>
        </form>
    </body>
</html>