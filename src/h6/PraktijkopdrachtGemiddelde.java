package h6;

import java.awt.*;
import java.applet.*;

public class PraktijkopdrachtGemiddelde extends Applet{
    double a;
    double b;
    double c;
    double uitkomst;
    int aantal;

    public void init(){
        a = 5.9;
        b = 6.3;
        c = 6.9;
        aantal = 3;
        uitkomst = (a + b + c) / aantal;
        uitkomst = (int) (uitkomst * 10);
        uitkomst = (uitkomst / 10);

    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is " + uitkomst,20,20);
    }
}
