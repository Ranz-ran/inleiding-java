package h12;
//Zorg ervoor dat de lus waarin gezocht wordt naar een bepaalde waarde in voorbeeld 12.4 stopt als de waarde
// gevonden is. Zoek op internet hoe je dit kunt doen.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H1205 extends Applet {

    boolean found;
    int[] tabel = {1,3,4,8,11,14,15};
    int y,max;
    TextField txv;
    Button ok;


    @Override
    public void init() {

        y = 70;

        txv = new TextField();
        add(txv);
        ok = new Button("ok");
        add(ok);
        ok.addActionListener(new Al());


    }

    @Override
    public void paint(Graphics g) {

        // g.drawString("De waarde is gevonden:) " + max, 50, 50);
        

        if (found == true){
            g.drawString("waarde is gevonden : )    " + "En index is: " + max,20,50);
        }
        else {g.drawString("waarde is niet gevonden...",20,50);}

    }

    class Al implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            found = false;
            int gegevenGetal = Integer.parseInt(txv.getText());
            for (int i = 0; i < tabel.length; i++){
                if (tabel[i] == gegevenGetal){
                    found = true;
                    max = i;
                }

            }
            repaint();
        }
    }


}
