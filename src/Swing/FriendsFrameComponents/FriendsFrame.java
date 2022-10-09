package Swing.FriendsFrameComponents;

import Scripts.ImageHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FriendsFrame extends JFrame implements WindowListener {



    public FriendsFrame(){
        this.setTitle("Friends and chats");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setIconImage(ImageHandler.loadImage(ImageHandler.STEAM_FRAME_BAR_ICON));
        this.setLayout(new BorderLayout());
        this.setMinimumSize(new Dimension(400, 700));



        this.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
