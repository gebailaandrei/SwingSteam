package Scripts;

import java.io.*;
import java.util.*;

public class Account implements Serializable{

    private String username, pass;
    private final int id;

    public Account(String username, String pass){

        id = getNextId();
        this.username = username;
        this.pass = pass;


    }

    /** Gets a new ID for a new account */
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

    /** Stores account in the DB */
    public static void storeAccount(Account acc){

        if(checkAccountExists(acc)) {
            System.out.println("Account \"" + acc.username + "\" already exists.");
            return;
        }

        List<Account> list = getAccountsList();
        list.add(acc);

        try {

            FileOutputStream fileOut =
                    new FileOutputStream("accounts.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(list);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /** Removes an account from the DB */
    public static void removeAccount(Account acc){
        if(!checkAccountExists(acc)) {
            System.out.println("Account \"" + acc.username + "\" can't be removed because it doesn't exist.");
            return;
        }

        List<Account> list = getAccountsList();

        int i = 0;
        for (Account account : list) {
            if(Objects.equals(account.username, acc.username))
                break;
            i++;
        }

        list.remove(i);

        storeAccountsList(list);
    }

    /** Checks if an account with a given name already exists */
    public static boolean checkAccountExists(Account acc){
        for (Account account : getAccountsList()){
            if(Objects.equals(account.username, acc.username))
                return true;
        }
        return false;
    }

    /** Returns a list of all accounts */
    public static List<Account> getAccountsList(){

        try {
            FileInputStream fileIn = new FileInputStream("accounts.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List<Account> list = (List<Account>) in.readObject();
            in.close();
            fileIn.close();
            return list;
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }

        return new ArrayList<>();
    }

    /** Print the list of all the stored accounts */
    public static void printAccountsList(){

        for(Account account : getAccountsList())
            System.out.println("User: " + account.username + " | Pass: " + account.pass);
    }

    /** Stores a list of accounts to the DB */
    public static void storeAccountsList(List<Account> list){
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("accounts.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(list);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeAllAccounts(){

        List<Account> list = getAccountsList();
        list.clear();
        storeAccountsList(list);

    }
}
