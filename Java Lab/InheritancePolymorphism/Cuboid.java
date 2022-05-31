
/**
 * Write a description of class Cuboid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cuboid extends Shape
{
    // instance variables - replace the example below with your own
    private int height;

    public Cuboid()
    {
        super();
        height = 90;
    }

   public Cuboid(int length, int width, int height)
    {
        super(length, width);
        this.height = height;
    }
    
    public void setCuboid(int length, int width, int height)
    {
        super.setShape(length, width);
        this.height = height;
    }
    
    public int getHeight()
    {
            return height;
    }
    
    public int calVolume()
    {
       return (super.getLength()*super.getWidth()*getHeight()); 
    }
    public void display()
    {
        super.display();
        System.out.println ("Height is " + getHeight());
        System.out.println ("The volume is " + calVolume());
    }
}
