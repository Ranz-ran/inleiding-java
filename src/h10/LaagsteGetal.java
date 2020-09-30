package h10;
//Breid de applet uit opdracht 1 zo uit dat ook het laagste getal bijgehouden wordt.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaagsteGetal extends Applet {
    //general
    Color blauw;
    //textfield
    TextField texv1;
    String print;




    @Override
    public void init() {
        //general
        blauw = new Color(174, 206, 243);
        setBackground(blauw);
        //textfield
        texv1 = new TextField("");
        add(texv1);
        texv1.addActionListener(new Al());
        print = "...";
    }



    @Override
    public void paint(Graphics g) {
        //general
        g.drawString("Welke getal is de grootste getal?",30,50);
        g.drawString("10, 5, 20, 43",30,65);
        //textfield
        texv1.setLocation(30,70);
        texv1.setSize(50,25);

        g.drawString(print,30,110);
    }



    public class Al implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //general
            System.out.println("test");
            String user_input = texv1.getText();


            //switch (user_input) {
            //    case "5": print = "Dit is de kleinste getal van het rijtje!"; break;
            //    case "10": print = "Helaas dit is niet de goede."; break;
            //    case "20": print = "Helaas dit is niet de goede."; break;
            //}
            //if (user_input.equals("43")) { print = "43, Yess dit is de grootste getaal in het rijtje!";}
            //else if { print = "Deze getal staat niet in dit rijtje...";}
            //texv1.setText("");
            //repaint();

            switch (user_input) {
                case "10": print = "Helaas dit is niet de goede"; break;
                case "5": print = "Dit is de kleinste getal"; break;
                case "20": print = "Helaas dit is niet de goede"; break;
                case "43": print = "43, Yess dit is de grootste getaal in het rijtje!"; break;
                default: print =  "Dit cijfer staat niet in het rijtje"; break;


            }
            texv1.setText("");
            repaint();

        }
    }
}

