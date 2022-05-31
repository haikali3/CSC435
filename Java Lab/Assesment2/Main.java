import java.util.Scanner;
import java.util.StringTokenizer;  
public class Main 
{ 
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in); // string         
        Scanner sc = new Scanner(System.in); // int 
         
        //array with 100 object 
        Book[] book = new Book[100];         
        Date[] date = new Date[100]; 
         
        //read info         
        int bookCnt = 0; 
        for (int i = 0; i < book.length; i++) 
        { 
           System.out.println ("Press '0' to stop"); 
           System.out.println("Pleas enter ISBN: "); 
           String ISBN = s.nextLine(); 
            
           // input 0 to stop loop
           if (ISBN.equals("0"))
           { 
               System.out.print("\n");
               break;     
            }                 
            
           System.out.println("TITLE: "); 
           String title = s.nextLine(); 
              
           System.out.println("QUANTITY: ");
           int quantity = sc.nextInt(); 
              
           System.out.println("DAY: "); 
           String day = s.nextLine(); 
 
           System.out.println("MONTH "); 
           String month = s.nextLine(); 
            
           System.out.println("YEAR "); 
           String year = s.nextLine(); 
            
           //stored user input into date array            
           date[i] = new Date(day, month, year); 
            
           //store info physical/digital
           System.out.println("-PHYSICAL AND DIGITAL- [p/d]"); 
           String bookType = s.nextLine();            
            
           //if (bookType.equalsIgnoreCase("d"))
           switch(bookType){
           case "d":
           {    
               System.out.println("MEMORY SIZE: ");
               int memorySize = sc.nextInt(); 
                
               // book array with ISBN title quantity memory size and date
               book[i] = new DigitalBook(ISBN, title, quantity, memorySize, date[i]);    
               break;
            }    
            
            //else
           case "p": 
           { 
               System.out.println("NUMBER PAGE : ");                
               int numPage = sc.nextInt(); 
                  
               System.out.println("HARDCOVER (y/n)"); 
               String HardcoverBook = s.nextLine(); 
                
               // enter Y and boolean will change from false to true
               boolean hardcover = false; 
               if (HardcoverBook.equalsIgnoreCase("Y")) 
               { 
                   hardcover = true; 
               } 
               else if (HardcoverBook.equalsIgnoreCase("N"))
               {
               hardcover = false;
                }
               else 
               {
               System.out.println("INVALID CHARACTER");
                break;
                }
                //book array 
               book[i] = new PhysicalBook(ISBN, title, quantity, numPage, hardcover); 
               break;
               }
            }
           bookCnt++; 
           System.out.print("\n");     
        } 
         
        int pbookCnt = 0;
        for (int i = 0; i < bookCnt; i++) 
        { 
            if (book[i] instanceof PhysicalBook)
            pbookCnt++; 
        }         
        System.out.println("TOTAL PHYSICAL BOOK : " + pbookCnt); 
                
        int dbookCnt = 0; 
        for (int i = 0; i < bookCnt; i++) 
        { 
            if (book[i] instanceof DigitalBook)
            dbookCnt++; 
        } 
        System.out.println("TOTAL DIGITAL BOOK : " + dbookCnt); 
        
        // to calculate and display total of estimated price of ALL purchases on 22nd July         
        double finalPrice = 0.0;         
        for (int i = 0; i < bookCnt; i++) 
        { 
            if (date[i].getDay().equalsIgnoreCase("22") && date[i].getMonth().equalsIgnoreCase("07"))                 
            finalPrice += book[i].estimatedPrice(); 
        } 
        System.out.println("Estimated price during 22nd July is RM" + String.format("%.2f", finalPrice)); 
         
        // Using the StringTokenizer class, the program will divide the book information string into token based on the ", " delimeter 
        // and then these token of string will be searched wether or not the book has hardcover 
        // If it does the book information will be print out         
        int hardCount = 0; 
        for (int i = 0; i < bookCnt; i++) 
        { 
            if (book[i] instanceof PhysicalBook) 
            { 
                StringTokenizer st = new 
                StringTokenizer(book[i].toString()," , "); 
                 
                // to check whether there are any more tokens available or not 
                while(st.hasMoreTokens()) 
                { 
                    if (st.nextToken().equalsIgnoreCase("true")) 
                    { 
                        hardCount++; 
                    } 
                } 
            } 
        } 
        System.out.println("Number of books that has hardcover:" + hardCount); 
         
        // display the information about every hardcover book 
     System.out.print("\n");
        System.out.println("[BOOK(s) WITH HARDCOVER]");
        
            for (int i = 0; i < bookCnt; i++) 
            { 
                if (book[i] instanceof PhysicalBook) 
                { 
                        if (book[i].gethardcover()==true)
                        {
                        System.out.println(book[i].toString()); 
                        }
                    }   
                } 
            } 
        } 
    