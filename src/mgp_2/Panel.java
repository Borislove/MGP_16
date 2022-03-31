package mgp_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {

    int sizeX = 511;
    int sizeY = 495;
    int distanceX = 15;
    int distanceY = 15;

    int test = 30;

    int horizontalLine = 17;
    int verticaltalLine = 17;

    Timer mainTimer = new Timer(30, this);

    public void paint(Graphics g) {
        super.paintComponent(g);
        mainTimer.start();

        //horizontal LINE
        for (int i = 0; i < horizontalLine; i++) {
            g.drawLine(sizeX, distanceX, 30, distanceX);
            distanceX += 30;
        }
        //vertical LINE
        for (int i = 0; i < verticaltalLine; i++) {
            g.drawLine(test, distanceY, test, sizeY);
            test += 30;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();
    }
}
