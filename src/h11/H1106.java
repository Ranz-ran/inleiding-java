package h11;

import java.applet.Applet;
import java.awt.*;

public class H1106 extends Applet {

    int x,y,h,b;



    @Override
    public void init() {

        x = 200;
        y = 200;
        h = 10;
        b = 10;



    }

    @Override
    public void paint(Graphics g) {



       for ( int i = 0; i < 5; i++ ){
           x -= 10;
           y -= 10;
           b += 20;
           h += 20;
           g.drawOval(x,y,b,h);




       }


    }


}
