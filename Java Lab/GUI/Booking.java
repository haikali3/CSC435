import java.util.ArrayList;
import java.util.Calendar;
public class Booking {
    String bookID;
    String flightID;
    String flightDate;
    int depTime;
    int arrTime;
    String seatType;
    String seatNo;
    String custName;
    String custID;
    String custNoPhone;
    Calendar effFrom;
    Calendar effTill;
       
    public Booking(String bID, String ID, String date, int dTime, int aTime, String st, String sn, String cn, String cid, String cnp){
        this.bookID = bID;
        this.flightID = ID;
        this.flightDate = date;
        this.depTime = dTime;
        this.arrTime = aTime;
        this.seatType = st;
        this.seatNo = sn;
        this.custName = cn;
        this.custID = cid;
        this.custNoPhone = cnp;
    }
}
