package productos.pckg;

import database.pckg.DB;
import java.sql.*;
import java.util.ArrayList;
import Model.Producto.Producto;
import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class productosDAO {

    public List<Producto> getAllProducts() {

        try {
            List<Producto> ProductList = new ArrayList<>();
            //instancia del database
            DB database = new DB();
            ResultSet rs = database.ExecuteQuery("SELECT * FROM Productos;");

            //creamos el while para recorrer toda la matriz de resultset
            while (rs.next()) {
                
                Producto producto = new Producto();
                
                producto.setNombre(rs.getString("Nombre"));
                producto.setPrecio(rs.getInt("Precio"));
                producto.setStock(rs.getInt("Stock"));

                //agregamos cada objeto creado a la lista
                ProductList.add(producto);

                return ProductList;
            }
            //cerramos la base de datos
            database.Close();
        } catch (SQLException ex) {
            System.getLogger(productosDAO.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            return null; 
        }
        return null;
        
    }

    //insert product
    public void InsertProduct(Producto producto) {

        //escribimos nuestro comando dentro de una variable
        String sql = "INSERT INTO Productos (Nombre, Precio, Stock)"
                + "VALUES('"+ producto.GetNombre()+ "', " +  producto.GetPrecio()+ ", " + producto.GetStock() + ");";
        
        //instancia del database
        DB database = new DB();
        
         database.ExecuteUpdate(sql);
        //cerramos la base de datos
        database.Close();

       
    }
    
    
    
    
}
