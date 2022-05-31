
/**
 * copy dri slide page
 */
public class Car
{
    private String color;
    private int year;
    private String vin;
        
    public void setColor(String newColor)
    {
        color = newColor;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setYear(int newYear)
    {
        year = newYear;
    }
    
    public String getYear()
    {
        return newYear;
    }
    
    public void setVin(String newVin)
    {
        vin = newVin;
    }
    
    public String getVin()
    {
        return vin;
    }
    
    public void setVin(String newVin)
    {
        Car Axia = new Car();
        Axia.setColor("Silver");
        Axia.setYear(2018);
        Axia.setVin("QAA7658");
        
        System.out.println("My proton is:" + Axia.getColor());
        System.out.println("My proton is from:" + Axia.getYear());
        System.out.println("My proton is:" + Axia.getVin());
    }
}

