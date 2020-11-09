package h12;
//Maak een applet waarin vijf tekstvakken (uiteraard in een tabel) worden getoond. In de tekstvakken moet de
// gebruiker getallen in kunnen voeren. Als de gebruiker op de Ok-knop klikt worden de getallen in oplopende volgorde
// gesorteerd getoond in de tekstvakken.
import java.applet.Applet;
import java.awt.*;

public class H1203 extends Applet {

    TextField txv[] = new TextField[5];


    @Override
    public void init() {


        for (int i = 0; i < 5; i++){
            txv[i] = new TextField("test...");
            add(txv[i]);

        }

    }

    @Override
    public void paint(Graphics g) {



    }
}