package Scripts;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/** For now files will be used instead of a database */
public class DB {

    static String url = "jdbc:mysql://127.0.0.1:3306/steam";
    static String uname = "root";
    static String pass = "admin";

    static Connection con;
    static Statement statement;
    static ResultSet result;
    static String query;

    public DB() {

        try {
            con = DriverManager.getConnection(url, uname, pass);
            statement = con.createStatement();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(getAccDetails(1));
    }

    public static int getID(String user){

        query = "SELECT id FROM accounts WHERE username = '" + user + "';";

        try {
            result = statement.executeQuery(query);
            result.next();
            return Integer.parseInt(result.getString("id"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getUsername(int id){

        query = "SELECT username FROM accounts WHERE id = '" + id + "';";

        try {
            result = statement.executeQuery(query);
            result.next();
            return result.getString("username");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getPassword(String user){

        query = "SELECT pass FROM accounts WHERE username = '" + user + "';";

        try {
            result = statement.executeQuery(query);
            result.next();
            return result.getString("pass");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[] getAccDetails(int id){

        query = "SELECT * FROM accounts WHERE id = '" + id + "';";
        String[] details = new String[3];

        try {
            PreparedStatement stmt = con.prepareStatement(
                    query,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            result = stmt.executeQuery(query);

            for(int i = 1; i <= 3; i++)
                System.out.println(result.getString(i));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return details;
    }

}