package Swing.Frames.MainFrameComponents.MainFrameMiddlePanel;

import Swing.Frames.MainFrameComponents.MainFrameMiddlePanel.StorePanel.MiddlePanel;
import Swing.Frames.MainFrameComponents.MainFrameMiddlePanel.StorePanel.RightPanel;
import Swing.Frames.MainFrameComponents.MainFrameMiddlePanel.StorePanel.TopPanel;
import Swing.Scroll.MyScrollBarUI;
import Swing.Scroll.MyScrollPaneLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.BorderFactory.createEmptyBorder;

public class StoreGameSearchPanel extends JPanel implements MouseListener {

    JPanel scrollPanel, mainPanel; // The scrollable panel holding everything in one place and the main panel with the smaller panel
    JScrollPane scrollPane; // Pane holding everything in a scrollable panel
    TopPanel topPanel;
    MiddlePanel middlePanel;
    RightPanel rightPanel;

    public StoreGameSearchPanel(){

        this.setBackground(new Color(27, 40, 56));

        scrollPanel = new JPanel();
        scrollPanel.setLayout(null);
        scrollPanel.setOpaque(false);

        // Smaller panels
        topPanel = new TopPanel();
        middlePanel = new MiddlePanel();
        rightPanel = new RightPanel();

        scrollPanel.add(topPanel);
        scrollPanel.add(middlePanel);
        scrollPanel.add(rightPanel);

        scrollPane = new JScrollPane(scrollPanel);
        scrollPane.setComponentZOrder(scrollPane.getVerticalScrollBar(), 0);
        scrollPane.setComponentZOrder(scrollPane.getViewport(), 1);
        scrollPane.getVerticalScrollBar().setOpaque(false);
        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        scrollPane.setOpaque(false);
        scrollPane.setBorder(createEmptyBorder());
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setLayout(new MyScrollPaneLayout());
        //scrollPane.setVerticalScrollBar(new JScrollBar(JScrollBar.VERTICAL));

        this.add(scrollPane);
    }

    public void updatePanelSize(int width, int height){
        this.setPreferredSize(new Dimension(width, height));
        scrollPane.setPreferredSize(new Dimension(this.getWidth(), this.getHeight() - 10));
        scrollPanel.setPreferredSize(new Dimension(this.getWidth(), topPanel.getHeight() + middlePanel.getHeight()));
        scrollPanel.setLocation(new Point((scrollPanel.getWidth() - 1000)/2, 0));
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
