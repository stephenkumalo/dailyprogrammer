import java.util.*;
import java.io.*;

public class WordsWithEnemies{
  public static void main(String args[]){
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter two words here: ");
       String str[] = keyboard.nextLine().split("[ ]+");
       String left= new String(str[0]),right = new String(str[1]);
       int leftside=count(enemies(right,left)),rightside= count(enemies(left,right));
       if(rightside < leftside){
           System.out.println("left word wins: "+leftside+"-"+rightside);
           }
       else if(rightside==leftside){
	   System.out.println("both words tie: "+leftside+"-"+rightside);
	  }
       else{
            System.out.println("right word wins: "+rightside+"-"+leftside);
        }
}
public static String[] enemies(String str1, String str2){
	String temp[] = str2.trim().split("");
	for(String val : str1.trim().split("")){
	    for(int index = 0; index < temp.length ; index++){
		if(val.equals(temp[index])){
		  temp[index] = "";
		  break;}
	}
}
 return temp;
}
public static int count(String str[]){
int count = 0;
 for(int index = 0; index < str.length; index++){
	if(!str[index].equals("")){
	    count++;
	}
} return count;
}

}
