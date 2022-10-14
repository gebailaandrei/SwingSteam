package Swing.Frames.MainFrameComponents;

import Scripts.ImageHandler;
import Swing.Frames.MainFrameComponents.MainFrameBottomPanel.BottomPanel;
import Swing.Frames.MainFrameComponents.MainFrameMiddlePanel.DefaultMiddlePanel;
import Swing.Frames.MainFrameComponents.MainFrameMiddlePanel.StoreGameSearchPanel;
import Swing.Frames.MainFrameComponents.MainFrameTopPanel.TopPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    TopPanel tp = new TopPanel();
    DefaultMiddlePanel mp = null;
    StoreGameSearchPanel storeGameSearchPanel = null;
    BottomPanel bp = new BottomPanel();

    public MainFrame(){

        this.setTitle("Steam");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(ImageHandler.loadImage(ImageHandler.STEAM_FRAME_BAR_ICON));
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(27, 40, 46));
        this.setMinimumSize(new Dimension(1030, 650));
        // Set and add bottom and top panels of the frame
        tp.setPreferredSize(new Dimension(100, 65));
        bp.setPreferredSize(new Dimension(100, 60));
        this.add(tp, BorderLayout.NORTH);
        this.add(bp, BorderLayout.SOUTH);

        // Set and add middle panel of the frame
        //mp = new DefaultMiddlePanel();
        //this.add(mp, BorderLayout.CENTER);
        storeGameSearchPanel = new StoreGameSearchPanel();
        resized();
        this.add(storeGameSearchPanel, BorderLayout.CENTER);



        this.setVisible(true);
    }

    public void resized(){
        System.out.println(getWidth() + " | " + getHeight());
        storeGameSearchPanel.updatePanelSize(this.getWidth(),
                this.getHeight() - tp.getHeight() - bp.getHeight());
    }

}
