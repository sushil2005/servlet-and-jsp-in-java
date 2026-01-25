package servlet02;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class servlet02  extends HttpServlet {

   
public  void doPost(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {

    response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String Firstname = request.getParameter("Firstname");
        String Secondname= request.getParameter("Secondname");

  
        out.println("<h2>Firstname: " + Firstname + "</h2>");
        out.println("<h2>Secondname: " + Secondname + "</h2>");
    }
}
