public class DigitalBook extends Book 
{ 
    private int memorySize;     private Date dt; 
     
    // normal constructor 
    DigitalBook(String ISBN, String title, int quantity, int memorySize, 
Date dt)     { 
        super(ISBN, title, quantity);         
        this.memorySize = memorySize;         
        this.dt = dt; 
    } 
     
    // mutator 
    public void setDigitalBook(String ISBN, String title, int quantity, int memorySize, Date dt) 
    { 
        super.setBook(ISBN, title, quantity);         
        this.memorySize = memorySize;         
        this.dt = dt; 
    } 
     
    // accessor     
    public String getDate() 
    { 
        return this.dt.getDay() + this.dt.getMonth(); // ni aku buang this.dt.getYear() 
    } 
     
    // processor 
    
    // to calculate estimated price for digital books depending on the size of memory (in kilobyte) consumed     
    public double estimatedPrice() 
    { 
        double charge = 0.0; 
         
        if (this.memorySize < 200) 
        { 
            charge = 30.00; 
        } 
        else if (this.memorySize >= 200 && this.memorySize <= 500)  
        { 
            charge = 100.00; 
        } 
         
        // to calculate add-on RM 3 for every additional 30 kilobyte after 500 
     else 
        { 
            int ms = this.memorySize;             charge = 100.00; 
             
            while (ms >= 530) 
            { 
                charge += 3.00;                 ms -= 30; 
            } 
        }          
        double discount = 0.0; 
        // 10% discount is given to all digital books for every purchase on 22nd July 
        if (this.getDate().equalsIgnoreCase("2207")) // ni aku tukar condition drpd ("22072021") ke ("2207") 
        { 
            discount += 10.00; 
        } 
         
        // to calculate estimated price          
        return (charge *(100-discount))/100; 
    } 
     
    // printer 
    public String toString() 
    { 
    return super.toString() + ", " + this.memorySize + ", RM" + 
    String.format("%.2f", this.estimatedPrice()) + ", " + this.getDate();  
    } 
} 
