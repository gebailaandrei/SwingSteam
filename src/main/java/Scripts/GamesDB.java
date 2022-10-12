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
