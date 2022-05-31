
/**
 * read name, id, citizen(true/false), mark1,mark2
 * get the average of mark, display pass or fail
 * based on average; >=49.5 - pass, otherwise fail
 * display back all the info
 */
import java.util.*; //Scanner 
public class MyClass2
{
   public static void main(String[] args)
    {
      Scanner s = new Scanner (System.in); // read number data
      Scanner s1 = new Scanner (System.in); // read boolean data
      Scanner s2 = new Scanner (System.in); // read string data
      
      System.out.println (" Enter name ");
      String name = s2.nextLine();
      
      System.out.println (" Enter ID ");
      long id = s.nextLong();
      
      System.out.println (" Enter citizen, true/false ");
      boolean citizen = s1.nextBoolean();
      
      System.out.println (" Enter mark1 ");
      double mark1 = s.nextDouble();
      
      System.out.println (" Enter mark1 ");
      double mark2 = s.nextDouble();
      
      
      double aver = (mark1+ mark2)/2;
      
      System.out.println (" Name is "+ name);
      System.out.println (" ID is "+ id);
      System.out.println (" Citizen "+ citizen);
      System.out.println (" Average mark is "+ aver);
      if (aver>=49.5)
          System.out.println ("Pass ");
        else
        System.out.println ("Fail");
    }
}
