import java.util.*;
import javax.swing.*;

public class SampleDialogErrorTrapping {
   public static void main(String[] args){
      String price;
      boolean flag = false;   
   
      while( !flag ){
         price = JOptionPane.showInputDialog(null, "Enter price of the item:", "My Tindahan", JOptionPane.QUESTION_MESSAGE);
         
         try {
            double pricevalue = Double.parseDouble(price);
            System.out.println("Price of the item: " + pricevalue);
            flag = true;            
         }
         catch(Exception ex){
            System.out.println("Price invalid. Must be a number.");
         }
      }
   
      
           
   }
}