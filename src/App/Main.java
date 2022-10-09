package App;

import Scripts.Account;
import Swing.FriendsFrameComponents.FriendsFrame;
import Swing.LoginFrameComponents.LoginFrame;
import Swing.MainFrameComponents.MainFrame;

public class Main {


    public static FriendsFrame friendsFrame;
    public static boolean loginClosed = false, mainClosed = true, friendsClosed = true;
    public static boolean loggedIn = false;
    public static Account loggedAccount;

    public static void main(String[] args) {
        Account andrei = new Account("Andrei", "admin");
        Account andrei1 = new Account("Eugen", "pass");
        Account andrei2 = new Account("Pula", "mea");

        //Account.storeAccount(andrei);
        //Account.storeAccount(andrei1);
        //Account.storeAccount(andrei2);

        //Account.removeAccount(andrei);
        //Account.removeAccount(andrei1);
        //Account.removeAccount(andrei2);

        //Account.printAccountsList();
        //Account.removeAllAccounts();

        LoginFrame loginFrame = new LoginFrame();
        while (!loggedIn){ System.out.print(""); }
        System.out.println("logged in");
        loginFrame.dispose();

        new MainFrame();


    }

}
