/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.pckg;
import java.sql.*;


/**
 *
 * @author Aleja
 */
public class DB {
    //creamos una variable para crear una coneccion
    Connection conn; 
    
    //metodo para generar la conexion
    public DB(){
        try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/Empresa", "root", "Admin$1234");
                
            } catch (ClassNotFoundException | SQLException ex){
                System.getLogger(DB.class.getName()).log(System.Logger.Level.ERROR,(String) null, ex);
            }
    }
    
    //creamos el metodo para poder solicitar tomar los datos de la base de datos
    public ResultSet ExecuteQuery(String sql) {
        try{
            Statement cmd = conn.createStatement();
            return cmd.executeQuery(sql);
            
                    
        }catch (SQLException ex){
            System.getLogger(DB.class.getName()).log(System.Logger.Level.ERROR, (String) null,ex);
            return null;
        }
                
    }
    
    //creamos un metodo que reciba datos
    public void ExecuteUpdate(String sql) {
        try {
            Statement cmd = conn.createStatement();
            cmd.executeUpdate(sql);

        } catch (SQLException ex) {
            System.getLogger(DB.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

    //creamos un metodo para cerrar la coneccion
    public void Close(){
        try{
            conn.close();
            
        }catch (SQLException ex){
            System.getLogger(DB.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            
        }
    }
    
    
    
}
