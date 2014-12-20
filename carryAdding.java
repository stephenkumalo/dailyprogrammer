import java.util.*;
import java.io.*;
import java.lang.*;

public class carryAdding{

static List<Integer> carry = new ArrayList<Integer>();

public static void main(String[] argslist){
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter addtion problem: ");
String addProblem = keyboard.next();
String addProb[]  = addProblem.split("\\+");
int sum = computeSum(addProb);
processArgs(addProb);
format(addProb,sum);
}
public static int computeSum(String arg[]){
int sum = 0;
for(String args : arg){
sum+= Integer.parseInt(args);
}
return sum;
}
public static void processArgs(String[] args){
int max = max(args),sumVal = 0,prevVal = 0,size = size(args);
for(int i = 0; i < max; i++){
String arg;
for(int j =0; j <size; j++){ 
 if((args[j].trim().length()-1-i) >=0 ){
   sumVal += Character.getNumericValue(args[j].charAt((args[j].trim().length()-1)-i));
}
 
} sumVal = sumVal+prevVal;
if(sumVal >= 10 && sumVal < 100 && i != max-1){
  carry.add(Character.getNumericValue(Integer.toString(sumVal).charAt(0)));
  prevVal = Character.getNumericValue(Integer.toString(sumVal).charAt(0));
}
else{ 
carry.add(0);
prevVal = 0;
}
sumVal = 0;
}
}
public static int max(String[] args){
int max = 0;
for(String arg : args){
  max = Math.max(max,arg.trim().length());
}
return max;
}
public static int size(String[] args){
int count = 0;
for(String arg : args){
 count++;}
return count;
}
public static void format(String args[],int val){
for(String arg : args){
System.out.println(arg.trim());
}
int max = max(args),size =size(args);
for(int i = 0; i< max; i++){
System.out.print("-");
}
System.out.println();
System.out.println(val);
for(int i = 0 ;i < carry.size(); i++){
System.out.print("-");
}
System.out.println();
int arrays[] = reverse(carry);
for(int i = 0; i < carry.size(); i++){
if(arrays[i] !=0){System.out.print(arrays[i]);
}else{
System.out.print(" ");
}
}
System.out.println();
}
public static int[] reverse(List<Integer> val){
int var[] = new int[val.size()];
for(int i=0;i < val.size(); i++){
var[i] = val.get(i);}
return var;
}
}

