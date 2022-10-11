package Scripts;

import App.Main;

public class LoginScript {

    public static void logIn(String username, String pass){

        if(DB.checkAccountExists(username)) {
            Main.loggedIn = true;
            /** log in and get acc from database*/
        }else{
            /** ask to try again */
            System.out.println("Username or password wrong. Try again.");
        }

    }

}
