package h10;
//Schrijf een applet, waarin het maandnummer ingetikt wordt en de maandnaam en het aantal dagen wordt getoond.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dagen extends Applet {
    //general
    TextField txv1;
    int x1, grootm,kleinem,special;
    String print;



    @Override
    public void init() {
        //general
        x1 = 30;
        grootm = 31;
        kleinem = 30;
        special = 28;
        print = "...";
        //textfield
        txv1 = new TextField("");
        add(txv1);
        txv1.addActionListener(new Al1());
    }


    @Override
    public void paint(Graphics g) {
        //general
        g.drawString("Voer hier onder een maand in (Afkorting kan ook):",x1,35);
        txv1.setSize(70,25);
        txv1.setLocation(x1,50);

        g.drawString(print,x1,150);


    }


    public class Al1 implements ActionListener{



        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("test");
            String user_input = txv1.getText();

            //grote maanden
            //if ("Januarie".equals(user_input)) { print = "Deze maand heeft " + grootm + " dagen"; }
            //if ("Maart".equals(user_input)) { print = "Deze maand heeft " + grootm + " dagen"; }
            //if ("Mei".equals(user_input)) { print = "Deze maand heeft " + grootm + " dagen"; }
            //if ("Juli".equals(user_input)) { print = "Deze maand heeft " + grootm + " dagen"; }
            //if ("Augustus".equals(user_input)) { print = "Deze maand heeft " + grootm + " dagen"; }
            //if ("Oktober".equals(user_input)) { print = "Deze maand heeft " + grootm + " dagen"; }
            //if ("December".equals(user_input)) { print = "Deze maand heeft " + grootm + " dagen"; }
            //kleine maanden
            //if ("April".equals(user_input)) { print = "Deze maand heeft " + kleinem + " dagen"; }
            //if ("Juni".equals(user_input)) { print = "Deze maand heeft " + kleinem + " dagen"; }
            //if ("September".equals(user_input)) { print = "Deze maand heeft " + kleinem + " dagen"; }
            //if ("November".equals(user_input)) { print = "Deze maand heeft " + kleinem + " dagen"; }
            //Special maanden
            //else if ("Februarie".equals(user_input)) { print = "Deze maand heeft " + special + " dagen"; }


            switch (user_input) {
                case "Januarie" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "Jan" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "Februarie" : print = "Deze maand heeft " + special + " dagen"; break;
                case "Feb" : print = "Deze maand heeft " + special + " dagen"; break;
                case "Maart" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "Mrt" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "April" : print = "Deze maand heeft " + kleinem + " dagen"; break;
                case "Apr" : print = "Deze maand heeft " + kleinem + " dagen"; break;
                case "Mei" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "Juni" : print = "Deze maand heeft " + kleinem + " dagen"; break;
                case "Jun" : print = "Deze maand heeft " + kleinem + " dagen"; break;
                case "Juli" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "Jul" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "Augustus" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "Aug" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "September" : print = "Deze maand heeft " + kleinem + " dagen"; break;
                case "Sep" : print = "Deze maand heeft " + kleinem + " dagen"; break;
                case "Oktober" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "Okt" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "November" : print = "Deze maand heeft " + kleinem + " dagen"; break;
                case "Nov" : print = "Deze maand heeft " + kleinem + " dagen"; break;
                case "December" : print = "Deze maand heeft " + grootm + " dagen"; break;
                case "Dec" : print = "Deze maand heeft " + grootm + " dagen"; break;
                default: print = "Deze maand bestaat niet!"; break;
            }


            txv1.setText("");
            repaint();



        }
    }
}