package h02;

import java.applet.Applet;
import java.awt.*;

public class Naamw extends Applet {


    public void init() {
        setBackground(Color.WHITE);
    }


    public void paint(Graphics g) {

        g.setColor(Color.BLUE);
        g.drawString("Rita", 50, 50);
        g.setColor(Color.RED);
        g.drawString("Kuo", 50, 65);
    }
}
