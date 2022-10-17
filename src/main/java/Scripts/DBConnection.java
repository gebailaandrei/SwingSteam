package Scripts;

import java.sql.*;

public class DBConnection {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/steam";
    private static final String uname = "root";
    private static final String pass = "admin";

    public static Statement statement;
    public static ResultSet result;
    public static String query;

    static {
        try {
            Connection con = DriverManager.getConnection(url, uname, pass);
            statement = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    // Used for testing the database
    public static void main(String[] args) {

        //GamesDB.insertGame("Dota 2", "src/main/java/Images/GameIcons/Dota2.jpg", "Every day, millions of players worldwide enter battle as one of over a hundred Dota heroes. And no matter if it's their 10th hour of play or 1,000th, there's always something new to discover. With regular updates that ensure a constant evolution of gameplay, features, and heroes, Dota 2 has taken on a life of its own.");
        //GamesDB.deleteGame(2);
        //GamesDB.printGamesList();
        //System.out.println(GamesDB.getNumberOfGames());

    }
}
