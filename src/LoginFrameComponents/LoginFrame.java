package LoginFrameComponents;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginFrame extends JFrame implements MouseListener {

    ImageIcon steamIcon = new ImageIcon("src/LoginFrameComponents/SteamIcon.png");
    ImageIcon signInIcon = new ImageIcon("src/LoginFrameComponents/SignInIcon.png");


    JLabel accNameLbl, passLbl, helpLbl, newUserLbl;
    JTextField userTxt;
    JPasswordField passTxt;
    JButton loginBtn, helpBtn, newAccBtn;
    JLabel newAccLbl;
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
        helpBtn.setBounds(30, 400, 200, 20);
        helpBtn.setForeground(new Color(173, 173, 174));
        helpBtn.setOpaque(false);
        helpBtn.setFocusable(false);
        helpBtn.setFocusPainted(false);
        helpBtn.setContentAreaFilled(false);
        helpBtn.setBorderPainted(false);
        helpBtn.setBackground(new Color(42, 46, 51));
        helpBtn.addMouseListener(this);

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
        newAccBtn.setBackground(new Color(42, 46, 51));
        newAccBtn.addMouseListener(this);

        panel.add(newAccBtn);

        newAccLbl = new JLabel("Don't have a Steam account?");
        newAccLbl.setBounds(310, 400, 200, 20);
        newAccLbl.setForeground(new Color(173, 173, 174));
        newAccLbl.setOpaque(false);
        newAccLbl.setBackground(new Color(42, 46, 51));

        panel.add(newAccLbl);

    }

    public void setCheckBox(){

        rememberPass = new JCheckBox("Remember me");
        rememberPass.setBounds(70, 255, 200, 20);
        rememberPass.setForeground(new Color(173, 173, 174));
        rememberPass.setOpaque(false);
        rememberPass.setFocusable(false);
        rememberPass.setBackground(new Color(42, 46, 51));
        rememberPass.setIconTextGap(10);
        rememberPass.setSelectedIcon(new ImageIcon("src/LoginFrameComponents/CheckedBox.png"));
        rememberPass.setIcon(new ImageIcon("src/LoginFrameComponents/UncheckedBox.png"));
        panel.add(rememberPass);

    }

    public void setSignInBtn(){

        loginBtn = new JButton();
        loginBtn.setIcon(signInIcon);
        loginBtn.setBounds(260, 300, 170, 50);
        panel.add(loginBtn);

    }

    public void setFields(){

        JLabel steamLabel = new JLabel();
        steamLabel.setIcon(steamIcon);
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
