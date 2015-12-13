package gontsov;

import javax.swing.JFrame;

public class PainetrApp extends JFrame {

    public PainetrApp() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 200, 640, 560);

        add(new BasePanel());

        setVisible(true);
    }
}
