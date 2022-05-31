
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    public Rectangle()
	{
		super();
	}

        public Rectangle(int length, int width)
	{
		super(length, width);
	}

        public void setRectangle(int length, int width)
	{
		super.setShape(length, width);
	}

	public int calArea()
	{	return (super.getWidth()*super.getLength());	}
	
	public void display()
	{
	    super.display();
	    System.out.println ("The area is " + calArea());
	    
	   }
}//end sub class 2

