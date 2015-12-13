package gontsov;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;

public class PainterDrawPanel extends JPanel implements MouseListener, MouseMotionListener {

    Graphics2D g2d = (Graphics2D) getGraphics();
    Properties properties;

    int x = 0;
    int y = 0;
    boolean isMousePressed = false;

    public PainterDrawPanel(Properties properties) {
        this.properties = properties;
        setBackground(Color.white);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (isMousePressed) {
            g2d.setColor(properties.color);
            g2d.setStroke(new BasicStroke(properties.width));
            g2d.drawLine(x, y, e.getX(), e.getY());
            x = e.getX();
            y = e.getY();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        isMousePressed = true;

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        isMousePressed = false;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }


}
