package App;

import Scripts.AccountsDB;
import Swing.FriendsFrameComponents.FriendsFrame;
import Swing.LoginFrameComponents.LoginFrame;
import Swing.MainFrameComponents.MainFrame;
import Swing.SignUpFrameComponents.SignUpFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {


    public static FriendsFrame friendsFrame;
    public static boolean loginClosed = false, mainClosed = true, friendsClosed = true;
    public static boolean loggedIn = true;
    public static SignUpFrame signUpFrame;
    public static MainFrame mainFrame;

    private static Dimension oldDimension, newDimension;

    public static void main(String[] args) {
        AccountsDB accountsDB = new AccountsDB();

        LoginFrame loginFrame = new LoginFrame();
        while (!loggedIn){ System.out.print(""); }
        System.out.println("logged in");
        loginFrame.dispose();

        mainFrame = new MainFrame();

        mainFrame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent comp) {
                mainFrame.resized();
            }
        });

        mainFrame.addWindowStateListener(new WindowStateListener() {
            public void windowStateChanged(WindowEvent event) {

                if (((event.getNewState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH)
                    && !((event.getOldState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH)) {
                    mainFrame.resized();
                }else if (!((event.getNewState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH)
                          && ((event.getOldState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH))  {
                    mainFrame.resized();
                }
            }
        });

/*        while (true){
            mainFrame.resized();
        }*/

    }



}
