package gontsov;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainterWidthBtn extends JPanel{
    Properties properties;

    public PainterWidthBtn(Properties properties) {
        this.properties = properties;
        setLayout(null);
        JButton btn = new JButton("Толщина");
        btn.setBounds(0, 0, 150, 250);
        btn.addActionListener(new BtnClick());
        add(btn);
    }

    private class BtnClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            properties.width = 10;
        }
    }
}
