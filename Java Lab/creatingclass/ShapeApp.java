import java.util.*;
public class ShapeApp
{
    public static void main (String[] args)
    {
       Scanner s = new Scanner (System.in); //read numerical
       Scanner s1 = new Scanner (System.in); //read String
       
       Shape shap = new Shape();
       Shape shap1 = new Shape();
       
       System.out.println ("Enter width ");
	int width = s.nextInt();
	System.out.println ("Enter length ");
	int length = s.nextInt();
	System.out.println ("Enter type shape ; Rectangle or Triangle");
	String type = s1.nextLine();
	char ty = type.charAt(0);
       
	shap = new Shape (width, length, ty);
	System.out.println ("The area is  " + shap.calculateArea());
	 
        System.out.println ("Enter width ");
	int width1 = s.nextInt();
	System.out.println ("Enter length ");
	int length1 = s.nextInt();
	System.out.println ("Enter type shape ; Rectangle or Triangle");
	String type1 = s1.nextLine();
	char ty1 = type.charAt(0);
	
	shap1 = new Shape (width1, length1, ty1);
        System.out.println ("The area is  " + shap1.calculateArea());


    }
}