
/**
 * Array of object
 */
import java.util.*;
public class ShapeApp2
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner (System.in);
        
        System.out.println ("Enter size of array object ");
        int n = s.nextInt();
        
        //Shape[] sh = new Shape[n];
        Rectangle[] r = new Rectangle [n];
        Cuboid[] c = new Cuboid[n];
        
        System.out.println ("Enter information of Rectangle object ");
        for (int i=0; i<r.length; i++)
        {
            System.out.println ("Enter length ");
            int length = s.nextInt();
            System.out.println ("Enter width ");
            int width = s.nextInt();
            
            r[i] = new Rectangle (length, width);
        }
        System.out.println ("\nEnter information of Cuboid object ");
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
        
        System.out.println ("\n\nDisplay back information of Rectangle object ");
        for (int i=0; i<r.length; i++)
        {
            r[i].display();
        }
        
        System.out.println ("\nDisplay back information of Cuboid object ");
        for (int i=0; i<c.length; i++)
        {
            c[i].display();
        }
        
        //find and display the average of area for Rectangle object
        //find and display the average of volume for Cuboid object
    }
}
