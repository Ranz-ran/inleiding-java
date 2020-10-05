package h10;
//cijfers invoeren
//slecht, onvoldoende, matig, voldoende, goed
// waarschuwing: verkeerde cijfer
//1-3 = slecht
//4 = onvoldoende
//5 = matig
//6-7 = voldoende
//8-10 = goed

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pratijk3 extends Applet {
    //general
    Color mint;
    //TextFiel
    TextField txv;
    //buttom
    Button ok;
    //String
    String print;



    @Override
    public void init() {
        //general
        mint = new Color(163, 243, 214, 228);
        setBackground(mint);
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
                    print = "Je hebt een goed."; break;
                case "7" :
                case "6" :
                    print = "Je hebt een voldoede." ;break;
                case "5" : print = "Je hebt mating" ; break;
                case "4" : print = "Je hebt een onvoldoende"; break;
                case "3" :
                case "2" :
                case "1" :
                    print = "Helaas je heeft slecht cijfer." ; break;
                default: print = "Let op! Je hebt verkeerde cijfer ingevoerd!";

            }
            repaint();
        }
    }
}
