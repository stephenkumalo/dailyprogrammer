import java.util.*;
import java.lang.*;
import java.io.*;

public class DateExample{

public static void main(String args[]){
Scanner keyboard = new Scanner(System.in),readFile = null;
System.out.print("Enter filename: ");
String val = keyboard.nextLine();
File file = new File(val);
try{
if(file.exists()){
readFile = new Scanner(file);
}
File output;
FileWriter fileWrite;
output = new File("output.txt");
try{
output.createNewFile();
fileWrite = new FileWriter(output);
DateCorrect date = new DateCorrect();

while(readFile.hasNextLine()){
fileWrite.write(date.parseDate(readFile.nextLine())+"\n");
}
fileWrite.flush();
fileWrite.close();
}catch(IOException w){
System.err.println("Cannot Write to file.");
w.printStackTrace();
}
}catch(FileNotFoundException e){
System.err.println("File Not Found.");
e.printStackTrace();
}


}
}
