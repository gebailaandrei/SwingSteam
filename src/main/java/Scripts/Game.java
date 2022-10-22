package Scripts;

import lombok.AllArgsConstructor;
import lombok.Getter;

//* This class is used for getting games from the db as Game objects, so they can be listed in the app */
@Getter
@AllArgsConstructor
public class Game {

    private int GID;
    private String gameName, picURL, description, date;
    private float price, discount;


}
