package h02;

import java.applet.Applet;
import java.awt.*;
import java.awt.Color;




public class Atest2 extends Applet {


        Color light_blue = new Color(141, 223, 238);
        Color YELLOW = new Color(253, 235, 110);

        public void init() {
                setBackground(light_blue);


        }

        public void paint(Graphics g) {
                g.setColor(YELLOW);
                g.drawString("Rita", 50, 50);
                g.drawString("Kuo", 50, 65);
        }
}

