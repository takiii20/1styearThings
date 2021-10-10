import java.util.*;

   public class DeterminNumbers1{
      public static void main (String[] args){
      
      Scanner con = new Scanner(System.in);
      
      int whole = 0;
      int fraction = 0;
      int zero = 0; 
      
      
      for ( int count = 1; count<=10; count++){
      
         System.out.print("Enter number [" + count + "]:");
         double number  = con.nextDouble();
         
         if (number < 0){
         
         }
         
         else if ( number == 0){
            zero = zero + 1;
         }
         
         else if (number > -1){
            double answer = number *2;
               if (answer%2 == 0){
                  whole = whole + 1;            
               }
               else if (answer != 0){
                  fraction = fraction + 1;}
         
         }
       }
         
         System.out.println("Whole Numbers:  " + whole);
         System.out.println("Number with fractional part: " + fraction);
         System.out.println("Zeroes: " + zero);
      
     }
     
   }