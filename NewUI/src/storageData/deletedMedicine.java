package storageData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class deletedMedicine {

    String id;

    public deletedMedicine() {
    }

    public String getId(String medicineid) {
        try {
            // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/pharmacyapp";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            // create the mysql delete statement.
            // i'm deleting the row where the id is "3", which corresponds to my
            // "Barney Rubble" record.
            String query = "delete from medicineinformation where id= ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1,medicineid);
            // execute the preparedstatement
            preparedStmt.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Successfully Deleted!");
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
