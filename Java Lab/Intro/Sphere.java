
/**
 * To calculate volume of a sphere
 */
import java.text.*;
public class Sphere
{
    // instance variables - replace the example below with your own
    private double radius;
    private final double PIE = 3.142;
    
//default constructor
    public Sphere()
    {
       radius = 0.0;
    }
    public Sphere(double r)
    {
       radius = r;
    }

	//mutator/setter method
    public void setSphere(double r)
    {
       radius = r;
    }
    
//accessor method
    public double getRadius()
    {
        return radius;
    }

	//processor method
    public double calVolume()
    {
        return ((4.0/3.0) * PIE * Math.pow(radius,3));
    }


//printer method
    public void displayData()
    {
        System.out.println("Radius " + getRadius());
        System.out.println("Volume " + calVolume());
    }

//toString method
    public String toString()
    {
        return "Radius " + getRadius() + "\nVolume " + calVolume();
    }
}
