
import java.util.ArrayList;
import java.util.Calendar;
public class Flight {
    String flightID;
    String destination;
    int depTime;
    int arrTime;
    String seatType;
    int totalSeat;
    ArrayList<Integer> daysOfWeek;
    int extendsNextDay;
    Calendar effFrom;
    Calendar effTill;
       
    public Flight(String ID, String dest, int dTime, int aTime, String st, int ts, ArrayList<Integer> dow, int next){
        this.flightID = ID;
        this.destination = dest;
        this.depTime = dTime;
        this.arrTime = aTime;
        this.seatType = st;
        this.totalSeat = ts;
        this.daysOfWeek = dow;
        this.extendsNextDay=next;
        this.effFrom = Calendar.getInstance();
        this.effFrom.clear();
        this.effFrom.set(2022, 1, 1, 0, 0);
        this.effTill = Calendar.getInstance();
        this.effTill.clear();
        this.effTill.set(2022, 1, 31, 23, 59);
    }
}
    