package newui;

import java.util.ArrayList;
import java.util.Scanner;

public class NewUI {

    public static void main(String[] args) {
        homePharmacy  n=new homePharmacy();
        n.setVisible(true);
        dataStorage d=new dataStorage();
        d.acc("jericho");
        d.acc("james");
        d.pass("love");
        System.out.println(d.getAccount().get(1 ));
        
        
        
        Pharmacy people = new Pharmacy();
        //ADMIN
        Pharmacy.Admin ad = people.new Admin("Juan", "Bulak", "jericho@gmail.com");

        //System.out.println("\n<<----The Pharmacist------>>");
        Pharmacy.Pharmacist phar = people.new Pharmacist("James", "Mantalongon", "james@gmail.com");

        //THE USER OF THE PHARMACY(ADULT & SENIOR)
        Pharmacy.PharmacyUser use = people.new PharmacyUser();

        //MEDICINE(YOU CAN USE THIS TO ADD A MEDICINE IN THE PHARMACY) AS INTIAL MEDICINE LIST
        Pharmacy.Medicine med = people.new Medicine("Biogesic", "Panadol", "acetaminophen", 10);
        Pharmacy.Medicine med1 = people.new Medicine("Biogesic", "Panadol", "acetaminophen", 5);
        Pharmacy.Medicine med2 = people.new Medicine("Lipopeptides", "Cubicin®", "Daptomycin", 5);
        Pharmacy.Medicine med3 = people.new Medicine("Antihistamine", "Chlor-Trimeton", "Chlorpheniramine", 10);

        //THE TRICKY CODE TO THIS SYSTEM 
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("<<<---Welocome To My Pharmcy System--->>>");
            System.out.println("\t-TYPE 0 TO EXIT\n\t-Type 1 FOR ADMIN WORK\n\t-TYPE 2 FOR THE PHARMACY USER TO LOGIN THEIR ACCOUNT\n\t-TYPE 3 FOR PHARMACIST WORK\n\t-TYPE 4 FOR REGISTER ACCOUNT OR CREATE ACCOUNT");
            Scanner main = new Scanner(System.in);
            System.out.println("------------------------------------------------------");
            System.out.print("Type a transaction:");
            String man = main.nextLine();

            //LOGOUT OR EXIT
            if (man.equals("0")) {
                System.out.println("\n<<<-----GOOD-BYE AND THANKS FOR YOUR TIME----->>>");
                break;
            } //ADMIN
            else if (man.equals("1")) {
                System.out.println("\n\t<<----The Admin------>>");
                System.out.println("Admin Name:" + ad.username + "\n" + "Address:" + ad.address);
                ad.viewmedicine();
                ad.viewcustomer();
                ad.viewcustomerorder();
                ad.removeaccount();
            } //PHARMACY USER
            else if (man.equals("2")) {
                System.out.println("\n\t<<----The PHARMACY USER------>>");
                use.login();
            } //PHARMACIST
            else if (man.equals("3")) {
                System.out.println("\n\t<<----The Pharmacist------>>");
                System.out.println("Pharmacist Name:" + phar.username + "\n" + "Address:" + phar.address);
                phar.viewmedicine();
                phar.viewcustomer();
                phar.viewcustomerorder();
                phar.removemedicine();
                phar.addmedicine();
            } //REGISTER ACCOUNT
            else if (man.equals("4")) {
                System.out.println("\n\t<<----WELOCOME TO OUR REGISTRATION OR CREATE ACCOUNT------>>");
                Scanner userinfo = new Scanner(System.in);
                //USERANAME
                System.out.print("<-Type Your Personal Information->\n\tType your name:");
                String username = userinfo.nextLine();
                //ADDRESS
                System.out.print("\tType your address:");
                String address = userinfo.nextLine();
                //EMAIL
                System.out.print("\tType your email:");
                String email = userinfo.nextLine();
                Pharmacy.RegisterAccount registered = people.new RegisterAccount(username, address, email);

                registered.register();
            } //ERRORS
            else {
                System.out.println("\n/*Type again the transanction\nYou input a wrong transanction*/");

            }

        }
    }

}
