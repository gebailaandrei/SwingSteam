package Scripts;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/** For now files will be used instead of a database */
public class DB {

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/steam";
        String uname = "root";
        String pass = "admin";
        String query = "SELECT * FROM accounts;";



        try {
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                String data = "";
                for (int i = 1; i <= 3; i++)
                    data += result.getString(i) + " | ";

                System.out.println(data);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}