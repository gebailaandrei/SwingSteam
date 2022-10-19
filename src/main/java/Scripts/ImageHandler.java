package Scripts;

import javax.swing.*;
import java.awt.*;

public class ImageHandler {

    private static String path = "src/main/java/Images/";

    public static final String ADD_A_GAME_ICON = "AddAGameIcon.png";
    public static final String CHECKED_BOX = "CheckedBox.png";
    public static final String FRIENDS_AND_CHAT_ICON = "FriendsAndChatIcon.png";
    public static final String NOT_A_ROBOT_ICON = "NotARobotIcon.png";
    public static final String SIGN_IN_ICON = "SignInIcon.png";
    public static final String SIGN_UP_ICON = "SignUpIcon.png";
    public static final String STEAM_ICON = "SteamIcon.png";
    public static final String UNCHECKED_BOX = "UncheckedBox.png";
    public static final String STEAM_FRAME_BAR_ICON = "SteamFrameBarIcon.png";
    public static final String THUMBS_UP_RATING = "ThumbsUpRating.png";

    /** Loads an image from the project files and returns it as a ImageIcon */
    public static ImageIcon loadImageIcon(String imgName){
        return new ImageIcon(ImageHandler.path + imgName);
    }
    public static ImageIcon loadImageIcon(String path, String imgName){
        return new ImageIcon(path + imgName);
    }
    public static Image loadImage(String imgName){
        return loadImageIcon(imgName).getImage();
    }
    public static Image loadImage(String path, String imgName){
        return loadImageIcon(path, imgName).getImage();
    }
    /** Resizes image and returns an ImageIcon object */
    public static ImageIcon resizeImageIcon(int newWidth, int newHeight, Image img){
        return new ImageIcon(img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH));
    }
    /** Resizes image and returns an Image object */
    public static Image resizeImage(int newWidth, int newHeight, Image img){
        return img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    }

}
