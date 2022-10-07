package MainFrameComponents.MainFrameBottomPanel;

import FriendsFrameComponents.FriendsFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static App.Main.friendsClosed;
import static App.Main.friendsFrame;

public class BottomPanel extends JPanel implements MouseListener {

    JButton friendsAndChatBtn = new JButton(), addAGameBtn = new JButton(), downloadsBtn = new JButton();
    JPanel leftPanel = new JPanel(), midPanel = new JPanel(), rightPanel = new JPanel();
    Icon chatIcon = new ImageIcon("src/MainFrameComponents/MainFrameBottomPanel/FriendsAndChatIcon.png");
    Icon addGameIcon = new ImageIcon("src/MainFrameComponents/MainFrameBottomPanel/AddAGameIcon.png");

    public BottomPanel(){

        this.setBackground(new Color(42, 46, 51));
        this.setLayout(new GridLayout(1, 3));

        for (JPanel panel : new JPanel[]{leftPanel, midPanel, rightPanel}){
            panel.setOpaque(false);
            panel.setLayout(new BorderLayout());
        }

        for(JButton button : new JButton[]{friendsAndChatBtn, downloadsBtn, addAGameBtn}){
            button.setFocusable(false);
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
            button.setForeground(new Color(173, 173, 174));
            button.addMouseListener(this);
            button.setPreferredSize(new Dimension(150, 30));

            if(button.equals(friendsAndChatBtn)){
                friendsAndChatBtn.setIcon(chatIcon);
                friendsAndChatBtn.setText("Chat");
                friendsAndChatBtn.setHorizontalTextPosition(SwingConstants.LEFT);
            }else if(button.equals(downloadsBtn)){
                downloadsBtn.setText("Downloads");
            }else{
                addAGameBtn.setIcon(addGameIcon);
                addAGameBtn.setText("Add a game");
                addAGameBtn.setMargin(new Insets(0, 25, 0, 0));
            }
        }

        leftPanel.add(addAGameBtn, BorderLayout.WEST);
        midPanel.add(downloadsBtn, BorderLayout.CENTER);
        rightPanel.add(friendsAndChatBtn, BorderLayout.EAST);

        this.add(leftPanel);
        this.add(midPanel);
        this.add(rightPanel);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource() == friendsAndChatBtn){
            if(friendsClosed){
                friendsFrame = new FriendsFrame();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JButton btn = (JButton)e.getSource();
        btn.setForeground(Color.GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton btn = (JButton)e.getSource();
        btn.setForeground(new Color(173, 173, 174));
    }
}
