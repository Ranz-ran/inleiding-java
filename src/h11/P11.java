package h11;
//Deze praktijkopdracht bevat twee opdrachten die over tafels gaan. Een tafel op het scherm ziet er als volgt uit:
//1 x 1 = 1
//2 x 1 = 2
//enz...
//
//Schrijf een applet in Java, waarin de gebruiker een getal invoert en als de gebruiker op de Ok-knop klikt,
// verschijnt de tafel van dat getal in het venster. Dus als de gebruiker een 9 heeft ingetikt, verschijnt de
// tafel van 9. Als de gebruiker opnieuw een getal intikt, wordt die tafel weergegeven.
//
//Schrijf een applet in Java, waarin de tafels van 1 tot en met 10 worden weergegeven. Als één tafel op het scherm
// zichtbaar is en de gebruiker klikt op de Ok-knop, dan wordt de volgende tafel zichtbaar.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class P11 extends Applet {

    //general
    int t1,x,y,x1,w,h,ans1;
    String userInput,print;
    Button ok;
    TextField txv1;

    @Override
    public void init() {
        //tafels (eerste opdracht
        //location&with,h
        x = 30;
        y = 30;
        x1 = 60;
        w = 30;
        h = 30;
        //
        ok = new Button("ok");
        add(ok);

        txv1 = new TextField();
        add(txv1);

    }

    @Override
    public void paint(Graphics g) {
        //tafels (eerste opdracht
        ////txv
        ok.setSize(w,h);
        ok.setLocation(x1,y);
        ok.addActionListener(new Txv());
        txv1.setLocation(x,y);
        txv1.addActionListener(new Txv());

        g.drawString(print,30,y+50);

        for (ans1 = 1; ans1 <= 10; ans1++) {
            y += 20;
            

            if (ans1 == 1) {print = ""+ans1+" x 1 = "+t1 +"";}
            else {print = "Deze tafel staat niet in het rijtje";}

            g.drawString(print,30,y+90);
        }

    }

    class Txv implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("test");
            userInput = txv1.getText();

            repaint();

            //if (ans1 == 1) {print = ""+ans1+" x 1 = "+t1 +"";}
            //else {print = "Deze tafel staat niet in het rijtje";}



        }

    }

}
