package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {
    Color blauw = new Color(111, 195, 203);
    Color grijs = new Color(117, 135, 137);
    Color Dgroen = new Color(42, 87, 39);
    Color DDgroen = new Color(62, 127, 58);
    Color rood = new Color(229, 31, 31);
    Color geel = new Color(255, 232, 33);
    Color groen = new Color(95, 246, 62);
    public void init() {
        setBackground(blauw);
    }

    public void paint(Graphics g) {
        //stoplicht bord
        g.setColor(Dgroen); g.fillRect(100, 70, 210, 75);
        g.setColor(DDgroen); g.fillRoundRect(113, 80, 190, 60, 25, 25);
        //stok van stoplicht
        g.setColor(grijs); g.fillRect(0, 95, 100, 20);
        //rode licht
        g.setColor(rood); g.fillOval(120, 84, 50, 50);
        //gele licht
        g.setColor(geel); g.fillOval(180, 84, 50, 50);
        //groene licht
        g.setColor(groen); g.fillOval(240, 84, 50, 50);

    }
}
