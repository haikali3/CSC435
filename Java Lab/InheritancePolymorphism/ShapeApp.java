
/**
 * Application to run Shape
 */
import java.util.*;
public class ShapeApp
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println ("Enter number of object ");
        int n = s.nextInt();
        
        Shape[] sh = new Shape[n];
        Rectangle[] rect = new Rectangle[n];
        Cuboid[] c = new Cuboid[n];
        
        for (int i=0; i<sh.length; i++)
        {
            System.out.println ("Enter length ");
            int length = s.nextInt();
            System.out.println ("Enter width ");
            int width = s.nextInt();
            
            sh[i] = new Shape (length, width);
        }
        System.out.println ("Data for Shape object ");
        for (int i=0; i<sh.length; i++)
            sh[i].display();
            
        System.out.println ("\nEnter data for Rectangle object ");
        for (int i=0; i<rect.length; i++)
        {
            System.out.println ("Enter length ");
            int length = s.nextInt();
            System.out.println ("Enter width ");
            int width = s.nextInt();
            
            rect[i] = new Rectangle (length, width);
        }
       
        System.out.println ("\nEnter data for Cuboid object ");
        for (int i=0; i<c.length; i++)
        {
            System.out.println ("Enter length ");
            int length = s.nextInt();
            System.out.println ("Enter width ");
            int width = s.nextInt();
            System.out.println ("Enter height ");
            int height = s.nextInt();
            
            c[i] = new Cuboid (length, width, height);
        }
        
        System.out.println ("\nDisplay the Rectangle info ");
        for (int i=0; i<rect.length; i++)
        {
            rect[i].display();
            System.out.println ("The area is " + rect[i].calArea());
        }
        
        System.out.println ("\nDisplay the Cuboid info ");
        for (int i=0; i<c.length; i++)
        {
            c[i].display();
            System.out.println ("The volume is " + c[i].calVolume());
        }
    }
}
