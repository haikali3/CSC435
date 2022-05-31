import java.io.*;
import java.util.Scanner;
 
class Question1 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Input: ");
        String str = s.nextLine();  //input new word 
        String nostr=""; //empty string
        char chr;    // declare character to extract character in string
       
      
       
      for (int i=0; i<str.length(); i++)
      {
        chr= str.charAt(i); //extract each character
        nostr= chr+nostr; //adds each character in front  of the string
      }
      System.out.println("\nReversed word in upper case: "+ nostr.toUpperCase());
    }
}
 