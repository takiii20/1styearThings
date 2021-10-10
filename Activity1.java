import java.util.*;

public class Activity1
{

   public static void main(String[] args)
   {
   
          Scanner con = new Scanner (System.in);
    
         int num, hundredThousands, tenThousands, thousands, hundreds, tens, ones;
      
            System.out.print("Enter 6-digit number: ");
            num = con.nextInt();
         
           hundredThousands = num / 100000;
           tenThousands = (num % 100000)/10000;
           thousands = (num % 10000) / 1000;
           hundreds = (num % 1000) / 100;
           tens=(num%100)/10;
           ones=num % 10;
      
         System.out.println("The result is:"  + tenThousands + hundreds + ones);
            
   }

}