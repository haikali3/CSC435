public abstract class Book 
{ 
    private String ISBN;     
    private String title;     
    private int quantity; 
    
    // normal constructor 
    Book(String ISBN, String title, int quantity) 
    { 
        this.ISBN = ISBN;         
        this.title = title;         
        quantity = quantity; 
    } 
     
    // mutator 
    public void setBook(String ISBN, String title, int quantity) 
    { 
        this.ISBN = ISBN;         
        this.title = title;         
        this.quantity = quantity; 
    } 
     
    // accessor 
    public double getQuantity() 
    { 
        return this.quantity; 
    } 
     
    // processor 
    public abstract double estimatedPrice(); 
     
    //printer 
    public String toString() 
    { 
        return "ISBN >>" + this.ISBN + "\nTITLE >>" + this.title + "\nQUANTITY >>" + this.getQuantity();  
    } 
} 

