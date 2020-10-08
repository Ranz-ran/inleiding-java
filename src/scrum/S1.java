package scrum;

/*
tellen
deelbaar door 2? teken
deelbaar door 6? teken kwadraat
teken totaal
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class S1 extends Applet {
    int teller,totaal, y=20,hoogste;
    int[] getallen;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField("", 5);
        add(tekstvak);
        tekstvak.addActionListener(new TekstvakListener());
        getallen = new int[30];
    }

    public void paint(Graphics g) {

        y = 20;
        for (int i = 1; i < teller/2; i++) {

            g.drawString(String.valueOf(getallen[i]),30,y);
            y += 20;
        }

        g.drawString("Totaal: "+totaal,30,y);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            hoogste = Integer.parseInt( s );
            totaal = 0;

            for(teller = 2; teller <= hoogste; teller+=2) {

                if(teller % 6 == 0) {
                    int tijdelijkGetal;
                    tijdelijkGetal = teller * teller;
                    System.out.println(tijdelijkGetal);
                    getallen[teller/2] = tijdelijkGetal;
                    totaal = totaal + tijdelijkGetal;
                }
                else{
                    System.out.println(teller);
                    getallen[teller/2] = teller;
                    totaal = totaal + teller;

                }

            }
            System.out.println("totaal "+totaal);
            repaint();
        }
    }
}
