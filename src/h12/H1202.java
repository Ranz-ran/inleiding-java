package h12;

import java.applet.Applet;
import java.awt.*;

public class H1202 extends Applet {
    int x,y;
    Button[] b = new Button[25];

    @Override
    public void init() {
        x=30;
        y=30;

        int i;
        for (i = 0; i < 25; i++) {

            b[i] = new Button("button" + i);
            add(b[i]);
            b[i].setLocation(x, y);
            y++;
            

        }




    }

    @Override
    public void paint(Graphics g) {


    }

}
