public class PhysicalBook extends Book 
{ 
    private int numPage;
    private boolean hardcover; 
     
    // normal constructor 
    PhysicalBook(String ISBN, String title, int quantity, int numPage, boolean hardcover) 
    { 
        super(ISBN, title, quantity);         
        this.numPage = numPage;         
        this.hardcover = hardcover; 
    } 
     
    // mutator 
    public void setPhysicalBook(String ISBN, String title, int quantity, int numPage, boolean hardCover) 
    { 
        super.setBook(ISBN, title, quantity);         
        this.numPage = numPage;         
        this.hardcover = hardCover; 
    } 
    
    //accessor
    public boolean gethardcover()
    {   
        return hardcover;
    }
    
    // processor 
    // to calculate estimated price of physical books depending to the number of pages and book’s hardcover     
    public double estimatedPrice() 
    { 
        double charge = 0.0; 
         
        if (this.numPage < 100) 
        { 
            charge = 30.00; 
        } 
        else if (this.numPage >= 100 && this.numPage <= 200)  
        { 
            charge = 60.00; 
        } 
         
        // formula      
        else 
        { 
            int np = this.numPage;             
            charge = 60.00; 
             
            while (np >= 230) 
            { 
                charge += 5.00;                 
                np -= 30; 
            } 
        } 
         
        // 10MYR for hardcover  
        if (this.hardcover) 
        { 
            charge += 10.00; 
        }    
        
    return charge; 
    } 
     
    // printer     
    public String toString() 
    { 
        return super.toString() + "\nNUMBER PAGE >>" + this.numPage + "\nHARDCOVER >>" + this.hardcover + "\n MYR " + String.format("%.2f", this.estimatedPrice());  
    } 
}
