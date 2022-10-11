package Scripts;

import App.Main;

public class SignUpScript {

    public static void signUp(String username, String pass){

        DB.insertAccount(username, pass);
        Main.signUpFrame.dispose();

    }

}
