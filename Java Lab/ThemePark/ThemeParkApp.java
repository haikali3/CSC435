import java.util.*; //format value double etc...
import java.text.*; // scanner
public class ThemeParkApp
{
    public static void main(String[] args)
    { 
    Scanner scS = new Scanner(System.in); // Scanner for String
    Scanner scI = new Scanner(System.in); // Scanner for Integer
    Scanner scB = new Scanner(System.in); // scanner for boolean
    
    String n;
    String id;
    String cat;
    boolean ch;
    boolean mem;
    
    System.out.println("Enter Array Size: ");
    int as = scI.nextInt();
    ThemePark [ ] tp = new ThemePark[as]; //array of object themepark
    int rec = 1; // counting num of record
    int x = 1; //condition to exit sentinel loop
    
    for (int i = 0; i < rec ; i++)
        {
            System.out.println("\nPlease enter the information" + (i+1) + " :");
            System.out.print("Customer Name: ");
            n = scS.nextLine();                
            System.out.print("Customer ID (Alphabet followed with number, Enter X if  non - malaysian: ");
            id = scS.nextLine();               
            System.out.print("Category (Water Park , Wild Life, Night Safari): ");
            cat = scS.nextLine();
            
            System.out.print("Child or Adult(Enter true if child or false if adult): ");
            ch = scB.nextBoolean();                
            System.out.print("Member or Non Member(Enter true if member or false if non member): ");
            mem = scB.nextBoolean();
            
            tp[i] = new ThemePark ( n,id,cat,ch,mem);          
            System.out.print("\nEnter 1 to continue enter more "); //exit loop request
            System.out.print("\nCustomer  or  O to stop: ");
            x = scI.nextInt();
            
            if(x == 1){         //condition to stay in the loop 
                rec++;          //change increase the count of information if user want to continue
            }
             
        }       
    DecimalFormat dec = new DecimalFormat("RM 0.00"); 
    
    System.out.print("\nCustomer Information\n");   
    System.out.println("*************");          // print all information
    for (int i = 0; i < rec; i++)
    {
        System.out.println("Customer " + (i+1) + " Information : ");
        System.out.println(tp[i].toString());
        System.out.println("-----------------------------------");
    }
    
    double waterParkcharge = 0.00;
    double wildLifeCharge = 0.00;
    double nightSafariCharge = 0.00;
    System.out.println("Total Charge Every Category : ");
    for( int i = 0; i <tp.length; i++){
        if (tp[i].getCategory().equalsIgnoreCase("Water Park"))
            waterParkcharge = waterParkcharge + tp[i].calCharges();
        else if (tp[i].getCategory().equalsIgnoreCase("Wild Life"))
        wildLifeCharge = wildLifeCharge + tp[i].calCharges();
        else if (tp[i].getCategory().equalsIgnoreCase("Night Safari"))
        nightSafariCharge = nightSafariCharge + tp[i].calCharges();
    }
    System.out.println(" Total charges for Water Park : " + waterParkcharge);
    System.out.println("\n Total charges for Wild Life : " + wildLifeCharge);
    System.out.println("\n Total charges for Night Safari : " + nightSafariCharge);
    
    System.out.println("Information on Adult Customer Only : ");
    for( int i = 0; i < tp.length ; i++){
        if(tp[i]. getChild() == false)
    {
        System.out.println(tp[i].toString());
    }}

    }
    
}