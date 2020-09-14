package h05;

import java.applet.Applet;
import java.awt.*;

public class Variabelen extends Applet {

    int width;
    int height;
    Color vulling;
    Color lijn;
    Color paars = new Color(241, 170, 246);

    public void init() {
        //initialisatie.
        vulling = paars;
        lijn = Color.BLACK;
        width = 200;
        height = 100;
    }

    public void paint(Graphics g) {

        //line
        g.drawLine(20,15,220,15);
        g.drawString("Lijn",105,27);
        //Rechthoek
        g.drawRect(20,30,width,height);
        g.drawString("Rechthoek",94,155);
        //rechthoek+Ellipsen
        g.setColor(vulling);g.fillRect(250,30,width,height);
        g.setColor(lijn);g.drawOval(250,30,width,height);
        g.drawString("Gevulde rechthoek met oval",270,155);
        //bolle rechthoek
        g.drawRoundRect(20,170,width,height,30,30);
        g.drawString("Afgeronde rechthoek",61,300);
        //lijk gevulde koek wel.
        g.setColor(vulling);g.fillOval(250,170,width,height);
        g.setColor(lijn);g.drawString("Gevulde ovaal",310,300);
        //Een taart met een bord dus.
        g.drawOval(470,30,width,110);
        g.setColor(vulling);g.fillArc(470,30,width,height,0,45);
        g.setColor(lijn);g.drawString("Taartpunt met ovaal eromheen",490,155);
        //Cirkel
        g.drawOval(515,180,100,100);
        g.drawString("Cirkel",550,300);

    }




}
