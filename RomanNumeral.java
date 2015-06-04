import java.util.*;
import java.lang.*;
import java.io.*;

//Intermediate Challenge 189: Roman Numeral Challenge
/*Creating a program that converts Roman Numerals to a decimal number
(base 10) and vice versa.Make sure that you only accept decimal number 
and Roman Numeric Values */

public class RomanNumeral{
static int numeric = 0;

public static void main(String args[]){
Scanner keyboard = new Scanner(System.in);

System.out.print("Enter Roman Numeral/Numerical Value: ");
String val = keyboard.nextLine();
if(val.matches("[0-9&&[^a-z[^A-Z]]]+")){
  System.out.println(val+" = "+convertToRoman(Integer.parseInt(val)));
}
else if(val.matches("[mdclxviIVXLCDM]+")){
 convertToNumeric(val,val.length());
 System.out.println( val+ " equals: " + numeric);
}


}
public static String convertToRoman(int val){
String str = "";
if(val == 0){
 return str;
}
else if((val-1000) > 0){
 str += "M"+convertToRoman(val-1000);
}
else if((val-500) >= 0){
 str += "D"+convertToRoman(val-500);
}
else if((val-100) >= 0){
 str += "C"+convertToRoman(val-100);
}
else if((val-50) >= 0){
 str += "L"+convertToRoman(val-50);
}
else if((val-10) >=0){
 str += "X"+convertToRoman(val-10);
}
else if((val-5) >= 0){
 str += "V"+ convertToRoman(val-5);
}
else if((val-1) >= 0){
  str += "I"+convertToRoman(val-1);
}
 return str;
}
public static void convertToNumeric(String str,int size){
if(size == 0){
 return ;
}
else if(str.substring(0,1).equalsIgnoreCase("M")){
  numeric += 1000;
  convertToNumeric(str.substring(1),size-1);
}
else if(str.substring(0,1).equalsIgnoreCase("D")){
  numeric += 500;
  convertToNumeric(str.substring(1),size-1);
}
else if(str.substring(0,1).equalsIgnoreCase("C")){
   numeric += 100;
   convertToNumeric(str.substring(1), size-1);
}
else if(str.substring(0,1).equalsIgnoreCase("L")){
   numeric += 50;
   convertToNumeric(str.substring(1),size-1);
}
else if(str.substring(0,1).equalsIgnoreCase("X")){
    numeric += 10;
    convertToNumeric(str.substring(1),size-1);
}
else if(str.substring(0,1).equalsIgnoreCase("V")){
    numeric += 5;
    convertToNumeric(str.substring(1),size-1);
}
else if(str.substring(0,1).equalsIgnoreCase("I")){
    numeric += 1;
    convertToNumeric(str.substring(1),size-1);
}

}


} 
