package Swing.SignUpFrameComponents;

import Scripts.LoginScript;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SignUpFrame extends JFrame implements MouseListener {

    JLabel accNameLbl, passLbl;
    JTextField userTxt;
    JPasswordField passTxt;
    JButton signUpBtn;
    JCheckBox notARobotCheckBox;
    JPanel panel = new JPanel();

    public SignUpFrame(){

        this.setTitle("Steam Sign Up");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(700, 850));
        this.setResizable(false);

        panel.setBackground(new Color(33, 35, 40));
        panel.setLayout(null);



        this.add(panel);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == signUpBtn){
            LoginScript.logIn(userTxt.getText(), String.valueOf(passTxt.getPassword()));
        }
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
