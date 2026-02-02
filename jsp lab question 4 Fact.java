import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Fact extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int number = Integer.parseInt(request.getParameter("num"));
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Factorial Result</title></head>");
        out.println("<body>");
        out.println("<h2>Factorial of " + number + " is: " + factorial + "</h2>");
        out.println("<a href='fact.html'>Back</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
