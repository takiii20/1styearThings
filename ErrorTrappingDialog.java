import java.util.*;
import javax.swing.*;

public class ErrorTrappingDialog {
   public static void main(String[] args){
      while(true){
         try {
            String price = JOptionPane.showInputDialog(null, "Enter the price of item:", "MyStore", JOptionPane.QUESTION_MESSAGE);
            if(price != null){
               double pricedouble = Double.parseDouble(price); //might cause an error            
               JOptionPane.showMessageDialog(null, "Price of the item:" + pricedouble, "MyStore - Tindahan Nako", JOptionPane.INFORMATION_MESSAGE);                        
            }
            break;            
         }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Sorry, invalid price entered. Numbers only. Please try again.", "MyStore - Tindahan Nako", JOptionPane.ERROR_MESSAGE);
         }
      
      }
   }
}