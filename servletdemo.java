package sushil;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class servletdemo extends HttpServlet {

   
public void doPost(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {

    response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("Employee");
        String phone = request.getParameter("phone");

        out.println("<h2>Welcome to Register Servlet</h2>");
        out.println("<h2>Name: " + name + "</h2>");
        out.println("<h2>Phone: " + phone + "</h2>");
    }
}
