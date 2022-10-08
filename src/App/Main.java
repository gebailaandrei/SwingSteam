package App;

import Scripts.Account;
import Swing.FriendsFrameComponents.FriendsFrame;
import Swing.LoginFrameComponents.LoginFrame;
import Swing.MainFrameComponents.MainFrame;

import java.awt.event.WindowEvent;

public class Main {


    public static FriendsFrame friendsFrame;
    public static boolean loginClosed = false, mainClosed = true, friendsClosed = true;
    public static boolean loggedIn = false;

    public static void main(String[] args) {
        new Account("andrei", "pass");
        new Account("dafw", "pass");
        new Account("eavssd", "pass");
        LoginFrame loginFrame = new LoginFrame();

        while (!loggedIn){ System.out.print(""); }
        System.out.println("logged in");
        loginFrame.dispose();
        MainFrame mainFrame = new MainFrame();


    }

}
