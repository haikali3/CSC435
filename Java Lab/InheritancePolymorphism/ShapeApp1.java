
/**
 * Application program to run Shape
 */
import java.util.*;
public class ShapeApp1
{    
    public static void main (String[] args)
    {
        Shape sh = new Shape();
        sh.display();
        System.out.println ("\n\n"); 
        
        Rectangle sh1 = new Rectangle();
        sh1.display(); //area basod on initial value -default contructor
        sh1 = new Rectangle(12,34);
        sh1.display();
        System.out.println ("Area based normal constructor " + sh1.calArea());
        System.out.println ("\n\n"); 
        
        Cuboid c= new Cuboid();
        c.display();
        System.out.println ("\ninitial given by default cons " + c.calVolume());
        c.setCuboid (12,45, 34);
        System.out.println ("Based on setter " + c.calVolume());
        
       
    }

}
