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

        //GamesDB.insertGame("", "", "", "2016-4-21", 10.99f, 66);
        //GamesDB.deleteGame(2);
        GamesDB.printGamesList();
        //System.out.println(GamesDB.getNumberOfGames());

        AccountsDB.printAccountsList();

    }
}
