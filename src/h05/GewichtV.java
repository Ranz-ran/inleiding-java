package h05;

import java.applet.Applet;
import java.awt.*;

public class GewichtV extends Applet {
    //kleuren
    Color groen = new Color(172, 234, 137);
    Color blauw = new Color(136, 238, 210);
    Color paars = new Color(136, 98, 227);
    Color lichtGrijs = new Color(167, 168, 168);
    //kinderen
    Color Jeroen, Hans, Valerie;

    //assen
    Color xas, stappen;
    int Xas, Xas2, Xas3, jgewicht, hgewicht, vgewicht;


    public void init() {
        //kleuren
        Jeroen = groen;
        Hans = blauw;
        Valerie = paars;
        xas = Color.black;
        stappen = lichtGrijs;
        //kinderen
        Xas = 51;
        Xas2 = 35;
        Xas3 = 300;
        jgewicht = 100*2;
        hgewicht = 80*2;
        vgewicht = 40*2;


    }

    public void paint(Graphics g) {
        //x-as van tabel
        g.drawLine(50, 250, 300, 250);
        //y-as van tabel
        g.drawLine(50, 250, 50, 50);
        //stappengrote van tabel
        g.drawString("0", Xas2+7, 255);
        g.drawString("10", Xas2, 235);
        g.drawString("20", Xas2, 215);
        g.drawString("30",Xas2, 195);
        g.drawString("40", Xas2, 175);
        g.drawString("50", Xas2, 155);
        g.drawString("60", Xas2, 135);
        g.drawString("70", Xas2, 115);
        g.drawString("80", Xas2, 95);
        g.drawString("90", Xas2, 75);
        g.drawString("100", Xas2-7, 55);
        //stappengrote van tabel
        g.setColor(lichtGrijs);
        g.drawLine(Xas, 230, Xas3, 230);
        g.drawLine(Xas, 210, Xas3, 210);
        g.drawLine(Xas, 190, Xas3, 190);
        g.drawLine(Xas, 170, Xas3, 170);
        g.drawLine(Xas, 150, Xas3, 150);
        g.drawLine(Xas, 130, Xas3, 130);
        g.drawLine(Xas, 110, Xas3, 110);
        g.drawLine(Xas, 90, Xas3, 90);
        g.drawLine(Xas, 70, Xas3, 70);
        g.drawLine(Xas, 50, Xas3, 50);
        //Jeroen: 100 kg
        g.setColor(Jeroen);g.fillRect(65, 50,30,jgewicht);
        g.setColor(xas);g.drawString("Jeroen", 57, 265);
        //Hans: 80 kg
        g.setColor(Hans);g.fillRect(130, 90,30,hgewicht);
        g.setColor(xas);g.drawString("Hans", 130, 265);
        //Valerie: 40 kg
        g.setColor(Valerie);g.fillRect(190, 170,30,vgewicht);
        g.setColor(xas);g.drawString("Valerie", 185, 265);
    }
}
