package h13;
//1. Maak een applet met een methode om een eenvoudige boom te tekenen. Bedenk zelf welke argumenten de methode
// zou moeten hebben.
//2. Gebruik de methode uit opdracht 1 om een boomgaard te tekenen die uit tenminste 2 rijen van minimaal 5 bomen
// bestaat.
import java.applet.Applet;
import java.awt.*;

public class P13 extends Applet {
    int xRect,yRect,wRect,hRect,xOval,yOval,wOval,hOval;
    Color boomStam,bladeren;

    public void init() {
        //beeld
        setSize(500,350);
        //boom stam
        xRect = 25;
        yRect = 70;
        wRect = 20;
        hRect = 100;
        boomStam = new Color(147, 82, 48);
        //bladeren
        xOval = 5;
        yOval = 50;
        wOval = 70;
        hOval = 100;
        bladeren = new Color(161, 219, 133);
    }
    public void paint(Graphics g) {
        Boom(g);
    }
    public void Boom(Graphics g){
        for (int i = 0; i < 2; i++) {
            for (int n = 0; n < 5; n++) {
                //boom stam
                g.setColor(boomStam);
                g.fillRect(xRect, yRect, wRect, hRect);
                xRect += wRect + 70;
                //bladeren
                g.setColor(bladeren);
                g.fillOval(xOval, yOval, wOval, hOval);
                xOval += wOval + 20;
            }
            yRect += 150;
            xRect = 20;
            yOval += 150;
            xOval = 0;
        }
    }
}