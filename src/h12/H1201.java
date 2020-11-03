package h12;
//Maak een applet in Java waarin een tabel van 10 getallen. Bereken het gemiddelde en zet de tien elementen
// en het gemiddelde op het scherm.
import java.applet.Applet;
import java.awt.*;

public class H1201 extends Applet {

    int [] getal;
    int totaal;


    @Override
    public void init() {

        getal = new int[10];

        for (int teller = 0; teller < 10; teller++){
            getal[teller] = 1 * (teller + 1);

        }


    }

    @Override
    public void paint(Graphics g) {
        for (int teller = 0; teller < 10; teller++){
            g.drawString("" + getal[teller], 50, 15 * teller + 20);
            totaal = totaal + getal[teller];

        }


        g.drawString("totaal: " + totaal, 50, 200);
    }
}
