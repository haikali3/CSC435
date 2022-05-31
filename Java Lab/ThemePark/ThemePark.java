public class ThemePark
{
    String name; 	//customer's name
    String idNo; 	//customer's id; begins with alphabet and 
				//follows by numbers; the first ID with
				//alphabet X is for non-Malaysian; others
				//are referred to Malaysian
    String category; //wild life, water park or night safari
    boolean isChild; //child or adult
    boolean member;	//member or nonmember
    
    public ThemePark(){
        name = "";
        idNo = "";
        category = "";
        isChild = false;
        member = false;}
    public ThemePark(String n, String id,String cat,boolean ch, boolean mem)
    {
        name = n;
        idNo = id;
        category = cat;
        isChild = ch;
        member = mem;}
    public void setThemePark(String n, String id,String cat,boolean ch, boolean mem)
    {
        name = n;
        idNo = id;
        category = cat;
        isChild = ch;
        member = mem;}
    public String getName(){
        return name;
    }
    public String getID(){
        return idNo;
    }
    public String getCategory(){
        return category;
    }
    public boolean getChild(){
        return isChild;
    }
    public boolean getMember(){
        return member;
    }
    public String toString(){
        return  "Customer Name     :   " + getName()
	    +"\nCustomer ID      :   " + getID()
	    + "\nCategory Theme Park    :   " + getCategory()
	    + "\nChild     :   " + getChild()
	    + "\nmember  : " + getMember() ;
	  }
    public double calCharges()
    {
	double charge = 0.00;
	if (getCategory().equalsIgnoreCase("water park")){
		charge = 40.00;}
	else if (getCategory().equalsIgnoreCase("wild life")){
		charge = 35.00;}
	else if (getCategory().equalsIgnoreCase("night safari")){
		charge = 15.00;}

	if (getChild()){
		charge = charge * 0.5;}
	if (getMember()){
        	charge = charge * 0.8;}
	if (getID().charAt(0) == 'X'){
		charge  += 20.0;}
	return charge;
    }

}