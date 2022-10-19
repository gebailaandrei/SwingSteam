package Swing.Frames.MainFrameComponents.MainFrameMiddlePanel.StorePanel;

import Scripts.Game;
import Scripts.GamesDB;
import Scripts.ImageHandler;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class MiddlePanel extends JPanel{



    public MiddlePanel(){

        int numberOfGames = GamesDB.getNumberOfGames();

        this.setLocation(20, 170);
        this.setBounds(20, 170, 700, numberOfGames * 55 + 30);
        this.setOpaque(false);

        JPanel grid = new JPanel();
        grid.setOpaque(false);

        GridLayout layout = new GridLayout(numberOfGames, 1);
        layout.setVgap(5);

        grid.setLayout(layout);

        List<Game> games = GamesDB.getGamesList();

        for(int i = 0; i < numberOfGames; i++)
            grid.add(new GameCell(games.get(i)));

        this.add(grid);

    }
}

class GameCell extends JPanel implements MouseListener {

    Game game;

    GameCell(Game game){

        this.game = game;
        this.setBackground(new Color(22,32,45));
        this.setPreferredSize(new Dimension(700, 50));
        this.setLayout(null);
        this.addMouseListener(this);

        JLabel gameImage = new JLabel();
        gameImage.setBounds(0, 0, 125, 50);
        Icon img = ImageHandler.resizeImageIcon(125, 50, ImageHandler.loadImage(game.getPicURL(), ""));
        gameImage.setIcon(img);

        JLabel gameName = new JLabel();
        gameName.setBounds(135, 5, 240, 20);
        gameName.setText(game.getGameName());
        gameName.setForeground(new Color(173, 173, 174));

        JLabel releaseDate = new JLabel();
        releaseDate.setBounds(390, 15, 75, 20);
        releaseDate.setText("21 Aug. 2012");
        releaseDate.setForeground(new Color(173, 173, 174));

        JLabel ratingIcon = new JLabel();
        ratingIcon.setBounds(500, 15, 20, 25);
        Icon img1 = ImageHandler.loadImageIcon(ImageHandler.THUMBS_UP_RATING);
        ratingIcon.setIcon(img1);

        JLabel discount = new JLabel();
        discount.setBounds(530, 15, 40, 25);
        discount.setText("-50%");
        discount.setForeground(new Color(139,197,63));
        discount.setHorizontalAlignment(SwingConstants.CENTER);
        discount.setBackground(new Color(76,107,34));
        discount.setOpaque(true);

        JLabel price = new JLabel();
        price.setBounds(610, 15, 75, 20);
        price.setText("Free to play");
        price.setForeground(new Color(173, 173, 174));
        price.setHorizontalAlignment(SwingConstants.RIGHT);

        this.add(gameImage);
        this.add(gameName);
        this.add(releaseDate);
        this.add(ratingIcon);
        this.add(discount);
        this.add(price);

    }


    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(new Color(16,24,34));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(22,32,45));
    }
}
