
public class Photocopy
{
    private String lectName, staffID,facCode, assType ;
    private int masterNum , copiesNum ;
    
    
    public Photocopy()
    {
        lectName  = "";
        staffID = "";
        facCode = "";
        assType = "";
        masterNum  = 0;
        copiesNum  = 0;
    }
    
    
    public Photocopy(String nm, String sid, String fac, String at, int mn, int cn)
    {
        lectName  = nm;
        staffID = sid;
        facCode = fac;
        assType = at;
        masterNum  = mn;
        copiesNum  = cn;
    }
    
    public void setPhotocopy(String nm, String sid, String fac, String at, int mn, int cn)
    {
        lectName  = nm;
        staffID = sid;
        facCode = fac;
        assType = at;
        masterNum  = mn;
        copiesNum  = cn;
    }
    public String getLectName()
    {
        return lectName;
    }
    
    public String getStaffID()
    {
        return staffID;
    }
    
    public String getFacCode()
    {
        return facCode;
    }
    
    public String getAssType()
    {
        return assType;
    }
    
    public int getMasterNum()
    {
        return masterNum;
    }
    
    public int getCopiesNum()
    {
        return copiesNum;
    }
    
    public double calPayment()
    {
        int numPage = masterNum * copiesNum;
        double pagePrice;
        if(numPage < 100){
            pagePrice = 0.10;
        }
        else if (numPage < 200){
            pagePrice = 0.08;
        }
        else if (numPage < 500){
            pagePrice = 0.05;
        }
        else {
            pagePrice = 0.03;
        }
        double totalPay = pagePrice * numPage;
        
        return totalPay;
    }
    
     public String toString()
         {     return  "lectName     :   " + getLectName() +"\n"+
                       "staffID      :   " + getStaffID()+"\n"+
                       "facCode      :   " + getFacCode()+"\n"+
                       "assType      :   " + getAssType()+"\n"+
                       "masterNum     :   " + getMasterNum()+"\n"+
                       "copiesNum     :   " + getCopiesNum ()+"\n"+
                       "Total Payment :RM " + calPayment();
         }
}
