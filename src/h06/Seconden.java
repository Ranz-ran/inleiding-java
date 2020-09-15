package h06;

import java.applet.Applet;
import java.awt.*;
//opdracht 6.2
//Schrijf een applet, waarin berekend wordt hoeveel seconden er in een uur, dag en jaar gaan
// en de uitkomst van de berekening in het venster van de applet toont.
public class Seconden extends Applet {
    Color lg = new Color(135, 227, 187);
    //tijd
    int sec,min,uur, dag, jaar;
    //hulp middel
    int xas,yas,xas2;

    public void init() {
        setBackground(lg);
        //tijden
        sec = 60;
        min = sec*60;
        uur = min*60;
        dag = uur*24;
        jaar= dag*365;
        //hulp middel
        xas = 60;
        xas2= 200;
        yas = 80;
    }


    public void paint(Graphics g) {
        g.drawString(String.valueOf(uur),xas,yas);
        g.drawString("seconden zit er in een uur.",xas2,yas);
        g.drawString(String.valueOf(dag),xas,yas+20);
        g.drawString("seconden zit er in een dag.",xas2,yas+20);
        g.drawString(String.valueOf(jaar),xas,yas+40);
        g.drawString("seconden zit er in een jaar.",xas2,yas+40);
    }
}
