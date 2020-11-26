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

        for(int i=0; i<10; i++) {

            muur(g, 0, 0,20,27,50, 25);

        }

    }

    public void muur (Graphics g,int x1,int y1,int x2, int y2, int w, int h){


        for(int i = 0; i<10; i++) {
            for (int n = 0; n<10; n++) {

                if (i < 10) {
                    g.fillRect(x1, y1, w, h);
                    //x1 += 27;

                    if (n % 2 == 0){
                        g.fillRect(x2, y2, w, h);
                    }
                }


            }
        }
    }
}
