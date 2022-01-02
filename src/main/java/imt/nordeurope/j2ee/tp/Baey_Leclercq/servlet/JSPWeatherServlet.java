package imt.nordeurope.j2ee.tp.Baey_Leclercq.servlet;

import org.nordeurope.j2ee.tp.Baey_Leclercq.beans.WeatherBean;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static java.lang.System.out;

@WebServlet(name = "JSPWeatherServlet", value = "/JSPWeather")
public class JSPWeatherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        WeatherBean weather = new WeatherBean();
        weather.setSelected(false);
        weather.setCapital(null);
        weather.setCountry(null);
        weather.setTemperature(null);
        request.setAttribute("weather", weather);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Weather.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*PrintWriter writer = response.getWriter();*/
        response.setContentType("text/html");

        WeatherBean weather = new WeatherBean();

        String name = request.getParameter("country");
        out.println("ici");
        switch (name){
            case "France":
                weather.setCountry("France");
                weather.setSelected(true);
                weather.setCapital("Paris");
                weather.setTemperature("3 °C");
                break;
            case "Allemagne":
                weather.setCountry("Allemagne");
                weather.setSelected(true);
                weather.setCapital("Berlin");
                weather.setTemperature("22 °C");
                break;
            case "Taiwan":
                weather.setCountry("Taiwan");
                weather.setSelected(true);
                weather.setCapital("Pekin ( Beijing )");
                weather.setTemperature("inconnue °C");
                break;
            case "USA":
                weather.setCountry("USA");
                weather.setSelected(true);
                weather.setCapital("Washington DC");
                weather.setTemperature("-8 °C");
                break;
            default:
                weather.setCountry("Inconu");
                weather.setSelected(false);
                weather.setCapital("Inconnue");
                weather.setTemperature("Inconnue");
                break;
        }
        request.setAttribute("weather", weather);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Weather.jsp");
        requestDispatcher.forward(request, response);

        /*if(request.getParameter("country") != null){

            String name = request.getParameter("country");
            boolean selected = false;
            switch (name){
                case "France":
                    selected = true;
                    writer.println("Paris : 3 °C\n");
                    break;
                case "Allemagne":
                    selected = true;
                    writer.println("Berlin : 22°C\n");
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
        }*/
    }
}
