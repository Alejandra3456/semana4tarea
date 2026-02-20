/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package productosServlet;

import Model.Producto.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import productos.pckg.productosDAO;

/**
 *
 * @author Usuario
 */
public class productosServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        productosDAO dao = new productosDAO();
        List<Producto> ProductList = dao.getAllProducts();
        request.setAttribute("ProductList", ProductList);
        request.getRequestDispatcher("lista.jsp").forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //request para adquirir los datos
        String Nombre = request.getParameter("txtNombre");
        int Precio = Integer.parseInt(request.getParameter("txtPrecio"));
        int Stock = Integer.parseInt(request.getParameter("txtStock"));
        
        productosDAO dao = new productosDAO();
        
        Producto Producto = new Producto();
        
        Producto.setNombre(Nombre);
        Producto.setPrecio(Precio);
        Producto.setStock(Stock);
        
        //le indicamos al dao que ingrese el carro que acabamos de crear
        dao.InsertProduct(Producto);
        
        //volvemos a la lista de productos
        response.sendRedirect("productosServlet");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
