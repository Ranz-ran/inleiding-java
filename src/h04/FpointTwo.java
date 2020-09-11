package h04;

import java.applet.Applet;
import java.awt.*;


public class Fpointtwo extends Applet {

    Color light_green = new Color(172, 234, 137);

    public void init() {
        setBackground(light_green);
    }


    public void paint(Graphics g) {
        //rechthoek van huis
        g.drawRect(100, 200, 200, 100);
        //gelijkbenigedriehoek.
        g.drawLine(200, 100, 100, 200); //AB
        g.drawLine(300, 200, 200, 100); //AC
        g.drawLine(100, 200, 300, 200); //BC
        //raampje
        g.drawRect(125, 250, 50, 40);
        //deur
        g.drawRect(225, 230, 40, 70);
        //deurknop
        g.drawOval(252, 260, 10, 10);
        //raam voor de zolder
        g.drawOval(175, 130, 50, 50);

    }
}



