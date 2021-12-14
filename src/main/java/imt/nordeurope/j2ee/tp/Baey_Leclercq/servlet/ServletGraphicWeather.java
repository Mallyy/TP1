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
        ServletOutputStream out = response.getOutputStream();

        BufferedImage bufferedImage = new BufferedImage(1000, 800,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        int[] temp = {2, 3, 7,8,5,9,4,1,0,2,0,3,0,1,0,0,0,1,2,2,2,3,4, 7, 8, -1, -2, 0, 4, 24};
        int i = 0;
        //draw image
        g2d.setPaint(Color.white);
        g2d.setColor(Color.green);
        g2d.drawLine(0, 0, 0, 1000);
        g2d.drawLine(0, 400, 1000, 400);
        g2d.setColor(Color.red);
        for(i = 0; i<30; i++) {
            g2d.drawString(Integer.toString(temp[i]), i*30 + 10, - (temp[i]*15) + 416);
            g2d.fill(new Ellipse2D.Float(i * 30 + 10 , -(temp[i]*15) + 400 -4, 8, 8));
        }
        ImageIO.write(bufferedImage, "jpg", out);

        g2d.dispose();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    void creationImage(){
        BufferedImage bufferedImage = new BufferedImage(200, 200,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        // Draw on the image
        g2d.setColor(Color.red);
        g2d.fill(new Ellipse2D.Float(0, 0, 200, 100));
// Sauver l’image dans le flux de sortie

        g2d.dispose();

    }
}
