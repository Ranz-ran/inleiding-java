package h10;
//icjders kan invoeren
//Voldoende of onvoldoende
//gemiddelde cijfer behouden
//ok-knop= gemiddeld + leerling geslaagd?
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_5 extends Applet {
    //general
    Color b;
    int gem;
    //TextFiel
    TextField txv;
    //buttom
    Button ok;
    //String
    String print;



    @Override
    public void init() {
        //general
        b = new Color(177, 183, 212, 228);
        setBackground(b);
        gem = 6;
        print = "...";
        //TextField
        txv = new TextField();
        add(txv);
        txv.addActionListener(new Al());
        //buttom
        ok = new Button("OK");
        add(ok);
        ok.addActionListener(new Al());

    }

    @Override
    public void paint(Graphics g) {
        //general
        g.drawString(print,90,115);
        //TextFiel
        txv.setLocation(25,100);
        //
        ok.setLocation(55,100);
        ok.setSize(27,23);


    }

    public class Al implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.print("test");

            String user_input = txv.getText();

            switch (user_input) {
                case "10" :
                case "9" :
                case "8" :
                case "7" :
                case "6" :
                    print = "Je bent geslaagd. Klas gemiddelde cijfer is: " + gem ;break;
                case "5" :
                case "4" :
                case "3" :
                case "2" :
                case "1" :
                    print = "Je bent niet geslaagd. Klas gemiddelde cijfer is: " + gem ;break;
                default: print = "Je hebt verkeerde cijfer ingevoerd.";

            }
            repaint();
        }
    }
}
