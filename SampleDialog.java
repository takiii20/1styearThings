import java.util.*;
import javax.swing.*;

public class SampleDialog {
   public static void main(String[] args){
      String name = JOptionPane.showInputDialog
      (null, "Enter your name:", "Ila ila Ta", JOptionPane.QUESTION_MESSAGE);
      System.out.println("Hello " + name + "!");      
   }
}