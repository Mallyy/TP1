package imt.nordeurope.j2ee.tp.Baey_Leclercq.servlet;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;

@WebServlet(name = "Servlet.GraphicWeather", value = "/GraphicWeather")
public class ServletGraphicWeather extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType( "image/jpg" );

        if(request.getParameter("country")!= null) {
            String country = request.getParameter("country");
            int[] temp = new int[30];

            switch(country) {
                case "France":
                    temp = new int[]{2, 3, 7,8,5,9,4,1,0,2,0,3,0,1,0,0,0,1,2,2,2,3,4, 7, 8, -1, -2, 0, 4, 24,5};
                    break;
                case "Allemagne":
                    temp = new int[]{18,19,19,20,21,23,23,27,28,25,17,14,14,13,14,13,15,19,22,25,21,24,26,29,31,35,34,32,30,25,22};
                    break;
                case "Taiwan":
                    temp = new int[]{7,3,9,-7,21,18,4,32,-9,-15,25,34,1,14,0,-9,22,6,17,24,-1,9,-6,13,14,23,-10,31,-11,19,3};
                    break;
                case "USA":
                    temp = new int[]{-5,-7,-9,-11,-12,-14,-13,-16,-7,-8,-6,-7,-4,-3,-1,0,0,-2,2,1,-4,2,-1,3,-4,-1,3,5,4,6,0};
                    break;
                default:
                    break;
            }
            creationImage(response, temp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    void creationImage(HttpServletResponse response, int[] temp) throws IOException {
        ServletOutputStream out = response.getOutputStream();
        int width = 500;
        int height = 400;
        int dot = 8;
        BufferedImage bufferedImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        int i = 0;
        //draw image
        g2d.setPaint(Color.white);
        g2d.setColor(Color.black);
        g2d.drawLine(4*dot, 0, 4*dot, width);
        g2d.drawLine(0, 3*height/4, width, 3*height/4);
        for (int j = -15; j<45; j = j+5){
            g2d.drawString(Integer.toString(j),  2*dot, - (j*height/55) - 10 + 3*height/4);
        }
        g2d.setColor(Color.red);
        for(i = 0; i<30; i++) {
            int x = i * width/35 +5*dot;
            int x2 = (i+1) * width / 35 + 5 * dot + dot/2;
            int y_dot = -(temp[i]*height/55) -dot/2 +3*height/4;
            int y2_dot = -(temp[i+1]*height/55) -dot/2 +3*height/4;
            int y_label = - (temp[i]*height/55) - 10 + 3*height/4;
            g2d.drawString(Integer.toString(temp[i]),x, y_label);
            g2d.fill(new Ellipse2D.Float(x , y_dot , dot, dot));
            if(i < 29){
                g2d.drawLine(x + dot/2, y_dot + dot/2, x2, y2_dot + dot/2);
            }
        }
        ImageIO.write(bufferedImage, "jpg", out);

        g2d.dispose();
    }
}
