package h10;
//Breid de applet zo uit, dat ook het jaar ingegeven kan worden en aan de hand daarvan wordt
// bepaald of het om een schrikkeljaar gaat om het juiste aantal dagen voor februari te kunnen
// vaststellen.
//
//
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_4 extends Applet {
    //general
    Color b;
    int y1,jaartal;
    TextField txv1;
    String jaar;



    @Override
    public void init() {


        //general
        b = new Color (193, 210, 239);
        setBackground(b);
        y1 = 30;
        jaar = ("");
        //TextField
        txv1 = new TextField();
        add(txv1);
        txv1.addActionListener(new Al());

    }



    @Override
    public void paint(Graphics g) {
        txv1.setSize (50,25);
        txv1.setLocation (200,y1);
        g.drawString("Voer hier een jaartal in:",55,y1+16);
        g.drawString(jaar,55,y1+50);
    }



    private class Al implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            jaar = txv1.getText();
            jaartal = Integer.parseInt(jaar);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {

                jaar = ""+ jaartal + " is schrikkeljaar, februarie heeft dus 29 dagen.";
            }
            else {
                jaar = ""+ jaartal + " is geen schrikkeljaar, februarie heeft alleen 28 dagen.";

            }

            repaint();
        }

    }


}
