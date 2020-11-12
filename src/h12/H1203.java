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
import java.util.Arrays;

public class H1203 extends Applet {

    int i;
    int[] tabel = new int[5];
    String userInput;
    TextField[] txv = new TextField[5];
    Button ok;



    @Override
    public void init() {

        userInput = String.valueOf(0);

        ok = new Button("ok");
        ok.addActionListener(new Al());
        ok.setLocation(30,50);
        add(ok);

        for (i = 0; i < 5; i+= 1) {
            txv[i] = new TextField("");
            add(txv[i]);

        }



    }

    @Override
    public void paint(Graphics g) {


    }

    class Al implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
          //  int getal;
            for (int getal=0; getal<5 ; getal++) {
            userInput = txv[getal].getText();
            tabel[getal] = Integer.parseInt(userInput);
            }
            Arrays.sort(tabel);

            for (int getal=0; getal<5 ; getal++){
                txv[getal].setText(tabel[getal]+"");

            }

        }
    }


}