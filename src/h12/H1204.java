package h12;
//Maak een applet met een tabel met getallen, waarin de gebruiker een getal kan intikken in een tekstvak. Als de
// gebruiker op de OK-knop klikt dan wordt de waarde opgezocht in de tabel en staat op het scherm niet alleen dat
// de waarde is gevonden maar ook de index. Als de waarde niet is gevonden dan wordt daarvan melding gedaan.

//tabel met getallen
//tekstvak
//ok knop
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H1204 extends Applet {

    int[] getal = {1,3,4,8,11,14,15};
    TextField txv;
    Button ok;

    @Override
    public void init() {

        txv = new TextField("...");
        add(txv);
        txv.addActionListener(new Al());
        ok = new Button("ok");
        add(ok);
        ok.addActionListener(new Al());


        //for (int i=0; i>=15; i++ );{

        //}
    }

    @Override
    public void paint(Graphics g) {

        g.drawString(getal+"",30,50);

    }

    class Al implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


}
