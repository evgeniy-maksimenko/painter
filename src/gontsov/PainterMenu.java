package gontsov;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;

public class PainterMenu extends JMenuBar{

    public PainterMenu() {
        JMenu fileMenu = new JMenu("Файл");

        JMenuItem newMenu = new JMenuItem("Новый");
        newMenu.addActionListener(new NewMenu());
        fileMenu.add(newMenu);


        JMenuItem openMenu = new JMenuItem("Открыть");
        openMenu.addActionListener(new OpenMenu());
        fileMenu.add(openMenu);

        JMenuItem saveMenu = new JMenuItem("Сохранить");
        saveMenu.addActionListener(new SaveMenu());
        fileMenu.add(saveMenu);

        fileMenu.addSeparator();

        JMenuItem exitMenu = new JMenuItem("Выйти");
        exitMenu.addActionListener(new ExitMenu());
        fileMenu.add(exitMenu);

        add(fileMenu);
        add(Box.createHorizontalGlue());
    }


    private class ExitMenu implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class NewMenu implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class OpenMenu implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            final JFileChooser fileopen = new JFileChooser();
            int ret = fileopen.showDialog(null, "Открыть файл");
            if (ret == JFileChooser.APPROVE_OPTION) {
                File file = fileopen.getSelectedFile();
                String path = file.getAbsolutePath();



            }

        }
    }

    private class SaveMenu implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
