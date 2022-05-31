import java.util.StringTokenizer;
import java.util.*; 
import java.io.*; 
public class Vac
{
    public static void main(String[] args) throws IOException
    {
        File fileIn = new File ("vaccination.txt");
        File fileOut1 = new File ("comobid.txt");
        File fileOut2 = new File ("non_comobid.txt");
        String vaccCenter, icNum, Category, vaccineType;
        int Dose;
        try
        {
            Scanner ct = new Scanner(fileIn);
            PrintWriter fout1 = new PrintWriter (fileOut1);
            PrintWriter fout2 = new PrintWriter (fileOut2);
            System.out.println("Selangorean and 3 dos\n=====================");
            
            String indata = null;
            
            
            fout1.println("List of Comorbid\n");
            fout1.println("VaccinationCentre   Ic Number    Vaccine    Type   Dose");
            fout1.println("======================================================================");
            
            fout2.println("List of non-comorbid\n");
            fout2.println("VaccinationCentre    Ic Number   Vaccine   Type    Dose");
            fout2.println("======================================================================");
            while(ct.hasNext()){
                indata = ct.nextLine();
                StringTokenizer st = new StringTokenizer (indata, ":");
                vaccCenter = st.nextToken();
                icNum=st.nextToken();
                Category = st.nextToken();
                vaccineType = st.nextToken();
                Dose = Integer.parseInt(st.nextToken());
                
                String state = icNum.substring(6,7);
                int listnum = 1;
                if (state.equalsIgnoreCase("10")&& Dose == 3)
                {
                    System.out.println(listnum+".");
                    System.out.println("Vaccination Centre :"+ vaccCenter);
                    System.out.println("IC number :"+ icNum);
                    System.out.println("Category :"+ Category);
                    System.out.println("Vaccination Type :"+ vaccineType);
                    System.out.println("Dosage :"+ Dose);
                }
                

                if (Category.equalsIgnoreCase("comorbid"))
                {
                    fout1.println(vaccCenter+"\t"+icNum+"\t"+vaccineType+"\t"+Dose);
                }
                else
                {
                    fout2.println(vaccCenter+"\t"+icNum+"\t"+vaccineType+"\t"+Dose);
                }
            }
            
            fout1.close();
            fout2.close();        
                
        }

        catch(FileNotFoundException finofex){
            System.out.println("File is missing");
          }
           
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
          }
   
        catch(Exception exec){
            System.out.println(exec.getMessage());
          }
      
                
    } // main 
} // class