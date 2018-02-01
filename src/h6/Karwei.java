package h6;

import java.awt.*;
import java.applet.*;

public class Karwei extends Applet{
    double verdeling;
    double bedrag;
    double uitkomst;

    public void init(){
        bedrag = 113;
        verdeling = 4;
        uitkomst = bedrag / verdeling;
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt: " + uitkomst,20,20);
        g.drawString("Ali krijgt: " + uitkomst,20,35);
        g.drawString("Jeanette krijgt: " + uitkomst,20,50);
        g.drawString("Ik krijg: " + uitkomst,20,65);
    }
}
