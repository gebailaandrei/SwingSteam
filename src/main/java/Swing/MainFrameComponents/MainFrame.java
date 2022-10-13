package Swing.MainFrameComponents;

import Scripts.ImageHandler;
import Swing.MainFrameComponents.MainFrameBottomPanel.BottomPanel;
import Swing.MainFrameComponents.MainFrameMiddlePanel.DefaultMiddlePanel;
import Swing.MainFrameComponents.MainFrameMiddlePanel.StoreGameSearchPanel;
import Swing.MainFrameComponents.MainFrameTopPanel.TopPanel;

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
        this.setMinimumSize(new Dimension(1030, 650));
        // Set and add bottom and top panels of the frame
        tp.setPreferredSize(new Dimension(100, 65));
        bp.setPreferredSize(new Dimension(100, 60));
        this.add(tp, BorderLayout.NORTH);
        this.add(bp, BorderLayout.SOUTH);

        // Set and add middle panel of the frame
        //mp = new DefaultMiddlePanel();
        //this.add(mp, BorderLayout.CENTER);
        storeGameSearchPanel = new StoreGameSearchPanel(new Dimension(this.getWidth(),
                this.getHeight() - tp.getHeight() - bp.getHeight()));
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
