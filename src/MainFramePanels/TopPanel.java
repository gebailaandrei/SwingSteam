package MainFramePanels;

import MainFramePanels.TopPanelComponents.BottomLeftPanel;
import MainFramePanels.TopPanelComponents.TopLeftPanel;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    BottomLeftPanel bottomLeftPanel = new BottomLeftPanel();
    TopLeftPanel topLeftPanel = new TopLeftPanel();

    public TopPanel(){

        this.setBackground(new Color(46, 47, 48));
        this.setLayout(null);

        topLeftPanel.setBounds(0, 0, 400, 34);
        bottomLeftPanel.setBounds(0, 60, 600, 50);


        this.add(topLeftPanel);
        this.add(bottomLeftPanel);


    }

}
