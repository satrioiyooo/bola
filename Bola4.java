import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bola4 extends JApplet implements ActionListener {
    JButton a, b;
    int y, arahY, i;
    volatile boolean run1, run2;

    public void init() {
        a = new JButton("^");
        b = new JButton("v");

        a.setBounds(80, 280, 70, 40);
        b.setBounds(160, 280, 70, 40);

        add(a);
        add(b);

        y = 100;
        arahY = 2;

        a.addActionListener(this);
        b.addActionListener(this);

        run1 = false;
        run2 = false;

        setLayout(null);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(5, 5, 240, 240);
        g.setColor(Color.white);
        g.fillRect(5, 5, 240, 240);
        g.setColor(Color.red);
        g.fillOval(100, y, 15, 15);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == a) {
            for (i = 0; i < 10; i++) {
                cekBola();
                repaint();
            }
        } else {
            for (i = 0; i < 10; i++) {
                cekBola1();
                repaint();
            }
        }
    }

    public void cekBola() {
        if (y > 225 || y < 5)
            arahY = -arahY;
        y = y - arahY;
    }

    public void cekBola1() {
        if (y > 225 || y < 5)
            arahY = -arahY;
        y = y + arahY;
    }
}
