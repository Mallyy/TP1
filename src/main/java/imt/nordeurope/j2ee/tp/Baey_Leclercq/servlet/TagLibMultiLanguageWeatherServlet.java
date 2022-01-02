package imt.nordeurope.j2ee.tp.Baey_Leclercq.servlet;

import org.nordeurope.j2ee.tp.Baey_Leclercq.beans.WeatherBean;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TagLibMultiLanguageWeatherServlet", value = "/TagLibMultiLanguageWeather")
public class TagLibMultiLanguageWeatherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        WeatherBean weather = new WeatherBean();
        weather.setSelected(false);
        weather.setCapital(null);
        weather.setCountry(null);
        weather.setTemperature(null);
        request.setAttribute("weather", weather);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/tldsWeather.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        WeatherBean weather = new WeatherBean();

        String name = request.getParameter("country");
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

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/tldsWeather.jsp");
        requestDispatcher.forward(request, response);
    }
}
