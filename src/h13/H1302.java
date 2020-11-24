package h13;

//Schrijf een applet in Java waarin in een methode een muur van rode bakstenen wordt getoond.
import java.applet.Applet;
import java.awt.*;

public class H1302 extends Applet {

    Color rood;

    @Override
    public void init() {

        rood = new Color(165, 30, 30);

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(rood);
        muur(g,0,0);


    }

    public void muur (Graphics g,int x1,int y1){



                g.fillRect(0, 0, 50, 30);

    }
}
