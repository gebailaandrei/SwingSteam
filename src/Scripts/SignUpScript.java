package Scripts;

import App.Main;

public class SignUpScript {

    public static void signUp(String username, String pass){

        Account acc = new Account(username, pass);

        Account.storeAccount(acc);
        System.out.println("workd");
        Main.signUpFrame.dispose();
        /** add acc to db and return to log in frame */

    }

}
