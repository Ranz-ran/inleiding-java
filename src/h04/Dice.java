package h04;

import java.applet.Applet;
import java.awt.*;

public class Dice extends Applet {
    Color Rood = new Color(245, 74, 74);
    Color wit = new Color(239, 231, 231);
    public void paint(Graphics g) {
        g.setColor(wit);
        g.fillRoundRect(95, 60, 200, 200, 20, 20);
        //stippen
        g.setColor(Rood);
        g.fillOval(125, 90, 50, 50);
        g.fillOval(215, 90, 50, 50);
        g.fillOval(125, 180, 50, 50);
        g.fillOval(215, 180, 50, 50);
    }
}

