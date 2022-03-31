package mgp_1;

import javax.swing.*;

public class Window extends JFrame {

    Panel panel = new Panel();

    public Window() {
        setVisible(true);
        setSize(600, 600);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        add(panel);
    }
}
