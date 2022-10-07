package App;

import FriendsFrameComponents.FriendsFrame;
import LoginFrameComponents.LoginFrame;
import MainFrameComponents.MainFrame;

public class Main {


    public static FriendsFrame friendsFrame;
    public static boolean loginClosed = true, mainClosed = false, friendsClosed = true;
    public static boolean loggedIn = true;

    public static void main(String[] args) {

        LoginFrame loginFrame = new LoginFrame();

        while (!loggedIn){}

        MainFrame mainFrame = new MainFrame();


    }

}
