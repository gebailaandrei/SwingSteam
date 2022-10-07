import MainFramePanels.BottomPanel;
import MainFramePanels.MiddlePanel;
import MainFramePanels.TopPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    TopPanel tp = new TopPanel();
    MiddlePanel mp = new MiddlePanel();
    BottomPanel bp = new BottomPanel();


    MainFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
