package Scripts;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** For now files will be used instead of a database */
public class DB {

    private static String url = "jdbc:mysql://127.0.0.1:3306/steam";
    private static String uname = "root";
    private static String pass = "admin";

    private static Connection con;
    private static Statement statement;
    private static ResultSet result;
    private static String query;

    /** USE THIS FOR MAkiNG CHANGES TO THE DB WITHOUT RUNNING THE WHOLE PROJECT */
    public static void main(String[] args) {
        DB db = new DB();


        Account.printAccountsList();

        //insertAccount(5, "andrei", "pass");
        //deleteAccount("andrei");
        //System.out.println(getNumberOfAccounts());

    }
    /** DB object needs to be created when program start running to establish the connection with the database */
    public DB() {

        try {
            con = DriverManager.getConnection(url, uname, pass);
            statement = con.createStatement();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /** Adds an account to the database with the specified details */
    public static void insertAccount(int id, String username, String password){

        query = "INSERT INTO accounts (id, username, pass) VALUES (" + id + ", '" + username + "', '" + password + "');";

        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    /** Deletes an account from the database corresponding to the specified id */
    public static void deleteAccount(int id){

        query = "DELETE FROM accounts WHERE id = " + id + ";";

        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    /** Deletes an account from the database corresponding to the specified username */
    public static void deleteAccount(String username){

        query = "DELETE FROM accounts WHERE username = '" + username + "';";

        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    /** Gets the id of the account with the specified username */
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
    /** Gets the username of the account with the specified id */
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
    /** Gets the password of the account with the specified username */
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
    /** Gets the id, username and password of the account with the specified id */
    public static String[] getAccDetails(int id){

        query = "SELECT * FROM accounts WHERE id = '" + id + "';";
        String[] details = new String[3];

        try {
            result = statement.executeQuery(query);
            result.next();
            for(int i = 1; i <= 3; i++)
                details[i-1] = result.getString(i);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return details;
    }
    /** Returns the number of accounts in the db */
    public static int getNumberOfAccounts(){
        query = "SELECT COUNT(*) FROM accounts;";

        try {
            result = statement.executeQuery(query);
            result.next();
            return result.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /** Wipe accounts table */
    private void wipeAccounts(){
        query = "DELETE * FROM accounts";

        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checkAccountExists(String username){
        query = "SELECT * FROM accounts WHERE username = '" + username + "';";

        try {
            result = statement.executeQuery(query);
            return result.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Account> getAccountsList(){

        query = "SELECT * FROM accounts;";
        List<Account> list = new ArrayList<>();

        try {
            result = statement.executeQuery(query);
            while (result.next())
                list.add(new Account(result.getInt(1),
                        result.getString("username"),
                        result.getString("pass")));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}