import java.util.*;

public class SampleErrorTrapping {
   public static void main(String[] args){
      Scanner con = new Scanner(System.in);
      
      try  {
         System.out.print("Enter any number:");
         int number = con.nextInt(); 
         
         System.out.println("Number inputted: " + number);        
      }
      catch(Exception exvariable){
         System.out.println("Hoy! Tanga ha");
         System.out.println("Reason of error: " + exvariable.toString());         
      }
      

      

      
   }
}