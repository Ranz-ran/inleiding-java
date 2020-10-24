package h11;
//Teken 50 concentrische cirkels zoals onderstaand figuur.


import java.applet.Applet;
import java.awt.*;

public class H1107 extends Applet {

    int x,y,h,b;



    @Override
    public void init() {

        //general
        setSize(700,700);

        x = 300;
        y = 300;
        h = 5;
        b = 5;



    }

    @Override
    public void paint(Graphics g) {



        for ( int i = 0; i < 50; i++ ){
            x -= 5;
            y -= 5;
            b += 10;
            h += 10;
            g.drawOval(x,y,b,h);




        }



    }


}
