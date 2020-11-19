package h12;
//Maak een tabel, waarin elementen dezelfde waarde hebben. In de applet kan de gebruiker een waarde intikken.
// Vervolgens laat het programma de waarde zien en hoeveel keer de waarde voorkomt.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H1206 extends Applet {

    boolean found;
    int[] tabel = {5,5,5,5,5,5,5};
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


        if (found == true){
            g.drawString("waarde is gevonden : )    " + "Het komt " + max + " voor.",20,50);
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
