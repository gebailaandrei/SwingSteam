package Swing.MainFrameComponents.MainFrameTopPanel;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    BottomLeftPanel bottomLeftPanel = new BottomLeftPanel();
    TopLeftPanel topLeftPanel = new TopLeftPanel();

    public TopPanel(){

        this.setBackground(new Color(42, 46, 51));
        this.setLayout(null);

        topLeftPanel.setBounds(0, 0, 400, 20);
        bottomLeftPanel.setBounds(0, 30, 600, 45);


        this.add(topLeftPanel);
        this.add(bottomLeftPanel);


    }

}
