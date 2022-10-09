package Scripts;

import App.Main;

import java.io.IOException;
import java.util.Objects;

public class LoginScript {

    public static void logIn(String username, String pass){

        Account acc = new Account(username, pass);
        if(Account.checkAccountExists(acc)) {
            Main.loggedIn = true;
            Main.loggedAccount = acc;
            /** log in and get acc from database*/
        }else{
            /** ask to try again */
        }

    }

}
