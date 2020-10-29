package h11;
//Schrijf een applet waarin een schaakbord op het scherm wordt getekend. Een schaakbord heeft 8 bij 8 vakken om en
// om wit en zwart
import java.applet.Applet;
import java.awt.*;

public class H1109 extends Applet {

     int x,y,w,h,c;
     Color zwart;

    @Override
    public void init() {
        setSize(600,400);
        zwart = new Color (0, 0, 0);

        x = 30;
        y = 30;
        w = 25;
        h = 25;
    }

    @Override
    public void paint(Graphics g) {
        for (c = 0; c <8; c++){
            for (int b = 0; b <8; b++){
                if (b == 0 || b == 2 || b ==4 || b == 6 ) {
                    if (c % 2 == 0){
                        g.setColor(zwart);
                        g.fillRect(x,y,w,h);
                    } else {
                        g.setColor(zwart);
                        g.drawRect(x,y,w,h);
                    }
                } else {
                    if (c % 2 == 1){
                        g.setColor(zwart);
                        g.fillRect(x,y,w,h);
                    } else {
                        g.setColor(zwart);
                        g.drawRect(x,y,w,h);
                    }
                }
                x += 25;
            }
            y+= 25;
            x = 30;
        }
    }
}