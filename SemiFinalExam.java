import java.util.*;

public class SemiFinalExam {
   public static void main(String[] args){
   
   Scanner con = new Scanner (System.in);
   
   //1
   System.out.print("Enter your lastname: ");
   String lastname = con.next().toLowerCase();
   System.out.print("Enter your firstname: ");
   String firstname = con.next().toLowerCase();
   System.out.print("Enter your middle initial: ");
   String middlename = con.next();
   System.out.println("Your name is: " + formatName( lastname, firstname, middlename));
   
   //2
   
  System.out.print("\nEnter a String With Special Characters: ");
  String data = con.next();
  System.out.println("The repeated symbol is: " + extractUniqueSpecialCharacters(data));

  
  //3
  System.out.print("\nEnter a email: ");
  String email = con.next();
  System.out.println("The email is: " + isEmailValid(email));

     //call and test your methods here
     //provide inputs as arguments to your methods   
   }
   
   /*Create your own method that returns the complete name in this
      format:
      
      Sample parameter or input: 
         lastname:  PaTiNo
         firstname: jOaQUIn
         mi       : sArNo
         
      result or return value: Joaquin S. Patino
      NOTE:       there must be a period after the middle initial
      Error TRAP: lastname and firstname and middle name MUST NOT
                  CONTAIN any number, even at least 1 number.
                  If the user does not follow the error trap rule,
                  return an empty string.
         
   */
   public static String formatName(String lastname, String firstname, String middlename){
      String formattedName = "";
      
      int countfirstname = firstname.length();
      int countlastname = lastname.length();
      
      char firstnameLetterCapital = firstname.toUpperCase().charAt(0); 
      char lastnameLetterCapital = lastname.toUpperCase().charAt(0); 
      char finalmiddlename = middlename.toUpperCase().charAt(0);
      
      String finalfirstname = firstnameLetterCapital + firstname.substring(1,countfirstname);
      String finallastname = lastnameLetterCapital + lastname.substring(1,countlastname );

      
      formattedName = finalfirstname + " " + finalmiddlename + ". " + finallastname;
      return formattedName;
   }
   
   
   
   
   /*
      Create a method or function that accepts a string as paramter
      and extract or collect all special characters in that string
      WITHOUT DUPLICATES OR REPEATING VALUES.
      
      Example parameter:      123abc@#...#131#^^..
      Sample return value:    @#.^
   */
   public static String extractUniqueSpecialCharacters(String data){
      String result = "";
      
      for (int count = 0; count < data.length()-1; count++){
      char temp = data.charAt(count);
      
         if(  !Character.isDigit(temp) && ! Character.isLetter(temp) ){
            if (result.indexOf(temp) == -1 ){
               result = result  + temp;      
            }

         }


      
      }//for
      
      return result;
   }




   /*
      Create a method or function that accepts a string as the email
      and check if the email is valid or not.
    
      A valid email must have ONLY 1 @ AND ONLY 1 .(PERIOD)
      
      Sample parameter: ken@gmail.com
      return value:  true
      
      Sample parameter: ken@gmailcom
      return value:  false (no period)
      
      Sample parameter: ken@@@gmail.com
      return value: false (too many @)
      
      Sample parameter: kengmail...com
      return value: false (too many .(period) and no @)
   */   
   public static boolean isEmailValid(String email){
      boolean emailValid = false;
      int symbol1 = 0;
      int symbol2 = 0;
      
      for(int count = 0; count < email.length(); count++){
      char temp = email.charAt(count);
      
      if (temp == '@'){
         symbol1 = symbol1 + 1;
      }
      
      if (temp == '.'){
         symbol2 = symbol2 + 1;
      }
      
      
      }//for
      
      
      if (symbol1 > 1 && symbol2 > 1){
      emailValid = false;
      }
     /* if (symbol2 > 1){
      emailValid = false;
      }*/
      
      if (symbol1 == 1 && symbol2 == 1){
      emailValid = true;
      
      }
      
      
      return emailValid;
   }
}