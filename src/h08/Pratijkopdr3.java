package h08;
//Maak een rekenmachine in een applet. De rekenmachine bestaat uit twee tekstvakken en vier knoppen.
// De gebruiker tikt in het eerste tekstvak een getal in en in het tweede en klikt vervolgens op één van
// de knoppen om de berekening te laten uitvoeren. De uitkomst wordt in het eerste tekstvak getoond en het tweede
// tekstvak wordt leeggemaakt.
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pratijkopdr3 extends Applet {
//general
    Color blauw,paars;
    int breete,hoogte,bxas,byas,ans,ans2;
//knop
    Button plus,min,keer,gedeeldoor;
//textveld
    JTextField rekenen,getal2,lebel4;



    @Override
    public void init() {



        //general
        blauw = new Color(163, 230, 239);
        setBackground(blauw);

        breete = 25;
        hoogte = 25;
        bxas = 200;
        byas = 50;
        //knop
        plus = new Button();
        add(plus);
        plus.addActionListener(new Plus());

        min = new Button();
        add(min);
        min.addActionListener(new Min());

        keer = new Button();
        add(keer);
        keer.addActionListener(new Keer());

        gedeeldoor = new Button();
        add(gedeeldoor);
        gedeeldoor.addActionListener(new Gedeeldoor());
        //textveld
        rekenen = new JTextField();
        add(rekenen);
        getal2 = new JTextField();
        add(getal2);
        lebel4 = new JTextField();
        add(lebel4);



    }

    @Override
    public void paint(Graphics g) {
        //general
        g.drawString("Rekenmachine",150,20);
        //knop
        /////plus
        plus.setSize(breete,hoogte);
        plus.setLabel("+");
        plus.setLocation(bxas,byas);
        /////min
        min.setSize(breete,hoogte);
        min.setLabel("-");
        min.setLocation(bxas+30,byas);
        /////keer
        keer.setSize(breete,hoogte);
        keer.setLabel("×");
        keer.setLocation(bxas+60,byas);
        /////gedeeldoor
        gedeeldoor.setSize(breete,hoogte);
        gedeeldoor.setLabel("÷");
        gedeeldoor.setLocation(bxas+90,byas);
        //textveld
        rekenen.setSize(75,25);
        rekenen.setLocation(bxas-165,byas);
        getal2.setSize(75,25);
        getal2.setLocation(bxas-82,byas);
        //label
        lebel4.setSize(100,25);
        lebel4.setLocation(bxas-160,byas+50);


    }

    class Plus implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            rekenen.getText();
            ans = Integer.parseInt(rekenen.getText());
            getal2.getText();
            ans2 = Integer.parseInt(getal2.getText());
            lebel4.setText(String.valueOf(ans+ans2));
        }
    }
    class Min implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            rekenen.getText();
            ans = Integer.parseInt(rekenen.getText());
            getal2.getText();
            ans2 = Integer.parseInt(getal2.getText());
            lebel4.setText(String.valueOf(ans-ans2));
        }
    }
    class Keer implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            rekenen.getText();
            ans = Integer.parseInt(rekenen.getText());
            getal2.getText();
            ans2 = Integer.parseInt(getal2.getText());
            lebel4.setText(String.valueOf(ans*ans2));
        }
    }
    class Gedeeldoor implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            rekenen.getText();
            ans = Integer.parseInt(rekenen.getText());
            getal2.getText();
            ans2 = Integer.parseInt(getal2.getText());
            lebel4.setText(String.valueOf(ans/ans2));

        }
    }
}
