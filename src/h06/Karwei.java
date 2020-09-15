package h06;

import java.applet.Applet;
import java.awt.*;

//Met z'n vieren (Jan, Ali, Jeannette en jij) hebben jullie een karwei verricht
// en daarmee 113 euro verdiend. Schrijf een applet waarin je een berekening maakt
// om het geld zo eerlijk mogelijk te verdelen. In het venster van de applet komen
// de vier namen onder elkaar te staan met daarachter het bedrag dat een ieder krijgt.

public class Karwei extends Applet {
    //inhoud
    int Jan, Ali, Jeannette, Rita, aantal_mensen;
    //assenstalse
    int xas, xas2, yas1,yas2,yas3,yas4;
    //ans
    double totaal, verdeeld_bedrag;
    //kleuren
    Color lb = new Color(173, 195, 227);

    public void init() {
        setBackground(lb);
        totaal = 113.00;
        aantal_mensen = 4;
        verdeeld_bedrag = 113.00/4.00;
        //assenstelsel
        xas = 150;
        xas2 = 50;
        yas1 = 100;
        yas2 = 120;
        yas3 = 140;
        yas4 = 160;
    }

    
    public void paint(Graphics g) {
        //Jan
        g.drawString("Jan",xas2,yas1);
        g.drawString(String.valueOf(verdeeld_bedrag), xas, yas1);
        //Ali
        g.drawString("Ali",xas2,yas2);
        g.drawString(String.valueOf(verdeeld_bedrag), xas, yas2);
        //Jeannette
        g.drawString("Jeannette",xas2,yas3);
        g.drawString(String.valueOf(verdeeld_bedrag), xas, yas3);
        //Rita
        g.drawString("Rita",xas2,yas4);
        g.drawString(String.valueOf(verdeeld_bedrag), xas, yas4);
    }
}
