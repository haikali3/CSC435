
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DataManager {
    FRSManager mgr;
    /**
     * Constructor for DataManager
     * @param frs link to FRSManager
     */
    public DataManager(FRSManager frs){
        this.mgr = frs;
    }
    

   public ArrayList<Flight> readFlight(String FlightFile){
        BufferedReader br = null;
        String line;
        ArrayList<Flight> intFlight = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(FlightFile));
            for(int i=0;i<1;i++) 
                line = br.readLine();
        
            while((line = br.readLine())!=null){
                StringTokenizer st = new StringTokenizer(line, ",");
                String flightID = st.nextToken();
                String dest = st.nextToken();
                
                String temp = st.nextToken();
                
                int hour = Integer.parseInt(temp.substring(0,2));
                int min = Integer.parseInt(temp.substring(2,4));
                int depTime = hour*60 + min;
                
                String temp2 = st.nextToken();
                hour = Integer.parseInt(temp2.substring(0,2));
                min = Integer.parseInt(temp2.substring(2,4));
                int arrTime = hour*60 + min;
                
                String seatType = st.nextToken();
                int totalSeat = Integer.parseInt(st.nextToken());
                
                
                String days = st.nextToken();
                StringTokenizer daysST= new StringTokenizer(days, ",");
                ArrayList<Integer> frequency = new ArrayList<>();
                while(daysST.hasMoreTokens())
                    frequency.add(DataManager.getDay(daysST.nextToken().toUpperCase().trim()));
                                                   
                int nextDay;
                if(temp.length()>5) nextDay=1;
                else nextDay=0;
                
                System.out.println( dest + " " + days + " "+ flightID + " "+ seatType + " "+ totalSeat + " " +  depTime + " " + arrTime + " " + nextDay);
                Flight tempFlight = new Flight(flightID, dest, depTime, arrTime, seatType , totalSeat,  frequency, nextDay);
                intFlight.add(tempFlight);
            }
        } catch(FileNotFoundException ex){
            System.out.println("File Not Found!, " + ex);
        } catch(IOException ex) {
            System.out.println("There was some problem in IO, on reading flight files. " + ex);
        } finally {
            if(br!=null) try {
                br.close();
            } catch (IOException ex) {
               System.out.println("Problem in closing Buffer Reader");
            }
            return intFlight;
        }
    }
      
    public ArrayList<Booking> readBooking(String bookingFile){
        BufferedReader br = null;
        String line;
        ArrayList<Booking> intBooking = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(bookingFile));
            for(int i=0;i<1;i++) 
                line = br.readLine();
        
            while((line = br.readLine())!=null){
                StringTokenizer st = new StringTokenizer(line, ",");
                String bookID = st.nextToken();
                String flightID = st.nextToken();
                String flightDate = st.nextToken();
                
                String temp = st.nextToken();
                
                int hour = Integer.parseInt(temp.substring(0,2));
                int min = Integer.parseInt(temp.substring(2,4));
                int depTime = hour*60 + min;
                
                String temp2 = st.nextToken();
                hour = Integer.parseInt(temp2.substring(0,2));
                min = Integer.parseInt(temp2.substring(2,4));
                int arrTime = hour*60 + min;
                
                String seatType = st.nextToken();
                String seatNo = st.nextToken();
                String custName = st.nextToken();
                String custID = st.nextToken();
                String custNoPhone = st.nextToken();
                
                System.out.println( bookID + " " + flightID + " "+ flightDate + " "+ depTime + " " + arrTime + " " + seatType + " " + seatNo + " " + custName + " " + custID + " " + custNoPhone);
                Booking tempBooking = new Booking(bookID, flightID, flightDate, depTime, arrTime, seatType , seatNo,  custName, custID, custNoPhone);
                intBooking.add(tempBooking);
            }
        } catch(FileNotFoundException ex){
            System.out.println("File Not Found!, " + ex);
        } catch(IOException ex) {
            System.out.println("There was some problem in IO, on reading booking files. " + ex);
        } finally {
            if(br!=null) try {
                br.close();
            } catch (IOException ex) {
               System.out.println("Problem in closing Buffer Reader");
            }
            return intBooking;
        }
    }
    
    public void readFirst(){
        BufferedReader br = null;
        BufferedWriter bw = null;
       try{
            br = new BufferedReader(new FileReader("Booking.csv"));     
            bw = new BufferedWriter(new FileWriter("Booking.csv", true));
            if (br.readLine() == null) {
                    //write header
                } 
            } catch(FileNotFoundException ex){
                System.out.println("Booking.csv not found");
            } catch(IOException ex){
                System.out.println("IO Error in writing first line in Booking" + ex);
            } finally{
                try {
                if(br!=null) br.close();     
                if(bw!=null) bw.close();
                } catch (IOException ex) {
                      System.out.println("Problem in closing Buffer Reader");
                }
            }
   }
    
    
   /*
    * The method returns an Integer for the day of a week.
    * @param s First 3 letters of day of a week
    * @return Integer - 1 for SUN, 2 for MON and so on.
    */
   public static int getDay(String s){
       int day=0;
       switch(s){
           case "SUN": day=1;break;
           case "MON": day=2;break;
           case "TUE": day=3;break;
           case "WED": day=4;break;
           case "THU": day=5;break;
           case "FRI": day=6;break;
           case "SAT": day=7;break;
       }
       return day;
   }
   /**
    * The method returns integer for month you pass.
    * @param mon first three letters of month
    * @return Integer for a month - 0 for Jan, 1 for Feb and so on
    */
   public static int getMonth(String mon){
        int month=0;
        switch(mon){
            case "JAN": month=0; break;
            case "FEB": month=1; break;
            case "MAR": month=2; break;
            case "APR": month=3; break;
            case "MAY": month=4; break;
            case "JUN": month=5; break;
            case "JUL": month=6; break;
            case "AUG": month=7; break;
            case "SEP": month=8; break;
            case "OCT": month=9; break;
            case "NOV": month=10; break;
            case "DEC": month=11; break;
        }
        return month;
    }
}