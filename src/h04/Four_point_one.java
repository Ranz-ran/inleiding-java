package h04;

import java.applet.Applet;
import java.awt.*;

public class Four_point_one extends Applet {

    public void paint(Graphics g) {
        //gelijkbenigedriehoek.
        g.drawLine(100, 200, 270, 200);
        g.drawLine(270, 200, 200, 100);
        g.drawLine(200, 100, 100, 200);
        //tekens die aangeven dat gekijkbenigedriehoek is.
        g.drawLine(20, -20, -20, 20);
        g.drawLine(10, 10, 10, 10);
    }
}
