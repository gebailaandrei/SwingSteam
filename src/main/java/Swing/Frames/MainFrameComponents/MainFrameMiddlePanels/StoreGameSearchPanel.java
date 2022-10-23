package Swing.Frames.MainFrameComponents.MainFrameMiddlePanels;

import App.Main;
import Scripts.Game;
import Scripts.GamesDB;
import Scripts.ImageHandler;
import Swing.Frames.MainFrame;
import Swing.Scroll.MyScrollBarUI;
import Swing.Scroll.MyScrollPaneLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import static javax.swing.BorderFactory.createEmptyBorder;

public class StoreGameSearchPanel extends JPanel{

    JPanel scrollPanel, mainPanel; // The scrollable panel holding everything in one place and the main panel with the smaller panel
    JScrollPane scrollPane; // Pane holding everything in a scrollable panel
    JPanel topPanel, middlePanel, rightPanel;

    public StoreGameSearchPanel(){

        this.setBackground(new Color(27,40,56));

        scrollPanel = new JPanel();
        scrollPanel.setLayout(null);
        scrollPanel.setOpaque(false);

        // Smaller panels
        topPanel = createTopPanel();
        middlePanel = createMiddlePanel();
        rightPanel = createRightPanel();

        scrollPanel.add(topPanel);
        scrollPanel.add(middlePanel);
        scrollPanel.add(rightPanel);

        scrollPane = new JScrollPane(scrollPanel);
        scrollPane.setComponentZOrder(scrollPane.getVerticalScrollBar(), 0);
        scrollPane.setComponentZOrder(scrollPane.getViewport(), 1);
        scrollPane.getVerticalScrollBar().setOpaque(false);
        scrollPane.getVerticalScrollBar().setUI(new MyScrollBarUI());
        scrollPane.setOpaque(false);
        scrollPane.setBorder(createEmptyBorder());
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setLayout(new MyScrollPaneLayout());
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
        //scrollPane.setVerticalScrollBar(new JScrollBar(JScrollBar.VERTICAL));

        this.add(scrollPane);

    }

    public void updatePanelSize(int width, int height){
        this.setPreferredSize(new Dimension(width, height));
        scrollPane.setPreferredSize(new Dimension(this.getWidth(), this.getHeight() - 10));
        scrollPanel.setPreferredSize(new Dimension(this.getWidth(),
                topPanel.getHeight() + (Math.max(middlePanel.getHeight(), rightPanel.getHeight() + 30))));
        scrollPanel.setLocation(new Point((scrollPanel.getWidth() - 1000)/2, 0));
    }
    /** MIDDLE PANEL WITH THE LIST OF GAMES */
    public JPanel createMiddlePanel(){

        int numberOfGames = GamesDB.getNumberOfGames();
        List<Game> games = GamesDB.getGamesList();

        JPanel panel = new JPanel();
        panel.setLocation(20, 170);
        panel.setBounds(20, 170, 700, numberOfGames * 55 + 30);
        panel.setOpaque(false);

        JPanel grid = new JPanel();
        grid.setOpaque(false);

        GridLayout layout = new GridLayout(numberOfGames, 1);
        layout.setVgap(5);

        grid.setLayout(layout);

        for(int i = 0; i < numberOfGames; i++)
            grid.add(new GameCell(games.get(i)));

        panel.add(grid);

        return panel;
    }
    /** RIGHT PANEL WITH THE FILTERS */
    public JPanel createRightPanel(){

        JPanel panel = new JPanel();

        panel.setBounds(740, 170, 240, 500);
        panel.setBackground(new Color(34, 61, 88));

        return panel;
    }
    /** TOP PANEL WITH TABS AND SEARCH BAR */
    public JPanel createTopPanel(){

        JPanel panel = new JPanel();

        panel.setBounds(10, 0, 980, 150);
        panel.setBackground(new Color(34, 61, 88));

        return panel;
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
        releaseDate.setText(game.getDate());
        releaseDate.setForeground(new Color(173, 173, 174));

        JLabel ratingIcon = new JLabel();
        ratingIcon.setBounds(500, 15, 20, 25);
        Icon img1 = ImageHandler.loadImageIcon(ImageHandler.THUMBS_UP_RATING);
        ratingIcon.setIcon(img1);

        JLabel discount = new JLabel();
        int discountVal = (int) game.getDiscount();
        discount.setBounds(530, 15, 40, 25);
        if(discountVal != 0) {
            discount.setText("-" + discountVal + "%");
            discount.setForeground(new Color(139, 197, 63));
            discount.setHorizontalAlignment(SwingConstants.CENTER);
            discount.setBackground(new Color(76, 107, 34));
            discount.setOpaque(true);
        }

        JLabel price = new JLabel();
        price.setBounds(610, 15, 75, 20);
        float priceVal = game.getPrice();
        if(priceVal == 0){
            price.setText("Free to play");
        }else{
            price.setText(priceVal + "$");
        }


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
        System.out.println(game.getGameName());
        Main.mainFrame.changePanel(1);
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
