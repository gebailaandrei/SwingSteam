package Scripts;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static Scripts.DBConnection.*;
import static Scripts.DBConnection.result;

public class GamesDB {

    /** Adds a game to the database with the specified details */
    public static void insertGame(String gameName, String gameImgUrl, String description, String date, float price, int discount){

        query = "INSERT INTO games (GID, GName, GImage, GDescription, release_date, GPrice, GDiscount) VALUES ("
                + (getNumberOfGames() + 1) + ", \"" + gameName + "\", \""
                + gameImgUrl + "\", \"" + description + "\", \"" + date
                + "\", \"" + price + "\", \"" + discount + "\");";

        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    /** Deletes a game from the database corresponding to the specified GID */
    public static void deleteGame(int GID){

        query = "DELETE FROM games WHERE GID = " + GID + ";";

        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    /** Deletes a game from the database corresponding to the specified game name */
    public static void deleteGame(String name){

        query = "DELETE FROM games WHERE GName = \"" + name + "\";";

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
                                result.getString(4),
                                result.getString(5),
                                result.getString(6),
                                result.getString(7)};
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

    public static List<Game> getGamesList(){

        query = "SELECT * FROM games;";
        List<Game> games = new ArrayList<>();

        try {
            result = statement.executeQuery(query);
            while (result.next()){
                games.add(new Game(Integer.parseInt(result.getString(1)),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4),
                        result.getString(5),
                        Float.parseFloat(result.getString(6)),
                        Float.parseFloat(result.getString(7))));}
            } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }


        return games;
    }

    public static void printGamesList(){

        for(Game game : getGamesList())
            System.out.printf("%-10s %-50s %-70s %-50s %-50s %-70s %-50s %n", game.getGID(),
                game.getGameName(),
                game.getPicURL(),
                game.getDescription(),
                game.getDate(),
                game.getPrice(),
                game.getDiscount());

    }

}
