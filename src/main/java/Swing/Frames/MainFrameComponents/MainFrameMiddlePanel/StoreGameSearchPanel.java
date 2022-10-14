package Swing.Frames.MainFrameComponents.MainFrameMiddlePanel;

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
    JPanel topPanel, middlePanel, rightPanel; // Panels with the elements shown

    public StoreGameSearchPanel(){

        this.setBackground(new Color(27, 40, 56));

/*        JPanel l, c, r;
        l = new JPanel();
        l.setPreferredSize(new Dimension(100, 0));
        c = new JPanel();
        c.setLayout(null);
        r = new JPanel();
        r.setPreferredSize(new Dimension(100, 0));*/

        scrollPanel = new JPanel();
        //scrollPanel.setLayout(new BorderLayout());
        scrollPanel.setLayout(null);
        scrollPanel.setOpaque(false);

        scrollPane = new JScrollPane(scrollPanel);
        scrollPane.setComponentZOrder(scrollPane.getVerticalScrollBar(), 0);
        scrollPane.setComponentZOrder(scrollPane.getViewport(), 1);
        scrollPane.getVerticalScrollBar().setOpaque(false);
        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        scrollPane.setOpaque(false);
        scrollPane.setBorder(createEmptyBorder());
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setLayout(new MyScrollPaneLayout());

        // Smaller panels
        topPanel = new JPanel();
        middlePanel = new JPanel();
        rightPanel = new JPanel();

        topPanel.setBounds(10, 0, 980, 150);
        middlePanel.setBounds(20, 170, 700, 3000);
        rightPanel.setBounds(740, 170, 240, 500);

        topPanel.setBackground(new Color(34, 61, 88));
        middlePanel.setBackground(new Color(34, 61, 88));
        rightPanel.setBackground(new Color(34, 61, 88));

/*        c.add(topPanel);
        c.add(middlePanel);
        c.add(rightPanel);

        scrollPanel.add(l, BorderLayout.WEST);
        scrollPanel.add(c, BorderLayout.CENTER);
        scrollPanel.add(r, BorderLayout.EAST);*/

        scrollPanel.add(topPanel);
        scrollPanel.add(middlePanel);
        scrollPanel.add(rightPanel);

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
