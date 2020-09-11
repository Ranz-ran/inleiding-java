package h04;

import java.applet.Applet;
import java.awt.*;

public class Ellips extends Applet {
    Color blauw = new Color(104, 210, 236);
    Color geel = new Color(255, 238, 133);
    public void init() {
        setBackground(blauw);
    }


    public void paint(Graphics g) {
        g.setColor(geel);g.fillArc(90, 10, 180, 250, 300, 400);

    }
}
