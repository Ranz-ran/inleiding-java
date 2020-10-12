package h11;
//Schrijf een applet, waarin 10 verticale lijnen worden getoond.
import java.applet.Applet;
import java.awt.*;

public class H11_1 extends Applet {
    //general
    Color mint;
    int line,x1;

    @Override
    public void init() {
        //general
        mint = new Color(200, 246, 218, 255);
        setBackground(mint);
        //
        x1 = 30;

    }

    @Override
    public void paint(Graphics g) {


        for(line = 0; line <10; line ++) {
            //y += 20;
            //g.drawLine(50 , y, 300, y );
            //g.drawString("" + teller, 305, y );
            x1 += 30;
            g.drawLine(x1,50,x1,200);

        }

        
    }
}
