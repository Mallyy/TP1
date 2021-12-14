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

        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");

        writer.println("<html><body>");
        writer.println("<form method='post' >\n" +
                "    <label for=\"country-select\">Choose a country:</label>\n" +
                "    <select name=\"country\" id=\"contry-select\">\n" +
                "        <option value=\"\">--Choisisez un pays--</option>\n" +
                "        <option value=\"France\">France</option>\n" +
                "        <option value=\"Germany\">Allemagne</option>\n" +
                "        <option value=\"USA\">USA</option>\n" +
                "        <option value=\"England\">Angleterre</option>\n" +
                "    </select>\n" +
                "    <button type=\"submit\">OK</button>\n" +
                "</form>");

        writer.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html");

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
        //writer.println(name);


    }

//    void print_listcountry(){
//        PrintWriter writer = response.getWriter();
//    }
}
