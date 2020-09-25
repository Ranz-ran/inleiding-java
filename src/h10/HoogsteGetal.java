package h10;
//Schrijf een applet, waarin de gebruiker in een tekstvak een getal kan intikken. Op het scherm wordt
// bijgehouden wat het hoogste getal is dat de gebruiker tot dan toe heeft ingevoerd.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HoogsteGetal extends Applet {
    //general
    Color mint;
    String hoogstecijfer,getal;
    //teskstvak
    TextField texvak;
    //knop
    Button push;
    //label


    @Override
    public void init() {
        //general
        mint = new Color(189, 248, 215, 206);

        setBackground(mint);
        hoogstecijfer = ("De hoogste cijfer is:");
        //knop
        push = new Button();
        add(push);
        push.addActionListener(new Pushknop());
        //tekstvak
        texvak = new TextField();
        add(texvak);
    }

    @Override
    public void paint(Graphics g) {
        //general
        g.drawString(hoogstecijfer,30,50);
        g.drawString(String.valueOf(getal),40,60);
        //knop
        push.setSize(35,50);
        push.setLabel("Enter");
        push.setLocation(200,50);
        //tekstvak
        texvak.setSize(100,50);
        texvak.setLocation(50,50);

    }

    class Pushknop implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //general
            texvak.getText();






            //tot hier
            int getal;
            getal = Integer.parseInt(texvak.getText());

        }
    }
}
