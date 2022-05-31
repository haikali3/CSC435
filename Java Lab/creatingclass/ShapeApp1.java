
import java.util.*;
public class ShapeApp1
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner (System.in); // read numerical
        Scanner s1 = new Scanner (System.in); // read numerical
       
        Shape[] shap = new Shape[3];
        //application
        for (int i = 0; i<shap.length; i++)
        {
            shap[i] = new Shape();

            System.out.println ("Enter width ");
            int width = s.nextInt();
            System.out.println ("Enter length ");
            int length = s.nextInt();
            System.out.println ("Enter typ of shape; Rectangle or Triangle ");
            String type = s1.nextLine();
            char ty = type.charAt(0);

            shap[i] = new Shape (width, length, ty); //normal constructor
            //OR (either one)
           // shap[i].setShape(width, length, ty);  //mutator
        }

        for (int i = 0; i<shap.length; i++)
        {
            System.out.println ("Width " + shap[i].getWidth());
            System.out.println ("length " + shap[i].getLength());
            System.out.println ("Type " + shap[i].getType());
            System.out.println ("Area " + shap[i].calculateArea());
        }
    }
}