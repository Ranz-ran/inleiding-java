package h06;
//Pratijkopdracht
import java.applet.Applet;
import java.awt.*;
//Een cursist heeft drie cijfers behaald: 5,9; 6.3; 6,9.
//Schrijf een applet in Java, waarin van de bovenstaande cijfers het gemiddelde wordt
// uitgerekend en dat gemiddelde met één decimaal op het scherm wordt getoond.
// Op het scherm komt te staan: Het gemiddelde is: 6.3. Het gemiddelde mag afgekapt worden
// en hoeft niet afgerond te worden. Als je klaar bent, lever je de broncode in bij je docent.
//
//Aanwijzing: Als je het gemiddelde hebt uitgerekend, komt er te staan 6.366666666...
// Door gebruik te maken van de eigenschappen van double en int kun je afkappen.
// Je moet het gemiddelde met 10 vermenigvuldigen en daarna converteren naar een int.
// Vervolgens terugconverteren naar een double en door 10 delen.
public class Pratijkopdr2 extends Applet {
    int cursisten;
    double ans4,ans3,c1,c2,c3,gem_cijfer,ans,ans2;
    public void init() {
        cursisten = 3;
        c1 = 5.9;
        c2 = 6.3;
        c3 = 6.9;
        gem_cijfer = c1+c2+c3;
        ans = gem_cijfer*10;
        ans2 = ans/3;
        ans3 = (int) ans2;
        ans4 = ans3 /10;
    }


    public void paint(Graphics g) {
    g.drawString(String.valueOf(ans4),50,50);
    }
}
