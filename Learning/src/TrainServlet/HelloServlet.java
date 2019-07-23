package TrainServlet;
import javax.servlet.Re
import javax.xml.

@WebServlet("/hello")

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
            writer.println("<h2>Hello from HelloServlet</h2>");
        } finally {
            writer.close();
        }
    }
}
