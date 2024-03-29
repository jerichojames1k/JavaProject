package pharmacyStorage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class loginClass {

    ArrayList<String> Accounts= new ArrayList<String>();
    ArrayList<String> Passwords= new ArrayList<String>();
    ArrayList<String> Username= new ArrayList<String>();
    ArrayList<String> Age= new ArrayList<String>();
 
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
                if (Accounts.contains(accs) && Passwords.contains(pass)) {
                    continue;
                } else {
                    Accounts.add(accs);
                    Passwords.add(pass);
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
    
}
