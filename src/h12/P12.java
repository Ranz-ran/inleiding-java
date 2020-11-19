package h12;
//Schrijf een applet in Java, waarin de gebruiker 10 namen en 10 telefoonnummers kan invoeren. Telkens als de
// gebruiker op de Ok-knop klikt, wordt er naar de volgende elementen gegaan van de tabellen. Als de gebruiker na
// het tiende element op de Ok-knop klikt, worden alle elementen in het venster getoond.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class P12 extends Applet {

    int[] tabel = new int[i];
    Button ok;
    TextField txv;

    @Override
    public void init() {

        ok = new Button("ok");
        add(ok);
        ok.addActionListener(new Al());
        txv = new TextField();


    }

    @Override
    public void paint(Graphics g) {


    }

    class Al implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
