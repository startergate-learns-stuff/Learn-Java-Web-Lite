import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");

        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("3220_최호승_HelloServlet");
        out.println("</body>");
        out.println("</html>");
    }
}
