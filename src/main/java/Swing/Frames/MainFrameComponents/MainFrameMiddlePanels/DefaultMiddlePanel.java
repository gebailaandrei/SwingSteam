package Swing.Frames.MainFrameComponents.MainFrameMiddlePanels;

import javax.swing.*;
import java.awt.*;

public class DefaultMiddlePanel extends JPanel implements MainFrameMiddlePanel{

    public static JFrame parentFrame;

    public DefaultMiddlePanel(){

        this.setBackground(new Color(39, 43, 47));

    }

    @Override
    public void updatePanelSize(int width, int height) {

    }
}
