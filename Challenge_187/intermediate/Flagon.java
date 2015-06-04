  import java.util.*;
  import java.lang.*;
  import java.io.*;
/*This is even more convenient for a terminal operator to enter. 
Today, you will write a program which will accept a string of flags in the above formats and output which flags were activated.
*/
  public class FlagOutput{

  public static void main(String args[]){
  Map<String,Flag> flags = new HashMap<String,Flag>();
  Scanner keyboard = new Scanner(System.in),keyboard1 = new Scanner(System.in);
  System.out.print("Enter the # of flags inputted:");
  int val = keyboard.nextInt();
  keyboard.nextLine();
    for(int i = 0; i < val; i++){
      System.out.print("Enter flag #"+(i+1)+": ");
      String str[] =keyboard1.next().trim().split("[:]+");
      boolean esc = false;
      while(esc == false){ 
   
          if(str.length == 2){
              flags.put(str[0].replace("*",""),(new Flag(str[0],str[1])));
              esc = true;
              }
          else{
              System.out.print("Error:Enter flag #"+(i+1)+": ");
              str = keyboard1.next().trim().split("[:]+");
              }
      }
  }

  System.out.print("Enter cmd flags: ");
  String str = keyboard.nextLine();
  String str1[] = str.split(" ");
  for(int i = 0; i < str1.length; i++){
  
    if(str1[i].charAt(0) == '-' && str1[i].charAt(1) != '-'){
        String welp[] = str1[i].replace("-","").split("");
        
          for(String s : welp){
            System.out.println("flag: " + flags.get(s.trim()));
               }
          }
    else if(str1[i].trim().charAt(0) != '-'){
       System.out.println("parameter: " + str1[i]);
       }
    else if(str1[i].length() > 2 && str1[i].substring(0,2).equals("--")){
        System.out.println("flag: "+ str1[i].substring(2));
            }
      }
  }
}


