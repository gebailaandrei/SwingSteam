package MainFramePanels;

import MainFramePanels.TopPanelComponents.TopLeftPanel;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    TopLeftPanel topLeftPanel = new TopLeftPanel();

    public TopPanel(){

        this.setBackground(new Color(46, 47, 48));
        this.setLayout(null);

        topLeftPanel.setBounds(0, 0, 400, 34);


        this.add(topLeftPanel);


    }

}
