package gontsov;
import javax.swing.*;

public class BasePanel extends JPanel{

    public BasePanel() {

        setLayout(null);

        Properties properties = new Properties();
        PainterDrawPanel painterDrawPanel = new PainterDrawPanel(properties);

        PainterMenu painterMenu = new PainterMenu();

        PainterColorBtn painterColorBtn = new PainterColorBtn(properties);
        PainterWidthBtn painterWidthBtn = new PainterWidthBtn(properties);

        painterMenu.setBounds(0, 0, 640, 25);

        painterColorBtn.setBounds(0, 25, 150, 250);
        painterWidthBtn.setBounds(0, 275, 150, 250);

        painterDrawPanel.setBounds(150, 25, 640, 500);

        add(painterMenu);
        add(painterColorBtn);
        add(painterWidthBtn);
        add(painterDrawPanel);
    }


}
