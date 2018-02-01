package h6;

import java.awt.*;
import java.applet.*;

public class Seconden extends Applet{
    int seconden;
    int minuten;
    int uren;
    int dagen;
    int maanden;
    int uitkomstSec;
    int uitkomstDag;
    int uitkomstJaar;

    public void init(){
        seconden = 60;
        minuten = 60;
        uren = 24;
        dagen = 365;
        maanden = 24;
        uitkomstSec = seconden * minuten;
        uitkomstDag = uitkomstSec * uren;
        uitkomstJaar = uitkomstDag * dagen;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur " + uitkomstSec,20,20);
        g.drawString("Seconden in een dag " + uitkomstDag,20,40);
        g.drawString("Seconden in een jaar " + uitkomstJaar,20,60);
    }
}
