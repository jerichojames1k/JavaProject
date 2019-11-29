package newui;

import java.util.Scanner;

public class Rosepharmacy {

    public static void main(String[] args) {
        homePharmacy par=new homePharmacy();
        par.setVisible(true);
        Pharmacy people= new Pharmacy();
        
        //ADMIN
        Pharmacy.Admin ad = people.new Admin("Juan","Bulak","jericho@gmail.com");
        
        //System.out.println("\n<<----The Pharmacist------>>");
        Pharmacy.Pharmacist phar = people.new Pharmacist("James","Mantalongon","jericho@gmail.com");
  
        //THE USER OF THE PHARMACY(ADULT & SENIOR)
         Pharmacy.PharmacyUser use= people.new PharmacyUser ();
       
        //MEDICINE(YOU CAN USE THIS TO ADD A MEDICINE IN THE PHARMACY)
         Pharmacy.Medicine med1= people.new Medicine("Biogesic","Panadol","acetaminophen",10);
         Pharmacy.Medicine med2= people.new Medicine("Lipopeptides","Cubicin®","sDaptomycin",5);
         Pharmacy.Medicine med3= people.new Medicine("Antihistamine","Chlor-Trimeton","Chlorpheniramine",10);
          
       //THE TRICKY CODE FOR THE WHOLE SYSTEM 
        while(true){
            System.out.println("\n<<<---Welocome To My Pharmcy System--->>>");
            System.out.println("\t-TYPE 0 TO EXIT\n\t-Type 1 FOR ADMIN WORK\n\t-TYPE 2 FOR THE PHARMACY USER TO LOGIN THEIR ACCOUNT\n\t-TYPE 3 FOR PHARMACIST WORK\n\t-TYPE 4 FOR REGISTER ACCOUNT OR CREATE ACCOUNT");
            Scanner main= new Scanner(System.in); 
            System.out.print("Type a transaction:");
            String man = main.nextLine();
            //LOGOUT OR EXIT
            if(man.equals("0")){
                System.out.println("\n<<<-----GOOD-BYE AND THANKS FOR YOUR TIME----->>>");
                break;
            }
            //ADMIN
            else if(man.equals("1")){
                System.out.println("\n\t<<----The Admin------>>");
                ad.viewmedicine();            
                ad.viewcustomer();
                ad.viewcustomerorder();
                ad.removeaccount(); 
            }
            //PHARMACY USER
            else if(man.equals("2")){
              System.out.println("\n\t<<----The PHARMACY USER------>>");
              use.login();
            }
             //PHARMACIST
             else if(man.equals("3")){
                System.out.println("\n\t<<----The Pharmacist------>>");
                phar.viewmedicine();            
                phar.viewcustomer();
                phar.viewcustomerorder();
                phar.removemedicine();
                phar.addmedicine();
            }
             //REGISTER ACCOUNT
            else if(man.equals("4")){
                System.out.println("\n\t<<----WELOCOME TO OUR REGISTRATION OR CREATE ACCOUNT------>>");
                Scanner userinfo = new Scanner(System.in);
                //USERANAME
                System.out.print("<-Type Your Personal Information->\n\tType your name:");
                String username=userinfo .nextLine(); 
                //ADDRESS
                System.out.print("\tType your address:");
                String address=userinfo.nextLine();
                //EMAIL
                System.out.print("\tType your email:");
                String email=userinfo.nextLine(); 
                Pharmacy.RegisterAccount registered= people.new RegisterAccount(username,address,email);
               
                registered.register();
            }
            //ERRORS
            else{
                System.out.println("\n/*Type again the transanction\nYou input a wrong transanction*/");
            }
            
        }
     
        
    } 
}