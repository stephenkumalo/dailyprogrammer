import java.util.*;
import java.io.*;
import java.lang.*;

public class WordCounting{
 static Map<String,Integer> map = new TreeMap<String,Integer>();

public static void main(String args[]){
System.out.print("Enter filename: ");
Scanner keyboard = new Scanner(System.in);
File file;
try{
file = new File(keyboard.nextLine());
  if(file.exists()){
  Scanner readfile = new Scanner(file);
   while(readfile.hasNextLine()){
     String line[] = readfile.nextLine().split("[ .!,?_-]+");
     for(String str : line){
     Integer val = map.get(str.toLowerCase());
     map.put(str.toLowerCase(),((val == null ) ? 1 : val+1));
    }
  }
 }
}catch(FileNotFoundException e){
 System.err.println("File cannot be found.");
 e.printStackTrace();
}
 System.out.println(map);
}
}
