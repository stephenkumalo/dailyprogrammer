import java.util.*;
import java.io.*;

public class IsbnValid{

static String isbn = "";
protected static boolean isValid(String sbn){
  isbn = sbn.trim().replaceAll("[- ]+","");
  if(isbn.length() != 10){
	System.out.println("Error:Isbn length not valid.");
	return false;
       }
  int valid = 0;
  String str[] = isbn.split("");
  for(int i = 0; i < str.length; i++){
     if(str[i].equalsIgnoreCase("X")) { valid += 10 * (str.length-i);
        }
      else{ valid += Integer.parseInt(str[i]) *(str.length-i);
        }
   }
      System.out.println(valid);
      return (valid > 0) ? (valid%11) == 0 : false;
}

public static void main(String args[]){
  System.out.print("Enter ISBN: ");
  Scanner keyboard = new Scanner(System.in);
  String val = keyboard.nextLine();
  System.out.println("Isbn "+val+" validation: " + isValid(val));
}

}
