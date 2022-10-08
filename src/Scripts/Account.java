package Scripts;


import java.awt.font.GlyphJustificationInfo;
import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Account implements Serializable{

    public String username, pass;
    private final int id;

    List<Account> accounts = new ArrayList<>();

    public Account(String username, String pass){

        id = getNextId();
        this.username = username;
        this.pass = pass;

        accounts.add(this);



    }

    private int getNextId(){
        int id = 0;
        try {
            File file = new File("nextid.txt");

            id = Integer.parseInt(new Scanner(file).nextLine());

            FileWriter writer = new FileWriter("nextid.txt");
            writer.write(String.valueOf(++id));
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return id;
    }

}
