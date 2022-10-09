package Swing.LoginFrameComponents;

import Scripts.LoginScript;
import Swing.SignUpFrameComponents.SignUpFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.util.Map;

public class LoginFrame extends JFrame implements MouseListener {

    JLabel accNameLbl, passLbl;
    JTextField userTxt;
    JPasswordField passTxt;
    JButton loginBtn, helpBtn, newAccBtn;
    JCheckBox rememberPass;
    JPanel panel = new JPanel();

    public LoginFrame(){
        this.setTitle("Steam Sign In");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(700, 500));
        this.setResizable(false);

        panel.setBackground(new Color(33, 35, 40));
        panel.setLayout(null);

        setFields();
        setCheckBox();
        setSignInBtn();
        setHelpBtn();
        setNewAccBtnAndLbl();

        this.add(panel);
        this.setVisible(true);
    }

    public void setHelpBtn(){

        helpBtn = new JButton("Help, I can't sign in");
        helpBtn.setBounds(25, 400, 200, 20);
        helpBtn.setForeground(new Color(173, 173, 174));
        helpBtn.setOpaque(false);
        helpBtn.setFocusable(false);
        helpBtn.setFocusPainted(false);
        helpBtn.setContentAreaFilled(false);
        helpBtn.setBorderPainted(false);
        helpBtn.setBackground(new Color(33, 35, 40));
        helpBtn.addMouseListener(this);

        Font font = helpBtn.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        helpBtn.setFont(font.deriveFont(attributes));

        panel.add(helpBtn);

    }

    public void setNewAccBtnAndLbl(){

        newAccBtn = new JButton("Create a free account");
        newAccBtn.setBounds(442, 400, 200, 20);
        newAccBtn.setForeground(new Color(173, 173, 174));
        newAccBtn.setOpaque(false);
        newAccBtn.setFocusable(false);
        newAccBtn.setFocusPainted(false);
        newAccBtn.setContentAreaFilled(false);
        newAccBtn.setBorderPainted(false);
        newAccBtn.setBackground(new Color(33, 35, 40));
        newAccBtn.addMouseListener(this);

        Font font = newAccBtn.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        newAccBtn.setFont(font.deriveFont(attributes));

        panel.add(newAccBtn);



    }

    public void setCheckBox(){

        rememberPass = new JCheckBox("Remember me");
        rememberPass.setBounds(70, 255, 200, 20);
        rememberPass.setForeground(new Color(173, 173, 174));
        rememberPass.setOpaque(false);
        rememberPass.setFocusable(false);
        rememberPass.setBackground(new Color(33, 35, 40));
        rememberPass.setIconTextGap(10);
        rememberPass.setSelectedIcon(new ImageIcon("src/Swing/LoginFrameComponents/CheckedBox.png"));
        rememberPass.setIcon(new ImageIcon("src/Swing/LoginFrameComponents/UncheckedBox.png"));
        panel.add(rememberPass);

    }

    public void setSignInBtn(){

        loginBtn = new JButton();
        loginBtn.setIcon(new ImageIcon("src/Swing/LoginFrameComponents/SignInIcon.png"));
        loginBtn.setBounds(260, 300, 170, 50);
        loginBtn.addMouseListener(this);
        panel.add(loginBtn);

    }

    public void setFields(){

        JLabel steamLabel = new JLabel();
        steamLabel.setIcon(new ImageIcon("src/Swing/LoginFrameComponents/SteamIcon.png"));
        steamLabel.setBounds(65, 20, 180, 70);
        panel.add(steamLabel);

        accNameLbl = new JLabel("SIGN IN WITH ACCOUNT NAME");
        accNameLbl.setForeground(new Color(173, 173, 174));
        accNameLbl.setBounds(70, 115, 250, 15);
        accNameLbl.setFont(new Font(null, Font.BOLD, 15));
        panel.add(accNameLbl);

        userTxt = new JTextField();
        userTxt.setForeground(new Color(173, 173, 174));
        userTxt.setBounds(70, 140, 535, 35);
        userTxt.setFont(new Font(null, Font.PLAIN, 15));
        userTxt.setBackground(new Color(42, 46, 51));
        userTxt.setCaretColor(Color.WHITE);
        userTxt.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(null,
                        javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        panel.add(userTxt);

        passLbl = new JLabel("PASSWORD");
        passLbl.setForeground(new Color(173, 173, 174));
        passLbl.setBounds(70, 185, 250, 15);
        passLbl.setFont(new Font(null, Font.BOLD, 15));
        panel.add(passLbl);

        passTxt = new JPasswordField();
        passTxt.setForeground(new Color(173, 173, 174));
        passTxt.setBounds(70, 210, 535, 35);
        passTxt.setFont(new Font(null, Font.PLAIN, 15));
        passTxt.setBackground(new Color(42, 46, 51));
        passTxt.setCaretColor(Color.WHITE);
        passTxt.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(null,
                        javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        panel.add(passTxt);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == loginBtn){
            LoginScript.logIn(userTxt.getText(), String.valueOf(passTxt.getPassword()));
        }else if(e.getSource() == newAccBtn){
            new SignUpFrame();
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
        JButton btn = (JButton)e.getSource();
        btn.setForeground(Color.GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton btn = (JButton)e.getSource();
        btn.setForeground(new Color(173, 173, 174));
    }
}
