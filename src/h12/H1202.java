package h12;

import java.applet.Applet;
import java.awt.*;

public class H1202 extends Applet {

    Button[] b;

    @Override
    public void init() {
        b = new Button[25];
        add(b[25]);

        for (int i = 0; i < b.length; i++ );
    }

    @Override
    public void paint(Graphics g) {

        for (int teller = 0; teller < b.length; teller++);
        b[25] = 100 * teller + 100;
    }

}
