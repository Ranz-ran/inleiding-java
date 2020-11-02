package h11;
//Deze praktijkopdracht bevat twee opdrachten die over tafels gaan. Een tafel op het scherm ziet er als volgt uit:
//1 x 1 = 1
//2 x 1 = 2
//enz...
//
//Schrijf een applet in Java, waarin de gebruiker een getal invoert en als de gebruiker op de Ok-knop klikt,
// verschijnt de tafel van dat getal in het venster. Dus als de gebruiker een 9 heeft ingetikt, verschijnt de
// tafel van 9. Als de gebruiker opnieuw een getal intikt, wordt die tafel weergegeven.
//
//Schrijf een applet in Java, waarin de tafels van 1 tot en met 10 worden weergegeven. Als één tafel op het scherm
// zichtbaar is en de gebruiker klikt op de Ok-knop, dan wordt de volgende tafel zichtbaar.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P011 extends Applet {
    int x,y,userInput,t1,t2,t3;
    TextField txv1;
    String print;
    Button ok;
    Label l1;

    @Override
    public void init() {
        Color paars = new Color(229, 191, 239, 255);
        setBackground(paars);

        userInput = 0;
        x = 30;
        y = 30;
        t1 = 1;
        t2 = 2;
        t3 = 3;

        print = " "+ t1 +" x " + userInput + " = ";

        ok = new Button("ok");
        add(ok);
        ok.setLocation(50,20);
        ok.addActionListener(new AL1());
        txv1 = new TextField("");
        add(txv1);
        l1 = new Label("...");
        txv1.setLocation(20,20);
        txv1.addActionListener(new AL1());
    }

    @Override
    public void paint(Graphics g) {
        //userInput = 1
        for (int ans1 = 1; ans1 <= 10; ans1 += 1) {
            y += 20;
            int antwoord = userInput * ans1;
            g.drawString("De tafel van " + userInput + " is " + ans1 + " * " + userInput + " = " + String.valueOf(antwoord), x + 50, y);
        }

    }

    class AL1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            userInput = Integer.parseInt(txv1.getText());
            y = 30;
            repaint();
        }
    }


}
