package h06;
//opdracht 6.3
import java.applet.Applet;
import java.awt.*;
//Schrijf een applet waarin je twee ints met positieve waarden bij elkaar optelt
// en er een negatieve int uit komt.
public class Negatief extends Applet {
    Color lp = new Color(198, 173, 227);
   int eerste_getal;
   int ans;
   int tweede_getal;
    public void init() {
        setBackground(lp);
        eerste_getal = 10;
        tweede_getal = 2147483647;
        ans = tweede_getal + eerste_getal;

    }


    public void paint(Graphics g) {
        g.drawString(String.valueOf(ans),50,50);

    }
}
