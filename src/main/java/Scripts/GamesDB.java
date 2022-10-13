package Scripts;

import java.sql.SQLException;

import static Scripts.DBConnection.*;
import static Scripts.DBConnection.result;

public class GamesDB {

    /** Adds a game to the database with the specified details */
    public static void insertGame(String gameName, String gameImgUrl, String description){

        query = "INSERT INTO games (GID, GName, GImage, GDescription) VALUES ("
                + (getNumberOfGames() + 1) + ", '" + gameName + "', '"
                + gameImgUrl + "', '" + description + "');";

        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    /** Gets a games details based on the given GID */
    public static String[] getGameDetails(int GID){
        query = "SELECT * FROM games WHERE GID = " + GID + ";";

        try {
            result = statement.executeQuery(query);
            result.next();
            return new String[]{result.getString(2),
                                result.getString(3),
                                result.getString(4)};
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /** Returns the number of games in the db */
    public static int getNumberOfGames(){
        query = "SELECT COUNT(*) FROM games;";

        try {
            result = statement.executeQuery(query);
            result.next();
            return result.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
