package h11;
//Schrijf een applet, waarin tien getallen van 20 tot 10 worden getoond
import java.applet.Applet;
import java.awt.*;

public class H11_2 extends Applet {
    //general
    Color roze;
    int line,y;


    @Override
    public void init() {
        //general
        roze = new Color(243, 203, 234);
        setBackground(roze);
        setSize(700,500);
        line = 1;

    }

    @Override
    public void paint(Graphics g) {
        //while(teller < 10) {
        //    y += 20;
        //    g.drawLine(50 , y, 300, y );
        //    g.drawString("" + teller, 305, y );
        //    teller++;
        while (line <= 10) {
            y += 20;
            g.drawLine(50, y , 200, y);
            g.drawString("" + line, 305, y);
            line ++;
        }
    }

}
