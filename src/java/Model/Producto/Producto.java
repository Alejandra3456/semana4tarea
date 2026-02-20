/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Producto;

/**
 *
 * @author Usuario
 */
public class Producto {
    //variables de nuestra clase
    private int ID; 
    private String Nombre; 
    private int Precio; 
    private int Stock; 
    
    //metodo constructor
    public Producto(String Nombre, int Precio, int Stock){
        this.Nombre = Nombre; 
        this.Precio = Precio; 
        this.Stock = Stock; 
    }

    public Producto(){
    }
    
    //metodos de get 
    public int GetID(){
        return ID;
    }
    
    public String GetNombre(){
        return Nombre;
    }
    
    public int GetPrecio(){
        return Precio;
    }
    
    public int GetStock(){
        return Stock;
    }
    
    //metodos set
    public void setNombre(String Nombre){
        this.Nombre = Nombre;  
    }
    
    //en los set siempre van parametros
    public void setPrecio(int Precio){
        this.Precio = Precio;  
    }
    
    public void setStock(int Stock){
        this.Stock = Stock;  
    }
    
}
