package storageData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class registerClass {
 
    public String Name;
    public int Age;
    public String Address;
    public String Username;
    public String Password;

    public registerClass() {
    }
    
    public registerClass(String Name, int Age, String Address, String Username, String Password) {
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.Username = Username;
        this.Password = Password;
        try {
            // create a mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/pharmacyapp";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // the mysql insert statement
            String query = " insert into customerprofile (Name,Age,Address,Username,Password)"
                    + " values (?,?,?,?,?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, Name);
            preparedStmt.setInt(2, Age);
            preparedStmt.setString(3, Address);
            preparedStmt.setString(4, Username);
            preparedStmt.setString(5, Password);
            //execute the preparedstatement
            preparedStmt.execute();
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
