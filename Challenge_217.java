import java.util.*;

public class Challenge_217{
   public static void main(String[] args){
   
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter the size of the array: ");
   int size = keyboard.nextInt();
   System.out.print("Enter the ammount of logs: ");
   int numberOfLogs = keyboard.nextInt();
   keyboard.nextLine();
   String[][] pilesOfLogs = new String[size][size];
   
   for(int i = 0; i < size; i++){
      System.out.print("Enter" + size + " values: ");
      String array = keyboard.nextLine();
     
      while((!array.matches("[0-9[ \t]]+")) | !(array.split("[ \t]+").length == size)){
          System.out.print("Only enter Numbers and white spaces, Try again: ");
          array = keyboard.nextLine();
        }
      pilesOfLogs[i] = (array.split("[ \t]+")).clone();
     }
   int counter = numberOfLogs,currentPileVal = 1;
    while(counter > 0){
    for(int indexForArray  = 0; indexForArray< size | (indexForArray < 0 & counter > 0) ; indexForArray++){
       for(int index = 0; index < size | (index < 0 & counter > 0) ; index++){ 
         if(counter > 0 & Integer.parseInt(pilesOfLogs[indexForArray][index].trim()) == currentPileVal){
           pilesOfLogs[indexForArray][index] =Integer.toString( Integer.parseInt(pilesOfLogs[indexForArray][index].trim()) + 1);
           counter--;
           }
       } }
    currentPileVal++;
     }
for(String [] array : pilesOfLogs){
   System.out.println(Arrays.toString(array)); }

            



}

}
