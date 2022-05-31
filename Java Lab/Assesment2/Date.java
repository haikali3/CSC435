public class Date 
{   private String day;     
    private String month;     
    private String year; 
     
    // normal constructor 
    Date(String day, String month, String year) 
    {         this.day = day;         this.month = month;         this.year = year; 
    } 
    
    // accessor    
    public String getDay() 
    { 
        if (this.day.length() < 2)             return "0" + this.day; 
                     return this.day; 
    }  
    
    public String getMonth() 
    { 
        if (this.month.length() < 2)             return "0" + this.month; 
                     return this.month; 
    }   
    
    public String getYear() 
    {         return this.year; 
    } 
} 

