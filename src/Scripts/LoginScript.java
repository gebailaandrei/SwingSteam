package Scripts;

import App.Main;

import java.io.IOException;
import java.util.Objects;

public class LoginScript {

    public static void logIn(String username, String pass){

        if(Objects.equals(username, "admin") && Objects.equals(pass, "admin")){
            Main.loggedIn = true;
            new Account("andrei", "pass");
            /** log in and get acc from database*/
        }else{
            /** ask to try again */
        }

    }

}
