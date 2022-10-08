package App;

import Scripts.Account;
import Swing.FriendsFrameComponents.FriendsFrame;
import Swing.LoginFrameComponents.LoginFrame;
import Swing.MainFrameComponents.MainFrame;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import netscape.javascript.JSObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {


    public static FriendsFrame friendsFrame;
    public static boolean loginClosed = false, mainClosed = true, friendsClosed = true;
    public static boolean loggedIn = false;

    public static void main(String[] args) {
        Account andrei = new Account("Andrei", "admin");
        Account andrei1 = new Account("Eugen", "pass");
        Account andrei2 = new Account("Pula", "mea");

        List<Account> accounts = new ArrayList<>();
        accounts.add(andrei);
        accounts.add(andrei1);
        accounts.add(andrei2);

        List<Account> list = new ArrayList<>();

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("accounts.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(accounts);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileIn = new FileInputStream("accounts.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            list = (List<Account>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        for (Account acc : list){
            System.out.println(acc.username + " | " + acc.pass);
        }


        LoginFrame loginFrame = new LoginFrame();
        while (!loggedIn){ System.out.print(""); }
        System.out.println("logged in");
        loginFrame.dispose();
        MainFrame mainFrame = new MainFrame();


    }

}
