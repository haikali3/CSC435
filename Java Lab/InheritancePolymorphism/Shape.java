
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape
{
   protected int length;
   protected int width;

   public Shape()
   {   length = 10;
        width = 7;          
   }

   public Shape(int length, int width)
   {   this.length = length;
       this.width = width;
   }

   public void setShape(int length, int width)
   {   this.length = length;
       this.width = width;
   }

   public int getLength()
   {    return length;      }
   public int getWidth()
   {    return width;       }
   
   public void display()
   {
       System.out.println ("Length is " + getLength());
       System.out.println ("Width is " + getWidth());
    }
}//end super class

