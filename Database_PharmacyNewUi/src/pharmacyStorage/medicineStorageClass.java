package pharmacyStorage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class medicineStorageClass {
    
    ArrayList<String>Medicines= new ArrayList<String>();
    ArrayList<String>MedicineList= new ArrayList<String>();
    ArrayList<Integer>MedicinePrice= new ArrayList<Integer>();
    public String typeofmedicine;
    public String medicbrandname;
    public String medicgenericname;
    public int medicineprice;

    public medicineStorageClass(String typeofmedicine, String medicbrandname, String medicgenericname, int medicineprice) {
        this.typeofmedicine = typeofmedicine;
        this.medicbrandname = medicbrandname;
        this.medicgenericname = medicgenericname;
        this.medicineprice = medicineprice;
         try {
            // create a mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/pharmacyapp";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // the mysql insert statement
            String query = " insert into medicineinformation (typeofmedicine,medicbrandname,medicgenericname,medicineprice)"
                    + " values (?,?,?,?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1,typeofmedicine);
            preparedStmt.setString(2,medicbrandname);
            preparedStmt.setString(3,medicgenericname);
            preparedStmt.setInt(4,medicineprice);
            //execute the preparedstatement
            preparedStmt.execute();
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

    public String getTypeofmedicine() {
        return typeofmedicine;
    }

    public void setTypeofmedicine(String typeofmedicine) {
        this.typeofmedicine = typeofmedicine;
    }

    public String getMedicbrandname() {
        return medicbrandname;
    }

    public void setMedicbrandname(String medicbrandname) {
        this.medicbrandname = medicbrandname;
    }

    public String getMedicgenericname() {
        return medicgenericname;
    }

    public void setMedicgenericname(String medicgenericname) {
        this.medicgenericname = medicgenericname;
    }

    public int getMedicineprice() {
        return medicineprice;
    }

    public void setMedicineprice(int medicineprice) {
        this.medicineprice = medicineprice;
    }

    public medicineStorageClass() {
    }
    
   public void MedicineInformation(){
               try {
            // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/pharmacyapp";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // our SQL SELECT query. 
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM medicineinformation";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {
                int id = rs.getInt("id");
                String type = rs.getString("typeofmedicine");
                String brand = rs.getString("medicbrandname");
                String gen = rs.getString("medicgenericname");
                int value = rs.getInt("medicineprice");
                String price=Integer.toString(value);
                Medicines.add("\t"+type+"\t"+gen+"\t"+brand+"\t"+price);
                MedicineList.add(gen);
                MedicinePrice.add(value);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
   } 

    public ArrayList<String> getMedicines() {
        return Medicines;
    }

    public void setMedicines(ArrayList<String> Medicines) {
        this.Medicines = Medicines;
    }

    public ArrayList<String> getMedicineList() {
        return MedicineList;
    }

    public void setMedicineList(ArrayList<String> MedicineList) {
        this.MedicineList = MedicineList;
    }

    public ArrayList<Integer> getMedicinePrice() {
        return MedicinePrice;
    }

    public void setMedicinePrice(ArrayList<Integer> MedicinePrice) {
        this.MedicinePrice = MedicinePrice;
    }

   
    
   
   
}
