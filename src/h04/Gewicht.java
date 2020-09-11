package h04;

import java.applet.Applet;
import java.awt.*;

public class Gewicht extends Applet {

    Color groen = new Color(172, 234, 137);
    Color blauw = new Color(136, 238, 210);
    Color paars = new Color(136, 98, 227);


    public void paint(Graphics g) {
        //x-as van tabel
        g.drawLine(50, 250, 300, 250);
        //y-as van tabel
        g.drawLine(50, 250, 50, 50);
        //stappengrote van tabel
        g.drawString("0", 42, 255);
        g.drawString("10", 35, 235);
        g.drawString("20", 35, 215);
        g.drawString("30", 35, 195);
        g.drawString("40", 35, 175);
        g.drawString("50", 35, 155);
        g.drawString("60", 35, 135);
        g.drawString("70", 35, 115);
        g.drawString("80", 35, 95);
        g.drawString("90", 35, 75);
        g.drawString("100", 28, 55);
        //stappengrote van tabel
        g.setColor(Color.lightGray);g.drawLine(50, 230, 300, 230);
        g.setColor(Color.lightGray);g.drawLine(50, 210, 300, 210);
        g.setColor(Color.lightGray);g.drawLine(50, 190, 300, 190);
        g.setColor(Color.lightGray);g.drawLine(50, 170, 300, 170);
        g.setColor(Color.lightGray);g.drawLine(50, 150, 300, 150);
        g.setColor(Color.lightGray);g.drawLine(50, 130, 300, 130);
        g.setColor(Color.lightGray);g.drawLine(50, 110, 300, 110);
        g.setColor(Color.lightGray);g.drawLine(50, 90, 300, 90);
        g.setColor(Color.lightGray);g.drawLine(50, 70, 300, 70);
        g.setColor(Color.lightGray);g.drawLine(50, 50, 300, 50);
        //Jeroen: 100 kg
        g.setColor(groen);g.fillRect(65, 50,30,200);
        g.setColor(Color.black);g.drawString("Jeroen", 57, 265);
        //Hans: 80 kg
        g.setColor(blauw);g.fillRect(130, 90,30,160);
        g.setColor(Color.black);g.drawString("Hans", 130, 265);
        //Valerie: 40 kg
        g.setColor(paars);g.fillRect(190, 170,30,80);
        g.setColor(Color.black);g.drawString("Valerie", 185, 265);
    }
}
