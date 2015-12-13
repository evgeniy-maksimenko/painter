package gontsov;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class PainterColorBtn extends JPanel{

    Properties properties;

    public PainterColorBtn(Properties properties) {
        this.properties = properties;
        setLayout(null);
        JButton btn = new JButton("Цвет");
        btn.setBounds(0, 0, 150, 250);
        btn.addActionListener(new BtnClick());
        add(btn);
    }

    private class BtnClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            properties.color = JColorChooser.showDialog(null, "Выберите цвет", properties.color);
        }
    }
}
