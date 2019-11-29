package newui;

import java.util.ArrayList;
import java.util.Scanner;

public class Pharmacy {
    //--THE MAIN STORAGE FOR ALL TRANSANCTION-//
    ArrayList<ArrayList<String>> Account =new ArrayList<ArrayList<String>>();
    //Only the accountname
    ArrayList<String>customeraccountname=new ArrayList<>();
    ArrayList<Integer>Age=new ArrayList<Integer>();
    ArrayList<ArrayList<String>> Password = new ArrayList<ArrayList<String>>();
    ArrayList<String>VIEWCUSTOMER =new ArrayList<>();
    ArrayList<String>CUSTOMERORDER= new ArrayList<>();
    ArrayList<ArrayList<String>> MedicineStore = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> MEDICINEBACKGROUND = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<Integer>> MedicinePrice = new ArrayList<ArrayList<Integer>>();
   
    //--THE BACKUP STORAGE FOR ALL TRANSANCTION--//
     ArrayList<String>medicinestore = new ArrayList<>();
     ArrayList<String>medicinebackground = new ArrayList<String>();
  
//------------------------------------PHARMACIST-------------------------------//
    public class Pharmacist extends PharmacyStaffProfile{

        public Pharmacist(String username, String address, String email) {
            super(username, address, email);
        }

        @Override
        void viewmedicine() {
             System.out.println("Medicine:"+MEDICINEBACKGROUND);
        }
        void addmedicine(){
                ArrayList<String>medicine = new ArrayList<>();
                ArrayList<Integer>price = new ArrayList<>();
                ArrayList<String>medback = new ArrayList<>();
                System.out.println("\t<<--Please Enter a Medicine-->>");
                Scanner add = new Scanner(System.in);
                System.out.print("\tEnter to add a Medicine:");
                String med = add.nextLine(); 
                //MEDICINE
                medicine.add(med);
                medicinestore.add(med);
                MedicineStore.add(medicine);

                System.out.print("\tEnter to create a Generic Name:");
                String generic = add.nextLine();
                    
                System.out.print("\tEnter to create a Brand Name:");
                String brand = add.nextLine();
                while(true)
                {
                    //PRICE
                    Scanner adds = new Scanner(System.in);
                    System.out.print("\tEnter the price of a medicine:");
                    if(adds.hasNextInt())
                    {
                       int medPrice = adds.nextInt();
                       price.add(medPrice);
                       MedicinePrice.add(price);
                       String Priceinfo=Integer.toString(medPrice);
                       //MEDICINEBACKGROUND
                       String allInfo="MedicineName:"+med+",GenericName:"+generic+",BrandName:"+brand+",Price:"+Priceinfo;
                       medback.add(allInfo);
                       medicinebackground.add(allInfo);
                       MEDICINEBACKGROUND.add(medback); 
                       break;
                    }
                    else
                    {
                       System.out.println("\t<<-Y-O-U- -M-U-S-T- -I-N-P-U-T- -A- -N-U-M-B-E-R- -O-N-L-Y-!->>");
                    }
                }
                    
        }
        void removemedicine(){
            
        }
        @Override
        void viewcustomer() {
            System.out.println("Customer:"+VIEWCUSTOMER);
        }

        @Override
        void viewcustomerorder() {
             System.out.println("CustomerOrder:"+CUSTOMERORDER);
        }

 
    }
//---------------------------ADMIN---------------------------------------------//
    public class Admin extends PharmacyStaffProfile{

        public Admin(String username, String address, String email) {
            super(username, address, email);
        }

        @Override
        void viewmedicine() {
            System.out.println("Medicine:"+MEDICINEBACKGROUND );
        }
        @Override
        void viewcustomer() {
            System.out.println("Customer:"+VIEWCUSTOMER);
        }

        @Override
        void viewcustomerorder() {
            System.out.println("CustomerOrder:"+CUSTOMERORDER);
        }
        void removeaccount(){
            System.out.println("Account:"+Account);
        }
     
      
    }
//-------------------------------------------MEDICINE--------------------------//
    public class Medicine{
        //INITIAL STORAGE FOR THE MEDICINE INFORMATION
        ArrayList<String>medicine = new ArrayList<>();
        ArrayList<Integer>price = new ArrayList<>();
        ArrayList<String>medback = new ArrayList<>();
        
