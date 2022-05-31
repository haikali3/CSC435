
/**
 * Read the distance in miles, convert to km
 * and display the distance in km
 * input and output statement
 */

import java.util.*; // Scanner class
public class MyClass1
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner (System.in); // declare the object
        
        System.out.println ( "Enter distance in miles" );
        double mile = s.nextDouble();//object.method.()
        
        double km = 1.6 * mile;
        
        System.out.println ( "The distance in km is " + km);
        
    }
}
