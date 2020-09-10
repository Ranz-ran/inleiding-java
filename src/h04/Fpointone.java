package h04;

import java.applet.Applet;
import java.awt.*;



public class Fpointone extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        //gelijkbenigedriehoek.
        g.drawLine(200, 100, 100, 200); //AB
        g.drawLine(300, 200, 200, 100); //AC
        g.drawLine(100, 200, 300, 200); //BC
        //hulp streepjes(later als ik tijd heb maak ik hem


    }
}
