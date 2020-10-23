package h11;
//Teken vijf vierkanten volgens onderstaand figuur:
import java.applet.Applet;
import java.awt.*;

public class H1105 extends Applet {

    int i,x,y,b1,l1;
    Color blauw;

    @Override
    public void init() {
        blauw = new Color(200, 246, 243);

        x = 20;
        y = 20;
        b1 = 30;
        l1 = 30;

    }

    @Override
    public void paint(Graphics g) {

        for(i = 0; i < 5; i++ ){
            x += 30;
            y += 30;

            g.drawRect(x,y,l1,b1);

        }

    }
}
