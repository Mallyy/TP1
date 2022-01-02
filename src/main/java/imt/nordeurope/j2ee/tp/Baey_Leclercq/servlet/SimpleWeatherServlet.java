package imt.nordeurope.j2ee.tp.Baey_Leclercq.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleWeatherServlet", value = "/SimpleWeather")
public class SimpleWeatherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        print_listcountry(writer);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        print_listcountry(writer);
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
    void print_listcountry( PrintWriter writer){
        writer.println("<html><body>");
        writer.println("<form method='post' >\n" +
                "    <label for=\"country-select\">Choose a country:</label>\n" +
                "    <select name=\"country\" id=\"contry-select\">\n" +
                "        <option value=\"\">--Choisisez un pays--</option>\n" +
                "        <option value=\"France\">France</option>\n" +
                "        <option value=\"Allemagne\">Allemagne</option>\n" +
                "        <option value=\"USA\">USA</option>\n" +
                "        <option value=\"Taiwan\">Taiwan</option>\n" +
                "    </select>\n" +
                "    <button type=\"submit\">OK</button>\n" +
                "</form>");
    }
}
