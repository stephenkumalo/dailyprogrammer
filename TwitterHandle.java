import java.util.*;
import java.lang.*;
import java.io.*;

public class TwitterHandle{

  public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the path leading to the file: ");
    File file = new File(keyboard.nextLine());
    Map <Integer,String> handleSize = new TreeMap<Integer,String>();
    Map <String,String> handles = new HashMap<String,String>();
    try{
        Scanner fileNext = new Scanner(file); 
        while(fileNext.hasNextLine()){
           String str = fileNext.nextLine();
           if(str.trim().length() > 1 && str.trim().substring(0,2).equalsIgnoreCase("at")){
              handleSize.put(str.trim().replace("at","@").length(),str.trim().replace("at","@"));
              }
          

           }
        }catch(FileNotFoundException e){
          System.err.println("Cannot open my file.");
        }
        int index = 1;
        Set mapset = handleSize.entrySet();
        System.out.println(mapset);
/*
        for(Map.Entry<String,Integer> entry : handleSize){
          if(index++ <= 10){
            System.out.println(entry.getKey().replace("@","at") + ": "+entry.getKey());
             }
          }*/     
}
}
           
     
