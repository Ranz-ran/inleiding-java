package h11;
//Maak een applet waarin de tafel van drie getoond wordt.
import java.applet.Applet;
import java.awt.*;

public class H1104 extends Applet {

    int tafel3,y,i,ans;

    @Override
    public void init() {
    tafel3 = 3;
    ans = 0;
    y = 0;

    }

    @Override
    public void paint(Graphics g) {


        for (int i = 1; i <= 30; i+=3 ) {
            y += 20;
            ans += 1;
            g.drawString(" "+ tafel3 +" x " + ans + " = " + i,20,y);
            i = tafel3 * ans;
        }


    }
}
