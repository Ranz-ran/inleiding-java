package h11;
//Schrijf een applet waarin minimaal 100 cirkels worden getoond die hetzelfde beginpunt hebben, maar elke cirkel
// wordt iets groter dan de vorige.
import java.applet.Applet;
import java.awt.*;

public class H1108 extends Applet {

    int x,y,w,h,circles;

    @Override
    public void init() {

        setSize(500,500);

        x = 30;
        y = 30;
        w = 5;
        h = 5;

        circles = 5;


    }

    @Override
    public void paint(Graphics g) {

        for (circles = 0; circles <=100; circles++){
            g.drawOval(x,y,w,h);
            x +=2;
            y +=2;
            w +=2;
            h +=2;
        }

    }
}
