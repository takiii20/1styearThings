import java.util.*;

public class SampleErrorTrapping3 {
   public static void main(String[] args){
      Scanner con = new Scanner(System.in);
      String number;
      boolean flag = false;
      
      while( !flag ){
         System.out.print("Enter number:");
         number = con.next();
         
         try {
            int num =  Integer.parseInt(number); //error might occur on this line
            System.out.println("Number entered: " + num);
            flag = true;
         }catch(Exception ex){
            System.out.println("Must be a numeric value... try again...");
         }
      }
      
   }
}