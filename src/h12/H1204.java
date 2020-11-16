package h12;
//Maak een applet met een tabel met getallen, waarin de gebruiker een getal kan intikken in een tekstvak. Als de
// gebruiker op de OK-knop klikt dan wordt de waarde opgezocht in de tabel en staat op het scherm niet alleen dat
// de waarde is gevonden maar ook de index. Als de waarde niet is gevonden dan wordt daarvan melding gedaan.

//tabel met getallen
//tekstvak
//ok knop
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H1204 extends Applet {

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
        //txv.addActionListener(new Al());
        ok = new Button("ok");
        add(ok);
        ok.addActionListener(new Al());


       /* max = tabel[0];
        for (int getal = 0; getal < tabel.length; getal++) {
            if(tabel[getal] > max) {
                max = tabel[getal];

            }
        }*/

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


           /* for (int getal=0; getal<7 ; getal++) {
                userInput = txv.getText();
                max = Integer.parseInt(userInput);
                getGraphics().drawString(max+"",30,y);
                y+= 20;



            }*/



            /*for (int getal=0; getal<7 ; getal++){
                txv.setText(tabel[getal]+"");



            }*/
        }
    }


}
