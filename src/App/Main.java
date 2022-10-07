package App;

import FriendsFrameComponents.FriendsFrame;
import LoginFrameComponents.LoginFrame;
import MainFrameComponents.MainFrame;

public class Main {


    public static FriendsFrame friendsFrame;
    public static boolean loginClosed = false, mainClosed = true, friendsClosed = true;
    public static boolean loggedIn = false;

    public static void main(String[] args) {

        LoginFrame loginFrame = new LoginFrame();

        while (!loggedIn){}

        MainFrame mainFrame = new MainFrame();


    }

}
