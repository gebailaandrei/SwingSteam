package Swing.MainFrameComponents.MainFrameMiddlePanel;

import Swing.MainFrameComponents.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StoreGameSearchPanel extends JPanel implements MouseListener {

    JPanel scrollPanel, mainPanel; // The scrollable panel holding everything in one place and the main panel with the smaller panel
    JScrollPane scrollPane; // Pane holding everything in a scrollable panel
    JPanel topPanel, middlePanel, rightPanel; // Panels with the elements shown

    public StoreGameSearchPanel(Dimension middleDimension){

        this.setBackground(new Color(39, 43, 47));

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setOpaque(false);

        scrollPanel = new JPanel();
        scrollPanel.setLayout(new BorderLayout());
        scrollPanel.setOpaque(false);
        scrollPanel.add(mainPanel, BorderLayout.CENTER);

        scrollPane = new JScrollPane(scrollPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setOpaque(false);

        // Smaller panels
        topPanel = new JPanel();
        middlePanel = new JPanel();
        rightPanel = new JPanel();

        topPanel.setBackground(Color.RED);
        middlePanel.setBackground(Color.CYAN);
        rightPanel.setBackground(Color.GRAY);

        topPanel.setBounds(0, 0, 1000, 150);
        middlePanel.setBounds(20, 170, 700, 3000);
        rightPanel.setBounds(740, 170, 240, 500);

        mainPanel.add(topPanel);
        mainPanel.add(middlePanel);
        mainPanel.add(rightPanel);

        this.add(scrollPane);
    }

    public void updatePanelSize(int width, int height){
        this.setPreferredSize(new Dimension(width, height));
        mainPanel.setPreferredSize(new Dimension(500, 1000));
        mainPanel.setLocation(0, 0);
        scrollPane.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
        scrollPanel.setPreferredSize(new Dimension(this.getWidth(), topPanel.getHeight() + middlePanel.getHeight()));
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
