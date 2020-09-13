package h04;

import java.applet.Applet;
import java.awt.*;

public class Pratijkopdr extends Applet {
    Color paars = new Color(241, 170, 246);
    public void paint(Graphics g) {
        //line
        g.drawLine(20,15,220,15);
        g.drawString("Lijn",105,27);
        //Rechthoek
        g.drawRect(20,30,200,110);
        g.drawString("Rechthoek",94,155);
        //rechthoek+Ellipsen
        g.setColor(paars);g.fillRect(250,30,200,110);
        g.setColor(Color.black);g.drawOval(250,30,200,110);
        g.drawString("Gevulde rechthoek met oval",270,155);
        //bolle rechthoek
        g.drawRoundRect(20,170,200,110,30,30);
        g.drawString("Afgeronde rechthoek",61,300);
        //lijk gevulde koek wel.
        g.setColor(paars);g.fillOval(250,170,200,110);
        g.setColor(Color.black);g.drawString("Gevulde ovaal",310,300);
        //Een taart met een bord dus.
        g.drawOval(470,30,200,110);
        g.setColor(paars);g.fillArc(470,30,200,110,0,45);
        g.setColor(Color.black);g.drawString("Taartpunt met ovaal eromheen",490,155);
        //Cirkel
        g.drawOval(515,180,100,100);
        g.drawString("Cirkel",550,300);
    }
}
