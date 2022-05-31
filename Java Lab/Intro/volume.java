
/**
 * To calculate volume of either sphere or cylinder
 */

import java.util.*; //Scanner
import java.text.*; //DecimalFormat
public class volume
{
    public static void main (String[] args)
    {
      Scanner s = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("0.00");
    
      final double PIE = 3.142;
      double radius, height,volume;
      
      System.out.println ("Enter 1 to calculate volume of sphere");
      System.out.println ("Other number to calculate volume of cylinder");
      int select = s.nextInt();
      
      if (select == 1)
      {
          System.out.println ("Enter radius ");
          radius = s.nextDouble();
          volume = 4.0/3.0 * PIE * Math.pow(radius,3);
      }
      
      else
      {
          System.out.println ("Enter radius ");
          radius = s.nextDouble();
          System.out.println ("Enter height ");
          height = s.nextDouble();
          volume = 4.0/3.0 * PIE * Math.pow(radius,2) * height;
      }
      
      System.out.println ("The volume is " + df.format(volume));
    }
}
