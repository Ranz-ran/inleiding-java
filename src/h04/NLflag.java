package h04;

import java.applet.Applet;
import java.awt.*;


public class NLflag extends Applet {

    Color red = new Color(191, 57, 34);
    Color wit = new Color(255, 255, 255);
    Color blauw = new Color(25, 49, 83);
    Color geel = new Color(246, 218, 48);

    public void init() {

    }


    public void paint(Graphics g) {
        //rechthoek van flag
        g.setColor(red);g.fillRect(100, 100 ,90, 30);
        g.setColor(wit);g.fillRect(100, 125 ,90, 30);
        g.setColor(blauw);g.fillRect(100, 150 ,90, 30);
        //flaggen stok
        g.drawRect(93, 100, 7, 175);
        //bolletje op flaggenstok
        g.setColor(geel);g.fillOval(90, 90, 13, 13);
    }


}



