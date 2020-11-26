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



            muur(g,rood, 10, 10,50, 25);



    }

    public void muur (Graphics g,Color muurkleur,int kolom,int rij, int w, int h){

        g.setColor(muurkleur);

        for(int i = 0; i<rij; i++) {
            for (int n = 0; n<kolom; n++) {
                    if (i % 2 == 0){
                        g.fillRect(  (n*w)+n + (int)((double)w*0.5), i*h+i, w, h);
                    }else{
                        g.fillRect(n*w+n, i*h+i, w, h);
                    }
            }
        }
    }
}
