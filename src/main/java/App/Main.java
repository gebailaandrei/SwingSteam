package App;

import Scripts.Account;
import Scripts.DB;
import Swing.FriendsFrameComponents.FriendsFrame;
import Swing.LoginFrameComponents.LoginFrame;
import Swing.MainFrameComponents.MainFrame;
import Swing.SignUpFrameComponents.SignUpFrame;

public class Main {


    public static FriendsFrame friendsFrame;
    public static boolean loginClosed = false, mainClosed = true, friendsClosed = true;
    public static boolean loggedIn = false;
    public static Account loggedAccount;
    public static SignUpFrame signUpFrame;

    public static void main(String[] args) {

        //Account.printAccountsList();
        //Account.removeAllAccounts();

        DB db = new DB();

        LoginFrame loginFrame = new LoginFrame();
        while (!loggedIn){ System.out.print(""); }
        System.out.println("logged in");
        loginFrame.dispose();

        new MainFrame();


    }

}
