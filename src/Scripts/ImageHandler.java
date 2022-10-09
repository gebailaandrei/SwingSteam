package Scripts;

import javax.swing.*;
import java.awt.*;

public class ImageHandler {

    private static String path = "src/Images/";

    public static final String ADD_A_GAME_ICON = "AddAGameIcon.png";
    public static final String CHECKED_BOX = "CheckedBox.png";
    public static final String FRIENDS_AND_CHAT_ICON = "FriendsAndChatIcon.png";
    public static final String NOT_A_ROBOT_ICON = "NotARobotIcon.png";
    public static final String SIGN_IN_ICON = "SignInIcon.png";
    public static final String SIGN_UP_ICON = "SignUpIcon.png";
    public static final String STEAM_ICON = "SteamIcon.png";
    public static final String UNCHECKED_BOX = "UncheckedBox.png";

    public static ImageIcon loadImage(String imgName){

        return new ImageIcon(path + imgName);

    }


}
