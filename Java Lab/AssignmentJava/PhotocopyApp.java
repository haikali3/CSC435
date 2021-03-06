
/**
 * Question 2 Assignment 1
 *
 * @author (MUHAMMAD HAIKAL BIN MOHD TAHAR (2020828192),
 * MUHAMMAD AMIRUL ASYRAF BIN MARZUKI (2020898146),
 * MOHAMAD NAJIB BIN MOHAMAD ASERI (2020865578))
 * @version (12/20/21)
 */

import java.util.*;
import java.text.*;
public class PhotocopyApp
{
    public static void main(String[] args)
    {
        Scanner scS = new Scanner(System.in); // Scanner for String
        Scanner scI = new Scanner(System.in); // Scanner for Integer
        
        String nm; //lecturer name
        String sid; //lecturer staff id
        String fac; //faculty code either FHTM (Faculty of Hotel and
                    //Tourism) or FSSR (Faculty of Sports Science and
                    //Recreation).
        String at; //assestment type either quiz or test or exam.  
        int mn; // number of master copy
        int cn; //number of copies. 
        
        int rec = 1; // counting num of record
        int x = 1; //condition to exit sentinel loop
        Photocopy pc[] = new Photocopy[10]; //declare maximum of 10 array size
        
        for (int i = 0; i < rec ; i++)
        {
            System.out.println("\nPlease enter the information of the Photocopy" + (i+1) + " :");
            System.out.print("Lecturer Name: ");
            nm = scS.nextLine();                //enter lecturer name
            System.out.print("Lecturer Staff ID: ");
            sid = scS.nextLine();               // staff id
            System.out.print("Faculty Code: ");
            fac = scS.nextLine();               //favulty code
            System.out.print("Assestment Type: ");
            at = scS.nextLine();                // assestment type
            System.out.print("Number of Master Copy: ");
            mn = scI.nextInt();                 // number of master copy
            System.out.print("Number of copies: ");
            cn = scI.nextInt();                 // number of copies
            pc[i] = new Photocopy ( nm,sid,fac,at,mn,cn);           // create the new photocopy object
            System.out.print("\nEnter 1 to continue enter photocopy"); //exit loop request
            System.out.print("\nInformation and O to stop: ");
            x = scI.nextInt();
            
            if(x == 1){         //condition to stay in the loop 
                rec++;          //change increase the count of information if user want to continue
            }
             
        }       
        DecimalFormat dec = new DecimalFormat("RM 0.00");
        
        System.out.print("\nPhotocopy Information\n");
        boolean FHTM = false;           //condition for request of photocopy by FHTM fac
        int countFHTM = 0;              //count the number of photocopy by FHTM fac
        
        System.out.println("***********************************");          // print all information
        for (int i = 0; i < rec; i++)
        {
            System.out.println("Photocopy Information    " + (i+1) + ":");
            System.out.println(pc[i].toString());
            System.out.println("-----------------------------------");
               if (pc[i].getFacCode().equalsIgnoreCase("FHTM")){
                   FHTM = true; //true if have request from FHTM
                   countFHTM++; // increase the count
            }
        }
        System.out.println("***********************************");
        
        if (FHTM == true){                              // print information fac fhtm only
            System.out.println("\nFHTM Photocopy information : " + countFHTM );
            System.out.println("\n***********************************");
            for (int i = 0; i < rec; i++){
                if (pc[i].getFacCode().equalsIgnoreCase("FHTM")){               //condition for fac fhtm only
                    System.out.println("Photocopy  " + (i+1) + ":");
                    System.out.println(pc[i].toString());
                    System.out.println("-----------------------------------");
                }}
        }
        System.out.println("***********************************");
        
        double sumTest = 0.00,sumQuiz = 0.00, sumExam = 0.00;
        int countTest = 0,countQuiz = 0,countExam = 0;
        String max = null;
        for (int i = 0; i < rec; i++){      //count by category and total payment
            if (pc[i].getAssType().equalsIgnoreCase("test")){
                sumTest = sumTest + pc[i].calPayment();
                countTest++;
            }
            else if (pc[i].getAssType().equalsIgnoreCase("quiz")){
                sumQuiz = sumQuiz + pc[i].calPayment();
                countQuiz++;
            }
            else if (pc[i].getAssType().equalsIgnoreCase("exam")){
                sumExam = sumExam + pc[i].calPayment();
                countExam++;
            }
        }
        if (sumTest > sumQuiz){         //find the highest assestment
            if (sumTest > sumExam){
                max = "test";}
            else {
                max = "exam";}
            }
        else{
            if (sumQuiz > sumExam){
                max = "quiz";}
            else{
                max = "exam";}}
        
        System.out.println("\nTotal Payment for each Assestment: ");
        System.out.println("\nTest : RM " + dec.format(sumTest));
        System.out.println("\nQuiz : RM " + dec.format(sumQuiz));
        System.out.println("\nExam : RM " + dec.format(sumExam));
        System.out.println("\nMost common assestment : "+ max);
    }
}
