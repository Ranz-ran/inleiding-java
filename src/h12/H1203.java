package h12;
//Maak een applet waarin vijf tekstvakken (uiteraard in een tabel) worden getoond. In de tekstvakken moet de
// gebruiker getallen in kunnen voeren. Als de gebruiker op de Ok-knop klikt worden de getallen in oplopende volgorde
// gesorteerd getoond in de tekstvakken.

// 5 tekst vakken
//getallen kunnen in vullen
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H1203 extends Applet {

    int i;
    String userInput;
    TextField[] txv = new TextField[5];
    Button ok;



    @Override
    public void init() {

        ok = new Button("ok");
        ok.addActionListener(new Al());
        ok.setLocation(30,50);
        add(ok);

        for (i = 0; i < 5; i++) {
            txv[i] = new TextField("");
            add(txv[i]);
            txv[i].addActionListener(new Al());



        }



    }

    @Override
    public void paint(Graphics g) {

        g.drawString(userInput + "", 30, 60);

    }

    class Al implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            userInput = txv[i].getText();
        }
    }


}