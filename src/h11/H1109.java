package h11;
//Schrijf een applet waarin een schaakbord op het scherm wordt getekend. Een schaakbord heeft 8 bij 8 vakken om en
// om wit en zwart
import java.applet.Applet;
import java.awt.*;

public class H1109 extends Applet {

    //general

     int x,y,w,h,c;
     Color wit,zwart;

    @Override
    public void init() {

        setSize(500,400);

        wit = new Color (255, 255, 255);
        zwart = new Color (0, 0, 0);


        x = 30;
        y = 30;
        w = 25;
        h = 25;

    }

    @Override
    public void paint(Graphics g) {

        for (c = 0; c <8; c++){
            if (c == 0 || c == 2 || c ==4 || c == 6 ) {
                g.setColor(zwart);
                g.fillRect(x,y,w,h);
                x += 50;
            } else {
                g.setColor(zwart);
                g.drawRect(x-25,y,w,h);
            }

        }


    }


}
