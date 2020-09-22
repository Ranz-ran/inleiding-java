package h08;
//Maak een applet waarin een tekstvak met label en een knop Ok staan. In het tekstvak moet een bedrag
// worden ingevuld en zodra de gebruiker op Ok klikt of op de enter-toets drukt moet de prijs inclusief
// BTW (= 21%) in het venster geplaatst worden.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Btw extends Applet {
    //generaal
    Color lpaars = new Color(216, 157, 231);
    double btw,bedrag;
    //tekst veld
    TextField ans;
    //ok knop
    Button ok;
    //label
    Label l1;

    public void init() {
        //generaal
        setBackground(lpaars);
        btw = 1.21;
        //tekst veld
        ans = new TextField();
        add(ans);
        //ok knop
        ok = new Button();
        add(ok);
        ok.addActionListener(new Ok_knop());
        //label
        l1 = new Label();
        add(l1);
    }


    public void paint(Graphics g) {
        //generaal
        //tekst veld
        ans.setSize(100,50);
        ans.setLocation(50,50);
        //ok knop
        ok.setSize(35,50);
        ok.setLabel("Enter");
        ok.setLocation(200,50);
        //label
        l1.setSize(200,30);
        l1.setLocation(50,100);
    }

    class Ok_knop implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //general
            ans.getText();
            bedrag = Double.parseDouble(ans.getText());
            ans.setText(String.valueOf(bedrag * btw));
            repaint();

        }
    }
}
