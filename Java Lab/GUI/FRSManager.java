
import java.util.*;
public class FRSManager {
    /**
     * Declarations
     */
    public DataManager dataManager;
    //public SearchManager searchManager;
    //public BookingManager bookingManager;
    //public DisplayManager displayManager;
    
    public ArrayList<Flight> flightData;
    public ArrayList<Booking> bookingData;
    
    /**
     * Main loop
     * @param args File names 
     */
    public static void main(String[] args){
        FRSManager manager = new FRSManager();
        manager.readPreliminary(manager);
        
    }
    /**
     * Reads the spiceFile and silkAir file. 
     * @param manager Instance of FRSManager.
     * @param args - File Name.
     */
    public void readPreliminary(FRSManager manager){
        manager.dataManager = new DataManager(manager);
        manager.dataManager.readFirst();
        manager.bookingData = manager.dataManager.readBooking("Booking.csv");
        manager.flightData = manager.dataManager.readFlight("flight.csv"); 
         
    }
    /**
     * Show Input Screen
     * @param manager - Link to FRSManager
     
    public void initializeOthers(FRSManager manager){
        FlightSegment = new ArrayList<>();
        
        manager.displayManager = new DisplayManager(manager);
        manager.searchManager = new SearchManager(manager);
        manager.bookingManager = new BookingManager(manager);
        
        manager.displayManager.showInputScreen();
    }*/
}
