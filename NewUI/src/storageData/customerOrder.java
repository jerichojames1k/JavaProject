/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storageData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author villahermosa_sd2022
 */

public class customerOrder {
    public static ArrayList<String>RetriveOrder= new ArrayList<String>();
    String customername;
    String medicinebuy;
    int numofmed;
    int totalmed;
    int moneypayment;
    int moneybalance;

    public customerOrder(String customername, String medicinebuy, int numofmed, int totalmed, int moneypayment, int moneybalance) {
        this.customername = customername;
        this.medicinebuy = medicinebuy;
        this.numofmed = numofmed;
        this.totalmed = totalmed;
        this.moneypayment = moneypayment;
        this.moneybalance = moneybalance;
        try {
            // create a mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/pharmacyapp";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // the mysql insert statement
            String query = " insert into customerOrder (customername,medicinebuy,numbermed,totalcostofmedicine,moneypayment,moneybalance)"
                    + " values (?,?,?,?,?,?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, customername);
            preparedStmt.setString(2, medicinebuy);
            preparedStmt.setInt(3, numofmed);
            preparedStmt.setInt(4, totalmed);
            preparedStmt.setInt(5, moneypayment);
            preparedStmt.setInt(6, moneybalance);
            //execute the preparedstatement
            preparedStmt.execute();
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

    public void retrieveCustomerOrder() {
        try {
            // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/pharmacyapp";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            // our SQL SELECT query. 
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM customerorder";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {
                int id = rs.getInt("id");
                //customerOrder (customername,medicinebuy,numbermed,totalcostofmedicine,moneypayment,moneybalance
                String custom = rs.getString("customername");
                String medbuy = rs.getString("medicinebuy");
                int num = rs.getInt("numbermed");
                int total = rs.getInt("numbermed");
                int paid = rs.getInt("moneypayment");
                int bal = rs.getInt("moneybalance");
                RetriveOrder.add(custom+"\t\nMedicineBuy:\t"+"MedicineName:"+medbuy+"\t"+"NumberofMedicineBuy:"+Integer.toString(num)+"\t"+"MedicineTotal:"+Integer.toString(total)+"\t"+"MoneyPaid:"+Integer.toString(paid)+"\t"+"Balances:"+Integer.toString(bal)+"\n");
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public customerOrder() {
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getMedicinebuy() {
        return medicinebuy;
    }

    public void setMedicinebuy(String medicinebuy) {
        this.medicinebuy = medicinebuy;
    }

    public int getNumofmed() {
        return numofmed;
    }

    public void setNumofmed(int numofmed) {
        this.numofmed = numofmed;
    }

    public int getTotalmed() {
        return totalmed;
    }

    public void setTotalmed(int totalmed) {
        this.totalmed = totalmed;
    }

    public int getMoneypayment() {
        return moneypayment;
    }

    public void setMoneypayment(int moneypayment) {
        this.moneypayment = moneypayment;
    }

    public int getMoneybalance() {
        return moneybalance;
    }

    public void setMoneybalance(int moneybalance) {
        this.moneybalance = moneybalance;
    }

    public ArrayList<String> getRetriveOrder() {
        return RetriveOrder;
    }

    public void setRetriveOrder(ArrayList<String> RetriveOrder) {
        this.RetriveOrder = RetriveOrder;
    }

}
