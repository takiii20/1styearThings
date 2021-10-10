import java.util.*;

public class Act1{

   public static void main(String[] args){
   
    Scanner con = new Scanner (System.in);
    
      int mins,hours,seco, minutes,minutos,sec;
      
         System.out.print("Enter the number in hours: ");
         hours = con.nextInt();  
         
         System.out.print("Enter the number in hours: ");
         mins = con.nextInt();
         
         System.out.print("Enter the number in hours: ");
         sec = con.nextInt();
         
          
         minutes = hours * 60; 
         seco = sec / 60;
         minutos = minutes + mins + seco;
         
         System.out.println("THE TOTAL NUMBER IN MINUTES IS:" + minutos);
   }

}