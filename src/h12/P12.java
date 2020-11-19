package h12;
//Schrijf een applet in Java, waarin de gebruiker 10 namen en 10 telefoonnummers kan invoeren. Telkens als de
// gebruiker op de Ok-knop klikt, wordt er naar de volgende elementen gegaan van de tabellen. Als de gebruiker na
// het tiende element op de Ok-knop klikt, worden alle elementen in het venster getoond.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P12 extends Applet {

    int[] nummer = new int[10];
    String[] naam = new String[10];
    int y,i;
    Button ok;
    TextField txv,txv2;
    boolean volleArray;

    @Override
    public void init() {

        i=0;

        ok = new Button("ok");
        add(ok);
        ok.addActionListener(new Al());
        txv = new TextField();
        add(txv);
        txv2 = new TextField();
        add(txv2);

        y=60;
    }

    @Override
    public void paint(Graphics g) {

        ok.setLocation(90, 30);

        txv.setLocation(30, 30);
        txv.setSize(60, 25);
        txv2.setLocation(200, 30);
        txv2.setSize(60, 25);

        if (volleArray) {
            for (i = 0; i < 10; i++) {


                g.drawString("" + naam[i] + "" + nummer[i], 50, 20 * i + 20);

            }
        }
    }

    class Al implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(i >=10) {
                volleArray = true;
            }else {

                String s = txv.getText();
                String t = txv2.getText();
                naam[i] = s;
                nummer[i] = Integer.parseInt(t);
                i++;
            }repaint();

        }
    }
}
