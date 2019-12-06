package storageData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class loginClass {

    ArrayList<String> Accounts = new ArrayList<String>();
    ArrayList<String> Passwords = new ArrayList<String>();
    ArrayList<String> CustomerName = new ArrayList<String>();
    ArrayList<Integer> Age = new ArrayList<Integer>();
    public static ArrayList<String> Customers = new ArrayList<String>();
    public static int CustomerAge = 0;

    public loginClass() {
        try {
            // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/pharmacyapp";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            // our SQL SELECT query. 
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM customerprofile";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {
                int id = rs.getInt("id");
                String accs = rs.getString("Username");
                String pass = rs.getString("Password");
                String customer = rs.getString("Name");
                String addres = rs.getString("Address");
                int age = rs.getInt("Age");
                if (Accounts.contains(accs) && Passwords.contains(pass)) {
                    continue;
                } else {
                    Accounts.add(accs);
                    Passwords.add(pass);
                    //CustomerName.add(customer+"\t"+"Address:"+addres+"\t"+"Age:"+ age +"\n");
                    CustomerName.add(customer + "\tAddress:" + addres + "      " + "Age:" + age + "\n");
                    Age.add(age);
                }
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public void customerAge(String username) {
        //SELECT `id`, `Name`, `Age`, `Address` FROM `customerprofile` WHERE Username='rj45'
        try {
            // create our mysql database connection
            int age = Accounts.indexOf(username);
            CustomerAge += Age.get(age);
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/pharmacyapp";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            // our SQL SELECT query. 
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM customerprofile";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {
                int id = rs.getInt("id");
                String accs = rs.getString("Username");
                String pass = rs.getString("Password");
                String customer = rs.getString("Name");
                String addres = rs.getString("Address");
                int ages = rs.getInt("Age");
                if (accs.equals(username)) {
                    Customers.add(customer+"\tAddress:"+addres+"\tAge:"+ ages);
                    break;
                } else {
                    continue;
                }

            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<String> getAccounts() {
        return Accounts;
    }

    public void setAccounts(ArrayList<String> Accounts) {
        this.Accounts = Accounts;
    }

    public ArrayList<String> getPasswords() {
        return Passwords;
    }

    public void setPasswords(ArrayList<String> Passwords) {
        this.Passwords = Passwords;
    }

    public ArrayList<Integer> getAge() {
        return Age;
    }

    public void setAge(ArrayList<Integer> Age) {
        this.Age = Age;
    }

    public static int getCustomerAge() {
        return CustomerAge;
    }

    public static void setCustomerAge(int CustomerAge) {
        loginClass.CustomerAge = CustomerAge;
    }

    public ArrayList<String> getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(ArrayList<String> CustomerName) {
        this.CustomerName = CustomerName;
    }

    public ArrayList<String> getCustomers() {
        return Customers;
    }

    public void setCustomers(ArrayList<String> Customers) {
        this.Customers = Customers;
    }

}
