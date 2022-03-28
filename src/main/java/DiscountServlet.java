import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/DiscountServlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float listPrice = Float.parseFloat(request.getParameter("ListPrice"));
        float DiscountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));
        double DiscountAmount = listPrice*DiscountPercent*0.01 ;

        PrintWriter writer = response.getWriter();
        writer.println("<h1>"+DiscountAmount+"<h1/>");
    }
}
