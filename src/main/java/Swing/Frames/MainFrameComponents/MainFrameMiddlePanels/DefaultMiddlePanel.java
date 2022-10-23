package Swing.Frames.MainFrameComponents.MainFrameMiddlePanels;

import App.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DefaultMiddlePanel extends JPanel implements MouseListener {

    public DefaultMiddlePanel(){

        this.setBackground(new Color(27,40,56));
        this.addMouseListener(this);
        JLabel label = new JLabel("Default middle panel of the main frame!");
        label.setForeground(Color.WHITE);
        this.add(label);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Main.mainFrame.changePanel(2);
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
