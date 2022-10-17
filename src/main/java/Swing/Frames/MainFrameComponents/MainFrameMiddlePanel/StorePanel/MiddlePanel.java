package Swing.Frames.MainFrameComponents.MainFrameMiddlePanel.StorePanel;

import Scripts.Game;
import Scripts.GamesDB;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MiddlePanel extends JPanel implements MouseListener {



    public MiddlePanel(){

        int numberOfGames = 200;

        this.setLocation(20, 170);
        this.setBounds(20, 170, 700, numberOfGames * 55 + 30);
        this.setOpaque(false);//this.setBackground(new Color(34, 61, 88));

        JPanel grid = new JPanel();
        grid.setOpaque(false);

        GridLayout layout = new GridLayout(numberOfGames, 1);
        layout.setVgap(5);

        grid.setLayout(layout);

        for(int i = 0; i < numberOfGames; i++)
            grid.add(new GameCell(new Game(1, String.valueOf(i), "ceva", "ceva")));

        this.add(grid);

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

class GameCell extends JPanel{

    GameCell(Game game){

        this.setBackground(new Color(34, 61, 88));
        this.setPreferredSize(new Dimension(700, 50));

        JLabel label = new JLabel();
        label.setText(game.getGameName());
        label.setForeground(Color.blue);

        this.add(label);


    }


}
