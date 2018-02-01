package h6;

import java.awt.*;
import java.applet.*;

public class NegatieveWaarde extends Applet{
    int a;
    int b;
    int c;

    public void init(){
        a = 2147483646;
        b = 2;
        c = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("Twee positieve ints samen " + c,20,20);
    }
}
