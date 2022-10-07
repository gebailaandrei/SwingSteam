package MainFramePanels.TopPanelComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TopLeftPanel extends JPanel implements MouseListener {

    JButton steamBtn, viewBtn, friendsBtn, gamesBtn, helpBtn;

    public TopLeftPanel(){

        this.setOpaque(false);
        this.setLayout(null);

        steamBtn = new JButton("Steam");
        viewBtn = new JButton("View");
        friendsBtn = new JButton("Friends");
        gamesBtn = new JButton("Games");
        helpBtn = new JButton("Help");

        JLayeredPane layeredButtons = new JLayeredPane();
        layeredButtons.add(steamBtn);
        layeredButtons.add(viewBtn);
        layeredButtons.add(friendsBtn);
        layeredButtons.add(gamesBtn);
        layeredButtons.add(helpBtn);

        steamBtn.setFocusable(false);
        steamBtn.setOpaque(false);
        steamBtn.setContentAreaFilled(false);
        steamBtn.setBorderPainted(false);
        steamBtn.setSize(73, 20);
        steamBtn.setLocation(-10, 0);
        steamBtn.setHorizontalAlignment(SwingConstants.LEFT);
        steamBtn.setIcon(null);
        steamBtn.setIconTextGap(0);
        steamBtn.setForeground(new Color(173, 173, 174));
        steamBtn.addMouseListener(this);

        viewBtn.setFocusable(false);
        viewBtn.setOpaque(false);
        viewBtn.setContentAreaFilled(false);
        viewBtn.setBorderPainted(false);
        viewBtn.setSize(70, 20);
        viewBtn.setLocation(55, 0);
        viewBtn.setHorizontalAlignment(SwingConstants.LEFT);
        viewBtn.setIcon(null);
        viewBtn.setIconTextGap(0);
        viewBtn.setForeground(new Color(173, 173, 174));
        viewBtn.addMouseListener(this);

        friendsBtn.setFocusable(false);
        friendsBtn.setOpaque(false);
        friendsBtn.setContentAreaFilled(false);
        friendsBtn.setBorderPainted(false);
        friendsBtn.setSize(80, 20);
        friendsBtn.setLocation(115, 0);
        friendsBtn.setHorizontalAlignment(SwingConstants.LEFT);
        friendsBtn.setIcon(null);
        friendsBtn.setIconTextGap(0);
        friendsBtn.setForeground(new Color(173, 173, 174));
        friendsBtn.addMouseListener(this);

        gamesBtn.setFocusable(false);
        gamesBtn.setOpaque(false);
        gamesBtn.setContentAreaFilled(false);
        gamesBtn.setBorderPainted(false);
        gamesBtn.setSize(80, 20);
        gamesBtn.setLocation(190, 0);
        gamesBtn.setHorizontalAlignment(SwingConstants.LEFT);
        gamesBtn.setIcon(null);
        gamesBtn.setIconTextGap(0);
        gamesBtn.setForeground(new Color(173, 173, 174));
        gamesBtn.addMouseListener(this);

        helpBtn.setFocusable(false);
        helpBtn.setOpaque(false);
        helpBtn.setContentAreaFilled(false);
        helpBtn.setBorderPainted(false);
        helpBtn.setSize(80, 20);
        helpBtn.setLocation(260, 0);
        helpBtn.setHorizontalAlignment(SwingConstants.LEFT);
        helpBtn.setIcon(null);
        helpBtn.setIconTextGap(0);
        helpBtn.setForeground(new Color(173, 173, 174));
        helpBtn.addMouseListener(this);

        this.add(steamBtn);
        this.add(viewBtn);
        this.add(friendsBtn);
        this.add(gamesBtn);
        this.add(helpBtn);

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
        JButton btn = (JButton)e.getSource();
        btn.setForeground(Color.GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton btn = (JButton)e.getSource();
        btn.setForeground(Color.WHITE);
    }
}