        public String medicName;
        public String medicBrandName;
        public String medicGenericName;
        
        public Medicine(String medicName, String medicBrandName, String medicGenericName,int medicineprice) {
           //MEDICINE WITH BRAND NAME ,GENERIC NAME AND PRICE
            medback.add("MedicineName:"+medicName+",BrandName:"+ medicBrandName+",GenericName:"+medicGenericName+",Price:"+medicineprice);
           //MEDICINE NAME ONLY
            medicine.add(medicName);
            medicinestore.add(medicName);
            MedicineStore.add(medicine);
           //MEDICINE PRICE ONLY
            price.add(medicineprice);
            MedicinePrice.add(price);
            //MEDICINE TOTAL INFORMATION OR BACKGROUND
            String medinfo="MedicineName:"+medicName+",BrandName:"+ medicBrandName+",GenericName:"+medicGenericName+",Price:"+medicineprice;
            medicinebackground.add(medinfo);
            MEDICINEBACKGROUND.add(medback);   
        }
        
    }
//----------------------------------------REGISTER ACCOUNT-----------------------//
    public class RegisterAccount extends UserProfile {
        public RegisterAccount(String username, String address, String email) {
            super(username, address, email); 
             VIEWCUSTOMER.add("Name:"+username+",Addresss:"+address+",Email:"+email);
        }
       void register()
        {        
            System.out.println("<<Please Create your Account First For Having an Account!>>");
                            while(true)
                            {
                                ArrayList<String>accounts= new ArrayList<>();
                                Scanner signSen = new Scanner(System.in);
                                System.out.print("\tCreate your accountName:");
                                String accSen = signSen.nextLine();
                                accounts.add(accSen);
                                if(Account.contains(accounts)){
                                       System.out.println("/*Account is already exist!*/");
                                     }
                                else
                                    {                              
                                       customeraccountname.add(accSen); 
                                       Account.add(accounts);                                  
                                           while(true)
                                                {
                                                    Scanner signSent = new Scanner(System.in);
                                                    System.out.print("\tType your Age:");                                                
                                                 if(signSent.hasNextInt())
                                                    {
                                                       int age=signSent.nextInt();
                                                       if(age>=18)
                                                        {
                                                          Age.add(age);
                                                          while(true)
                                                             {
                                                                ArrayList<String>password= new ArrayList<>();
                                                                System.out.print("\tType your password:");
                                                                String passSen = signSen.nextLine();
                                                                password.add(passSen);
                                                             if(Password.contains(password))
                                                                 {
                                                                  System.out.println("/*Password is already exist!*/");
                                                                  }
                                                              else
                                                                  {                                                        
                                                                  Password.add(password);                                                        
                                                                      System.out.println("**************SUCCESSFULLY REGISTERED TO OUR WEBSITE*************");
                                                                  break;
                                                                  }
                                                               }                                                  
                                                         break;
                                                        }  
                                                       System.out.println("<<-Y-O-U- -M-U-S-T- -18- -A-N-D- -A-B-O-V-E>>");
                                                    }                                                   
                                                else{
                                                     System.out.println("\t<<-Y-O-U- -M-U-S-T- -I-N-P-U-T- -A- -N-U-M-B-E-R- -O-N-L-Y-!->>");
                                                    }
                                                }
                                    break;
                                    }                                                    
                            }               
        }
    }
//------------------------------------PHARMACYUSER-----------------------------//
    public class PharmacyUser{
 public void login(){
            String name=""; 
            //-----------------LOGIN YOUR ACCOUNT ADULT-------------------------//
            System.out.println("<<---Please Enter Your Account To Login--->>");
                      while(true)
                       {
                                ArrayList<String>account= new ArrayList<>();
                                Scanner transSen = new Scanner(System.in);
                                System.out.print("\tType your AccountName:");
                                String accSens=transSen.nextLine();
                                account.add(accSens);
                                if(Account.contains(account)){                               
                                    name+=accSens;
                                    while(true)
                                    {
                                        ArrayList<String>password= new ArrayList<>();
                                        //String okSen= Password.get(Account.indexOf(account.get(0))).get(0);
                                        //System.out.println("Your Password is:"+Password.get(Account.indexOf(account)).get(Account.indexOf(account)));
                                        System.out.print("\tEnter your password:");
                                        String pasSen= transSen.nextLine();
                                        password.add(pasSen);
                                         if(Password.contains(password)){
                                             System.out.println("password is corrrect");
                                         System.out.println("\n<<---Successfully login welcome to our website--->>\n");
                                             while(true){
                                                    System.out.println("\n<<---Welcome To Our Pharmacy(THE CUSTOMER USER TRANSANCTION)---->>");
                                                    System.out.println("\t-TYPE 1 TO EXIT");                                                  
                                                    System.out.println("\t-Type 2 to view Medicine");
                                                    Scanner objectSen= new Scanner(System.in); 
                                                    System.out.print("Type a transaction:");
                                                    String tranSen = objectSen.nextLine();
                                              if(tranSen.equals("1"))
                                                     {
                                                       System.out.println("<<THANKS FOR PATRONIZING US SALAMAT!!!>>");
                                                       break;
                                                      }                                      
                                                //<<<-----VIEW MEDICINE--->>
                                               else if(tranSen.equals("2"))
                                                      {
                                                        ArrayList<String>medicinename = new ArrayList<>();
                                                        ArrayList<String>orderbycustomer= new ArrayList<>();                                                 
                                                        int removemedicine=0;
                                                        int total=0;
                                                        System.out.println("\nMedicineList:"+MEDICINEBACKGROUND);
                                                    while(true)
                                                       {
                                                        System.out.println("|------------------------------------------------|");
                                                        System.out.println("|--------(TYPE 0 NOT TO PURCHASE or EXIT)--------|");
                                                        System.out.println("|--------<TYPE 1 TO PURCHASE OR BUY>-------------|");
                                                        System.out.println("|-------[TYPE 2 FOR PAYMENT]---------------------|");
                                                        System.out.println("|------------------------------------------------|\n");
                                                        Scanner AD = new Scanner(System.in);
                                                        System.out.print("\tType a transanction:");
                                                        String phar = AD.nextLine();
                                                        //EXIT
                                                         if(phar.equals("0"))
                                                               {
                                                                System.out.println("<<We're hoping you to buy next time!Thanks for your time.>>");           
                                                                break;
                                                               }
                                                         //PURCHASE
                                                          else if(phar.equals("1"))
                                                                {
                                                                  while(true)
                                                                   {
                                                                      ArrayList<String>medicines= new ArrayList<>();
                                                                      System.out.println("MedicineStore:"+medicinestore);                                                         
                                                                      Scanner par = new Scanner(System.in);
                                                                      System.out.print("\tType the MedicineName:");
                                                                      String medName=par.nextLine();
                                                                      medicines.add(medName);                                                                      
                                                                      if(MedicineStore.contains(medicines))
                                                                       {                                                                              
                                                                        removemedicine+=MedicineStore.indexOf(medicines);                                                                       
                                                                        int customer=customeraccountname.indexOf(name);
                                                                        CUSTOMERORDER.add("CustomerName:"+VIEWCUSTOMER.get(customer)+"and medicine buy is "+medicinebackground.get(customer));
                                                                        orderbycustomer.add(medicinebackground.get(customer));
                                                                        medicinename.add(medName);
                                                                        while(true){
                                                                            Scanner val = new Scanner(System.in);
                                                                            System.out.print("\tType the number of medicine to buy:");                                                                       
                                                                            if(val.hasNextInt()){
                                                                            //System.out.println("Price:"+MedicinePrice.get(MedicineStore.indexOf(medicines)).get(MedicineStore.indexOf(medicines)));
                                                                             int medVal =val.nextInt();
                                                                            total+=medVal*MedicinePrice.get(MedicineStore.indexOf(medicines)).get(0);
                                                                            medicines.clear();
                                                                             break;
                                                                               }
                                                                            else{
                                                                                System.out.println("\t<<-Y-O-U- -M-U-S-T- -I-N-P-U-T- -A- -N-U-M-B-E-R- -O-N-L-Y-!->>");
                                                                            }
                                                                        }
                                                                         //Remove Medicine After you Buy
                                                                         //MedicineStore.remove(removemedicine);
                                                                         //medicinestore.remove(removemedicine);
                                                                         //MEDICINEBACKGROUND.remove(removemedicine);
                                                                         //medicinebackground.remove(removemedicine);
                                                                         //removemedicine=0;
                                                                        break;
                                                                        }
                                                                      else
                                                                        {
                                                                        System.out.println("The medicine doesn't exist or wrong spelling!");
                                                                        }                                                                
                                                                    }                                                                
                                                                }
                                                            //PAYMENT
                                                            else if(phar.equals("2"))
                                                            {
                                                               System.out.println("\nThe TotalCost of the Medicine is:"+total);
                                                            while(true)
                                                                {      
                                                                    while(true)
                                                                    {
                                                                       Scanner pay = new Scanner(System.in);
                                                                       System.out.print("\nEnter the amount of money or Money Payment:");
                                                                       if(pay.hasNextInt())
                                                                        {
                                                                           int paid=pay.nextInt();                                                                                                           
                                                                           int AGE =Age.get(customeraccountname.indexOf(name));
                                                                           if(paid>=total && AGE<60)
                                                                             {
                                                                            System.out.println("\n\t<<--Thanks for Buying Us!-->>");
                                                                            System.out.println("\nYour Ordered Medicine:"+orderbycustomer+"\nTotalCost of Medicine You Buy:"+total);
                                                                            System.out.println("Your Money Change is:"+(paid-total));
                                                                            medicinename.clear();                                                                       
                                                                            total=0;
  //                                                                         //Remove Medicine After you Buy
  //                                                                         MedicineStore.remove(removemedicine);
  //                                                                         medicinestore.remove(removemedicine);
  //                                                                         MEDICINEBACKGROUND.remove(removemedicine);
  //                                                                         medicinebackground.remove(removemedicine);
  //                                                                         removemedicine=0;
                                                                            break;
                                                                             }
                                                                           else if(paid>=total && AGE>=60)
                                                                             {
                                                                             System.out.println("\n\t<<--Thanks for Buying Us!-->>");
                                                                             System.out.println("\nYour Ordered Medicine:"+orderbycustomer+"\nTotalCost is "+total+",DISCOUNT:"+(total*.20)+",Final Total Cost:"+(total-(total*.20)));
                                                                             System.out.println("The Customer is a Senior Citizen and The TotalCost is now:"+(total-(total*.20)));
                                                                             System.out.println("TotalCost is "+total+"-"+(total-(total*.20))+"=Your Money Change is:"+(paid-(total-(total*.20))));
                                                                             medicinename.clear();
                                                                             orderbycustomer.clear();                              
                                                                             total=0;
                                                                           //Remove Medicine After you Buy
  //                                                                         MedicineStore.remove(removemedicine);
  //                                                                         medicinestore.remove(removemedicine);
  //                                                                         MEDICINEBACKGROUND.remove(removemedicine);
  //                                                                         medicinebackground.remove(removemedicine);
  //                                                                         removemedicine=0;
                                                                             break;
                                                                             }
                                                                          else
                                                                           {
                                                                           System.out.print("\t/*<<<----YOUR MONEY IS NOT ENOUGH OR INSUFFICIENT--->>>*/");
                                                                           }
                                                                        }
                                                                     else
                                                                        {                                                             
                                                                         System.out.print("\t<<-Y-O-U- -M-U-S-T- -I-N-P-U-T- -A- -N-U-M-B-E-R- -O-N-L-Y-!->>");                                                                
                                                                        }
                                                                        
                                                                    }
                                                                     break;
                                                                   }                                                               
                                                                }
                                                        else{
                                                                System.out.println("/*TYPE AGAIN THE TRANSANCTION/WRONG INPUT*/");
                                                            }
                                                        }
                                                    }                                             
                                            else{
                                                 System.out.println("/*TYPE AGAIN THE TRANSANCTION/INPUT IS ERROR*/");
                                                }                                             
                                               }
                                           break;
                                           }
                                      else{
                                         System.out.println("/*TYPE AGAIN YOUR PASSWORD*/");
                                        }
                                     }
                                    break;
                                  }
                            else{
                            System.out.println("/*TYPE AGAIN YOUR ACOUNT NAME!!*/");
                          }   
//-----------------------------the last of while true-----------------------------//
                      }            
               }       

    }
    
    
}