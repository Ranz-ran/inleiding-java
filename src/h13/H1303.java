package h13;
//Schrijf een applet die bij de start alleen twee knoppen toont. Als de gebruiker op de éne knop klikt krijgt
// hij een muur met rode bakstenen te zien en als hij op de andere knop klikt, krijgt hij een muur met grijze
// betonblokken te zien. De betonblokken zijn groter dan de bakstenen. Bedenk zelf welke methodes je nodig hebt
// met welke argumenten.

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H1303 extends Applet {

    Color rood,grijs,muurkleur;
    Button red,gray;
    boolean click,click2;

    @Override
    public void init() {

        setSize(1065,600);

        rood = new Color(165, 30, 30);
        grijs = new Color(132, 124, 124);

        red = new Button("red");
        add(red);
        red.addActionListener(new Al());

        gray = new Button("gray");
        add(gray);
        red.addActionListener(new Al1());


    }

    @Override
    public void paint(Graphics g) {
        red.setLocation(300,550);
        gray.setLocation(600,550);

        if(click && ! click2){
            muur(g,rood, 10, 10,50, 25);
        }
        if (click2 && ! click){
            muurGroot(g, grijs, 10, 10, 50, 25);
        }
    }

    public void muur (Graphics g,Color muurkleur,int kolom,int rij, int w, int h){
        g.setColor(muurkleur);
        for(int i = 0; i<rij; i++) {
            for (int n = 0; n<kolom; n++) {
                if (i % 2 == 0){
                    g.fillRect((n*w)+n + (int)((double)w*0.5), i*h+i, w, h);
                }else{
                    g.fillRect(n*w+n, i*h+i, w, h);
                }
            }
        }
    }

    public void muurGroot (Graphics g,Color muurkleur,int kolom,int rij, int w, int h){
        g.setColor(muurkleur);
        for(int i = 0; i<rij; i++) {
            for (int n = 0; n<kolom; n++) {
                if (i % 2 == 0){
                    g.fillRect(((n*w)+n + (int)((double)w*0.5))*2, (i*h+i)*2, w*2, h*2);
                }else{
                    g.fillRect((n*w+n)*2, (i*h+i)*2, w*2, h*2);
                }
            }
        }
    }



    class Al implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            getGraphics().setColor(rood);
            System.out.println("test1");

            click = true;
            click2 = false;

            repaint();
        }
    }

    class Al1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            getGraphics().setColor(muurkleur = grijs);
            System.out.println("test2");

            click = false;
            click2 = true;
            repaint();
        }
    }




}

