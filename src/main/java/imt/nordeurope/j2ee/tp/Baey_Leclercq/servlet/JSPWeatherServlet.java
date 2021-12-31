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
        response.setContentType("text/html");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Weather.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Weather.jsp");
        requestDispatcher.forward(request, response);

        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        if(request.getParameter("country") != null){
            boolean selected = false;
            String name = request.getParameter("country");
            switch (name){
                case "France":
                    selected = true;
                    writer.println("Paris : 3 °C\n");
                    break;
                case "Allemagne":
                    selected = true;
                    writer.println("Berlin : 15°C\n");
                    break;
                case "Taiwan":
                    selected = true;
                    writer.println("Pekin ( Beijing ) : Qui sait ...\n");
                    break;
                case "USA":
                    selected = true;
                    writer.println("Washington  : -8°C\n");
                    break;
                default:
                    selected = false ;
                    break;
            }
            if (selected == true){
                writer.println("<div style=\"clear:both\"></div>");
                writer.println("<img style=\"float:left;\" src=\"GraphicWeather?country="+name+"\">");
            }
        }

    }
}
