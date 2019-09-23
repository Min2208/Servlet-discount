import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price=Float.parseFloat(request.getParameter("price"));
        float discount=Float.parseFloat(request.getParameter("discount"));

        float discountAmount=price*discount/100;

        float discountPrice=price-discountAmount;

        PrintWriter writer=response.getWriter();
        writer.println("Discount Price :" + discountPrice);
        writer.println("Discount Amount :" + discountAmount);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
