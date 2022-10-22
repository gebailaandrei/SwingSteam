package App;

import Swing.Frames.FriendsFrame;
import Swing.Frames.LoginFrame;
import Swing.Frames.MainFrame;
import Swing.Frames.SignUpFrame;
import java.awt.event.*;

public class Main {


    public static FriendsFrame friendsFrame;
    public static boolean friendsClosed = true;
    public static boolean loggedIn = true;
    public static LoginFrame loginFrame;
    public static SignUpFrame signUpFrame;
    public static MainFrame mainFrame;

    public static void main(String[] args) {

        loginFrame = new LoginFrame();
        while (!loggedIn){ System.out.print(""); }
        System.out.println("logged in");
        loginFrame.dispose();

        mainFrame = new MainFrame();
        mainFrame.setSize(mainFrame.getWidth()+1, mainFrame.getHeight());
        mainFrame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent comp) {
                mainFrame.resized();
            }});
        mainFrame.addWindowStateListener(new WindowAdapter() {
            public void windowStateChanged(WindowEvent evt) {
                mainFrame.resized();
            }});

/*        while (true){
            mainFrame.resized();
        }*/

    }



}
