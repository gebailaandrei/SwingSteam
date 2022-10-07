package LoginFrameComponents;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class LoginFrame extends JFrame{

    Icon steamIcon = new ImageIcon("src/LoginFrameComponents/SteamIcon.png");
    JLabel accNameLbl, passLbl, helpLbl, newUserLbl;
    JTextField userTxt, passTxt;
    JButton loginBtn, cancelBtn, helpBtn, newAccBtn;
    JRadioButton rememberPass;
    JPanel panel = new JPanel();

    public LoginFrame(){
        this.setTitle("Steam Sign In");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(500, 350));
        this.setResizable(false);

        panel.setBackground(new Color(42, 46, 51));
        panel.setLayout(null);

        JLabel steamLabel = new JLabel();
        steamLabel.setIcon(steamIcon);
        steamLabel.setBounds(70, 10, 120, 60);
        panel.add(steamLabel);

        accNameLbl = new JLabel("Username:");
        accNameLbl.setForeground(new Color(173, 173, 174));
        accNameLbl.setBounds(70, 75, 70, 10);
        panel.add(accNameLbl);

        userTxt = new JTextField();
        userTxt.setForeground(new Color(173, 173, 174));
        userTxt.setBounds(160, 72, 200, 20);
        userTxt.setBackground(new Color(42, 46, 51));
        userTxt.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
        panel.add(userTxt);

        passLbl = new JLabel("Password:");
        passLbl.setForeground(new Color(173, 173, 174));
        passLbl.setBounds(73, 110, 70, 10);
        panel.add(passLbl);

        passTxt = new JTextField();
        passTxt.setForeground(new Color(173, 173, 174));
        passTxt.setBounds(160, 107, 200, 20);
        passTxt.setBackground(new Color(42, 46, 51));
        passTxt.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
        panel.add(passTxt);


        this.add(panel);
        this.setVisible(true);
    }

}
