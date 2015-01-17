import java.util.*;
import java.io.*;

public class DeStringification{
   public static void main(String args[]){
     System.out.print("Enter String: ");
     Scanner keyboard = new Scanner(System.in);
     checkStringify(keyboard.nextLine().toString());
   }
   public static void checkStringify(String str){
    String stringify = new String(str);
        
    boolean notstr = stringify.matches("\\[a-z&&[^btn\'\"\\]]");
    if(notstr){
         System.out.println("Invalid String");}
    else{ 
        replace(stringify);
      	 }

}
    public static void replace(String str){
          String string[] = str.trim().split("");
	  for(int index = 0; index < string.length; index++){
             if(string[index].equals("\\") && index+1 < string.length){
                  if((string[index] + string[index+1]).equals("\\n")){
   			System.out.print("\n");
 			index++;
                       }
		  else if((string[index] + string[index+1]).equals("\\t")){
			System.out.print("\t");
			index++;
			}
		  else if((string[index]+string[index+1]).equals("\\b")){
			System.out.print("\b");
		         index++;
		      }
		  else if((string[index]+string[index+1]).equals("\\\'")){
   		        System.out.print("\'");
			index++;
			}
		  else if((string[index]+string[index+1]).equals("\\\"")){
 			System.out.print("\"");
			index++;
  			}
 		  else if((string[index]+string[index+1]).equals("\\\\")){
 			System.out.print("\\");
			index++;
			}
                   }
 	     else{ 
 		 System.out.print(string[index]);
                  }
              }
       }
}
