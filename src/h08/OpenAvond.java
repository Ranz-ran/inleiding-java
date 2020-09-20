package h08;

//Op de open avonden van school wordt bijgehouden ||hoeveel|| mannen en vrouwen en hoeveel potentiële vrouwelijke
// en mannelijke leerlingen de school op zo'n avond bezoeken. Schrijf een applet waarin alleen op één van
// de vier knoppen geklikt hoeft te worden en de vier aantallen en het totaal wordt in het venster van de applet
// worden bijgehouden.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenAvond extends Applet {
    //general
    int een_person,twee, drie, vier;
    //knoppen
    Button man,vrouw,meiden,jongen;
    int breete,hoogte,xas,yas;
    //meiden
    //jongen

    public void init() {
        //general
        een_person = 0 ;
        twee = 0 ;
        drie = 0;
        vier = 0;
        breete = 75;
        hoogte = 20;
        xas = 50;
        yas = 30;
        //mannen
        man = new Button("Man+0");
        add(man);
        man.addActionListener(new Knop());
        //vrouwen
        vrouw = new Button("Vrouw+0");
        add(vrouw);
        vrouw.addActionListener(new Knop2());
        //meiden
        meiden = new Button("Meiden+0");
        add(meiden);
        meiden.addActionListener(new Knop3());
        //jongen
        jongen = new Button("Jongen+0");
        add(jongen);
        jongen.addActionListener(new Knop4());
    }



    public void paint(Graphics g) {
        //general

        //mannen
        man.setSize(breete,hoogte);
        man.setLabel("man+");
        man.setLocation(xas,yas);
        //vrouwen
        vrouw.setSize(breete,hoogte);
        vrouw.setLabel("vrouwen+");
        vrouw.setLocation(xas+80,yas);
        //meiden
        meiden.setSize(breete,hoogte);
        meiden.setLabel("meiden+");
        meiden.setLocation(xas+160,yas);
        //jongen
        jongen.setSize(breete,hoogte);
        jongen.setLabel("jongen+");
        jongen.setLocation(xas+240,yas);
    }

    class Knop implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            //general
            man.setLabel("man" + "+" + (een_person += 1));
        }
    }

    class Knop2 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            vrouw.setLabel("vrouw" + "+" + (twee += 1));

        }
    }

    class Knop3 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            meiden.setLabel("meid" + "+" + (drie += 1));

        }
    }

    class Knop4 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            jongen.setLabel("jongen" + "+" + (vier += 1));

        }
    }

}
