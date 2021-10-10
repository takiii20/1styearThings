import java.util.*;

public class SampleErrorTrapping2 {
   public static void main(String[] args){
      boolean flag = false; //initially no errors encountered yet
      
      while( ! flag ){
         Scanner con = new Scanner(System.in);                  
         try {
            System.out.print("Enter number:");
            int num = con.nextInt();         
            System.out.println("Number entered is " + num);
            flag = true;
         }catch(Exception ex){         
            System.out.println("Hoy! Invalid input, number lagi...");     
         }      
      }


      
   }
}