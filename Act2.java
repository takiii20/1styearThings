import java.util.*;                       //PARA SA ONE-WAY SELECTION//

public class Act2
{ 
   public static void main(String[] args)
   {
   
      Scanner con = new Scanner (System.in); 
         
         char sex;
         
         System.out.print("What is your sex? ");
         sex = con.next().toUpperCase().charAt(0);
         
        if (sex=='M'){
         System.out.println("You are a MALE.");
        }
        else if(sex =='F'){
         System.out.println("You are a Female");
        }
        else{
         System.out.println("Invalid!"); 
        }
         System.out.println(sex);
   } 
}