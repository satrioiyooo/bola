import java.applet.*;
import java.awt.*;

public class Bola1 extends Applet implements Runnable {
    int x, arahX;

    public void init() {
        x = 50;
        arahX = 2;

        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(5, 5, 240, 240);
        g.setColor(Color.red);
        g.fillOval(x, 50, 20, 20);
    }

    public void run() {
        while (true) {
            try {
                cekBola();
                Thread.sleep(5);
                repaint();
            } catch (Exception e) {
            }
        }
    }

    public void cekBola() {
        if (x > 255 || x < 5) {
            arahX = -arahX;
        }
        x = x + arahX;
    }
}
