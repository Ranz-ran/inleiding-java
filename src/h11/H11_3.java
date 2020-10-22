package h11;
//Geef de rij van Fibonacci. De eerste twee getallen van de rij zijn 1 en de volgende zijn de som van de twee voorgangers.
//1, 1, 2, 3, 5, 8, 13, 21, en zo voort...
import java.applet.Applet;
import java.awt.*;

public class H11_3 extends Applet {
    //general
    int eerstGetal,tweedeGetal,som,y;
    Color paars;


    @Override
    public void init() {
        //general
        paars = new Color(204, 176, 239);
        setBackground(paars);

        eerstGetal = 1;
        tweedeGetal = 1;
        som = 0;
        y = 0;
        //inhoud




    }

    @Override
    public void paint(Graphics g) {



        for(int teller =1 ; teller<= 10 ; teller++ ){

            y += 20;

            som = eerstGetal + tweedeGetal;
            g.drawString(""+som,200,y);
            eerstGetal = tweedeGetal;
            tweedeGetal= som;

            //n3=n1+n2;
            //  System.out.print(" "+n3);
            //  n1=n2;
            //  n2=n3;

        }




    }



}
