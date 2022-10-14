package App;

import Scripts.AccountsDB;
import Swing.Frames.FriendsFrameComponents.FriendsFrame;
import Swing.Frames.LoginFrameComponents.LoginFrame;
import Swing.Frames.MainFrameComponents.MainFrame;
import Swing.Frames.SignUpFrameComponents.SignUpFrame;

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
        mainFrame.setSize(mainFrame.getWidth()+1, mainFrame.getHeight());

        mainFrame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent comp) {
                mainFrame.resized();
            }
        });

/*        mainFrame.addWindowStateListener(event -> {

            if (((event.getNewState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH)
                && !((event.getOldState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH)) {
                mainFrame.resized();
            }else if (!((event.getNewState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH)
                      && ((event.getOldState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH))  {
                mainFrame.resized();
            }

            if(mainFrame.getExtendedState() == Frame.MAXIMIZED_BOTH){
                mainFrame.resized();
            }
        });*/

        mainFrame.addWindowStateListener(new WindowAdapter() {
            public void windowStateChanged(WindowEvent evt) {
                int oldState = evt.getOldState();
                int newState = evt.getNewState();

                if ((oldState & Frame.ICONIFIED) == 0 && (newState & Frame.ICONIFIED) != 0) {
                    mainFrame.resized();
                } else if ((oldState & Frame.ICONIFIED) != 0 && (newState & Frame.ICONIFIED) == 0) {
                    mainFrame.resized();
                }

                if ((oldState & Frame.MAXIMIZED_BOTH) == 0 && (newState & Frame.MAXIMIZED_BOTH) != 0) {
                    mainFrame.resized();
                } else if ((oldState & Frame.MAXIMIZED_BOTH) != 0 && (newState & Frame.MAXIMIZED_BOTH) == 0) {
                    mainFrame.resized();
                }
            }
        });

/*        while (true){
            mainFrame.resized();
        }*/

    }



}
