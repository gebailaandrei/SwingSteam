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

        System.out.println(GamesDB.getGameDetails(1)[0] + " | " + GamesDB.getGameDetails(1)[1] + " | "
                + GamesDB.getGameDetails(1)[2]);
        //System.out.println(GamesDB.getNumberOfGames());

    }
}
