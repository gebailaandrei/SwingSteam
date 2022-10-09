package Swing.MainFrameComponents;

import Scripts.ImageHandler;
import Swing.MainFrameComponents.MainFrameBottomPanel.BottomPanel;
import Swing.MainFrameComponents.MainFrameTopPanel.TopPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    TopPanel tp = new TopPanel();
    MiddlePanel mp = new MiddlePanel();
    BottomPanel bp = new BottomPanel();


    public MainFrame(){

        this.setTitle("Steam");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(ImageHandler.loadImage(ImageHandler.STEAM_FRAME_BAR_ICON));
        this.setLayout(new BorderLayout());
        this.setMinimumSize(new Dimension(1150, 700));

        tp.setPreferredSize(new Dimension(100, 100));
        mp.setPreferredSize(new Dimension(100, 100));
        bp.setPreferredSize(new Dimension(100, 60));


        this.add(tp, BorderLayout.NORTH);
        this.add(mp, BorderLayout.CENTER);
        this.add(bp, BorderLayout.SOUTH);
        this.setVisible(true);

    }

}
