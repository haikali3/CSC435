
public class Shape extends ShapeApp
{
    private int width, length;
    private char type; // R - rectangle, T - triangle, S – square

    public Shape()
    {
        width = 23;
        length = 45;
        type = 'R';
    }
    public Shape(int w, int l, char t)
    {
        width = w;
        length = l;
        type = t;
    }
    //mutator
    //accessors
    public int getWidth()
    {   return width;   }
    public int getLength()
    {   return length;   }
    public char getType()
    {   return type;   }    
    //toString()
    //printer
    //processor
    public double calculateArea()
    {
        if (type=='R')
            return (width*length);
        else if (type=='T')
            return (0.5*(width*length));
        else
            return (length*length);
    }

}