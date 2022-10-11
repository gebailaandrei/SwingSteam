package Scripts;

import lombok.Getter;

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

    public Account(int id, String username, String pass){

        this.id = id;
        this.username = username;
        this.pass = pass;


    }
    /** Gets a new ID for a new account */
    private int getNextId(){
        return DB.getNumberOfAccounts() + 1;
    }
    /** Stores account in the DB */
    public static void storeAccount(Account acc){
        DB.insertAccount(acc.id, acc.username, acc.pass);
    }
    /** Removes an account from the DB */
    public static void removeAccount(Account acc){
        DB.deleteAccount(acc.id);
    }
    /** Checks if an account with a given name already exists */
    public static boolean checkAccountExists(Account acc){
        return DB.checkAccountExists(acc.username);
    }
    /** Returns a list of all accounts */
    public static List<Account> getAccountsList(){
        return DB.getAccountsList();
    }
    /** Print the list of all the stored accounts */
    public static void printAccountsList(){
        for(Account account : getAccountsList())
            System.out.println("ID: " + account.id + " User: " + account.username + " Pass: " + account.pass);
    }
    /** Stores a list of accounts to the DB */
    public static void storeAccountsList(List<Account> list){
        for(Account acc : list)
            DB.insertAccount(acc.id, acc.username, acc.pass);
    }
}
