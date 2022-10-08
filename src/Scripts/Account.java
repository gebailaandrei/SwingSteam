package Scripts;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import netscape.javascript.JSObject;

import java.awt.font.GlyphJustificationInfo;
import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Account {

    private String username, pass;
    private final int id;

    List<Account> accounts = new ArrayList<>();

    public Account(String username, String pass){

        id = getNextId();
        this.username = username;
        this.pass = pass;

        Gson gson = new Gson();

        try{
/*            Path path = Paths.get(".accounts");
            BufferedReader reader = Files.newBufferedReader(path);
            Type t = new TypeToken<List<Account>>(){}.getType();

            System.out.println(accounts);
            reader.close();

            accounts.add(this);*/


            Scanner scanner = new Scanner(new File("nextid.txt"));

            Type fooType = new TypeToken<Account>() {}.getType();
            while (scanner.hasNextLine()) {
                accounts.add(new Gson().fromJson(scanner.nextLine(), fooType));
            }

            for(int i = 0; i < accounts.size(); i++)
                System.out.println(accounts.get(i).username);

            String accs = gson.toJson(this);
            FileWriter writer = new FileWriter(".accounts");
            writer.write(accs + "\n");
            writer.write(accs);
            writer.close();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


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

        return id + 1;
    }

}
