package newui;

import java.util.ArrayList;

public class dataStorage {

    // ArrayList<String> Account = new ArrayList<>();
    //ArrayList<String> Password = new ArrayList<>();
    private ArrayList<String> Account;
    private ArrayList<String> Password;

    public dataStorage() {
        Account = new ArrayList<>();
        Password = new ArrayList<>();

    }

    public ArrayList<String> getAccount() {
        return Account;
    }

    public void setAccount(ArrayList<String> Account) {
        this.Account = Account;
    }

    public ArrayList<String> getPassword() {
        return Password;
    }

    public void setPassword(ArrayList<String> Password) {
        this.Password = Password;
    }

    public void acc(String str) {
        Account.add(str);
    }
    
    public void pass(String str) {
        Account.add(str);
    }
}
