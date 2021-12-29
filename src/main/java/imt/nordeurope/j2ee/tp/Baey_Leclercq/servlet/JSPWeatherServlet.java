package imt.nordeurope.j2ee.tp.Baey_Leclercq.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "JSPWeatherServlet", value = "/JSPWeather")
public class JSPWeatherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Weather.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");
        String name = request.getParameter("country");
        switch (name){
            case "France":
                writer.println("Paris : 21 °C");
                break;
            case "Allemagne":
                writer.println("Berlin : 15°C");
                break;
            case "Taiwan":
                writer.println("Pekin ( Beijing ) : Qui sait ...");
                break;
            case "USA":
                writer.println("Washington  : 45°C");
                break;
            default:
                writer.println("N/A");

        }
    }
}
