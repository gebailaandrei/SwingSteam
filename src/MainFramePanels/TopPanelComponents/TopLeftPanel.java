package MainFramePanels.TopPanelComponents;

import javax.swing.*;
import java.awt.*;

public class TopLeftPanel extends JPanel{

    JButton steamBtn, viewBtn, friendsBtn, gamesBtn, helpBtn;

    public TopLeftPanel(){

        this.setOpaque(false);
        this.setLayout(null);

        steamBtn = new JButton("Steam");
        viewBtn = new JButton("View");
        friendsBtn = new JButton("Friends");
        gamesBtn = new JButton("Games");
        helpBtn = new JButton("Help");

        steamBtn.setOpaque(false);
        steamBtn.setContentAreaFilled(false);
        steamBtn.setBorderPainted(true);
        steamBtn.setSize(80, 20);
        steamBtn.setLocation(0, 0);
        steamBtn.setHorizontalAlignment(SwingConstants.LEFT);
        steamBtn.setIcon(null);
        steamBtn.setIconTextGap(0);
        steamBtn.setForeground(Color.WHITE);

        viewBtn.setOpaque(false);
        viewBtn.setContentAreaFilled(false);
        viewBtn.setBorderPainted(true);
        viewBtn.setSize(80, 20);
        viewBtn.setLocation(80, 0);
        viewBtn.setHorizontalAlignment(SwingConstants.LEFT);
        viewBtn.setIcon(null);
        viewBtn.setIconTextGap(0);
        viewBtn.setForeground(Color.WHITE);

        friendsBtn.setOpaque(false);
        friendsBtn.setContentAreaFilled(false);
        friendsBtn.setBorderPainted(true);
        friendsBtn.setSize(80, 20);
        friendsBtn.setLocation(160, 0);
        friendsBtn.setHorizontalAlignment(SwingConstants.LEFT);
        friendsBtn.setIcon(null);
        friendsBtn.setIconTextGap(0);
        friendsBtn.setForeground(Color.WHITE);

        gamesBtn.setOpaque(false);
        gamesBtn.setContentAreaFilled(false);
        gamesBtn.setBorderPainted(true);
        gamesBtn.setSize(80, 20);
        gamesBtn.setLocation(240, 0);
        gamesBtn.setHorizontalAlignment(SwingConstants.LEFT);
        gamesBtn.setIcon(null);
        gamesBtn.setIconTextGap(0);
        gamesBtn.setForeground(Color.WHITE);

        helpBtn.setOpaque(false);
        helpBtn.setContentAreaFilled(false);
        helpBtn.setBorderPainted(true);
        helpBtn.setSize(80, 20);
        helpBtn.setLocation(320, 0);
        helpBtn.setHorizontalAlignment(SwingConstants.LEFT);
        helpBtn.setIcon(null);
        helpBtn.setIconTextGap(0);
        helpBtn.setForeground(Color.WHITE);

        this.add(steamBtn);
        this.add(viewBtn);
        this.add(friendsBtn);
        this.add(gamesBtn);
        this.add(helpBtn);

    }

}
