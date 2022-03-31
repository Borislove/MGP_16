package mgp_2;

import javax.swing.*;

public class Window extends JFrame {

    Panel panel = new Panel();

    public Window() {

        setTitle("mgp_2");
        setSize(600, 600);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        setVisible(true);
        add(panel);
    }
}
