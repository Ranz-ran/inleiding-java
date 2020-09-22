package h08;

//Maak een applet in Java, waarin een tekstvak met een label en twee knoppen voorkomen.
// De eerste knop is de ok-knop die ervoor zorgt dat wat de gebruiker in het tekstvak
// heeft ingetikt in het venster van de applet zichtbaar wordt. De tweede knop is de reset-knop
// die het tekstvak leeg maakt als de gebruiker erop klikt.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextV extends Applet {
    //general
    int buttonxas,
        buttonxas2,
        buttonyas,
        breete,
        hoogte,
        prijs;
    Color blauw;
    String message;
    //ok
    Button ok;
    //reset
    Button reset;
    //teskstvak
    TextField code_in_voeren;
    Label stiker;


    @Override
    public void init() {

        //general
        buttonxas = 130;
        buttonxas2 = 200;
        buttonyas = 30;
        breete = 60;
        hoogte = 25;
        prijs = 10000;
        blauw = new Color(183, 221, 253);
        setBackground(blauw);
        //ok
        ok = new Button ("ok");
        add(ok);
        ok.addActionListener(new Myloop());
        //reset
        reset = new Button ("reset");
        add(reset);
        reset.addActionListener(new Myloop2());
        //tesktvak
        code_in_voeren = new TextField("Voer hier uw code in.");
        add(code_in_voeren);
        stiker = new Label("nooit proberen nooit raken!");
        add(stiker);

    }

    @Override
    public void paint(Graphics g) {

        //general
        //ok
        ok.setSize(breete,hoogte);
        ok.setLabel("ok");
        ok.setLocation(buttonxas,buttonyas);
        //reset
        reset.setSize(breete,hoogte);
        reset.setLabel("reset");
        reset.setLocation(buttonxas2,buttonyas);
        //tesktvak
        code_in_voeren.setSize(200,hoogte);
        code_in_voeren.setLocation(90,65);
        stiker.setLocation(90, 90);

    }

    class Myloop implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            //general
            message = code_in_voeren.getText();
            ok.setLabel(message);
            stiker.setText(message);
            //of "Voer hier uw code in."
            //of "Gefeliciteerd!!! Uw heeft een prijs van"+prijs+"gewonnen!!!"
            repaint();

        }
    }

    class Myloop2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            reset.setLabel("");
            stiker.setText("");

            repaint();
        }


    }
}
