
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "svPersona", urlPatterns = {"/svPersona"})
public class svPersona extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String dni = request.getParameter("Dni");
        String nombre = request.getParameter("Nombre");
        String apellido =  request.getParameter("Apellido");
        String telefono =  request.getParameter("Telefono");
       
        
        System.out.println("Dni:" + dni);
         System.out.println("Nombre: " + nombre);
          System.out.println("Apellido: " + apellido);
           System.out.println("Telefono: " + telefono);
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
