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

        //GamesDB.insertGame("CovidBattle", "src/images/covidbattle.png", "This is the game I made for my capstone project");
        //GamesDB.deleteGame("CovidBattle");
        GamesDB.deleteGame(3);
        GamesDB.printGamesList();
        //System.out.println(GamesDB.getNumberOfGames());

    }
}
