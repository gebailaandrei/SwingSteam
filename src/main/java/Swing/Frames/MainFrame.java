package Swing.Frames;

import App.Main;
import Scripts.ImageHandler;
import Swing.Frames.MainFrameComponents.MainFrameBottomPanel.MainFrameBottomPanel;
import Swing.Frames.MainFrameComponents.MainFrameMiddlePanels.DefaultMiddlePanel;
import Swing.Frames.MainFrameComponents.MainFrameMiddlePanels.StoreGameSearchPanel;
import Swing.Frames.MainFrameComponents.MainFrameTopPanel.TopPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    StoreGameSearchPanel storeGameSearchPanel;
    DefaultMiddlePanel defaultMiddlePanel;
    TopPanel tp = new TopPanel();
    MainFrameBottomPanel bp = new MainFrameBottomPanel();

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
        storeGameSearchPanel = new StoreGameSearchPanel();
        resized();
        this.add(storeGameSearchPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void resized(){
        storeGameSearchPanel.updatePanelSize(this.getWidth(), this.getHeight() - tp.getHeight() - bp.getHeight());
    }

    public void changePanel(int i){
        switch (i){
            case 1:
                this.remove(storeGameSearchPanel);
                defaultMiddlePanel = new DefaultMiddlePanel();
                this.add(defaultMiddlePanel, BorderLayout.CENTER);
                defaultMiddlePanel.revalidate();
                resized();
                break;
            case 2:
                this.remove(defaultMiddlePanel);
                storeGameSearchPanel = new StoreGameSearchPanel();
                this.add(storeGameSearchPanel, BorderLayout.CENTER);
                storeGameSearchPanel.revalidate();
                resized();
                break;
        }
    }

}
