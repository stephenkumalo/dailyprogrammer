import java.util.*;
import java.lang.*;

public class DateCorrect{
Map <String,String> months = new HashMap<String,String>();

public DateCorrect(){
months.put("jan","01");
months.put("feb","02");
months.put("mar","03");
months.put("apr","04");
months.put("may","05");
months.put("jun","06");
months.put("jul","07");
months.put("aug","08");
months.put("sep","09");
months.put("oct","10");
months.put("nov","11");
months.put("dec","12");

}
public String parseDate(String str){
String splitter[]  = str.trim().split("[ /#*,]+");
String val = "";
if(splitter.length < 3){
return reverse(str);}
try{
 if(months.get(splitter[0].toLowerCase()) != null){
 val= months.get(splitter[0].toLowerCase())+"-"+splitter[1]+"-"+splitter[2].substring(splitter[2].length()-2);
}
else{
	if(Integer.parseInt(splitter[1].trim()) > Integer.parseInt(splitter[0].trim()) ){
		val = splitter[0]+"-"+splitter[1]+"-"+splitter[2].substring(splitter[2].length()-2);
	}
	else{
		val = splitter[1]+"-"+splitter[0]+"-"+splitter[2].substring(splitter[2].length()-2);
	}
}

}catch(Exception e){
 System.err.println("Array Out of Bounds.");
e.printStackTrace();
}
return val;
}
public String reverse(String str){
String splitter[] = str.trim().split("[- ]+");
if(Integer.parseInt(splitter[1].trim()) > Integer.parseInt(splitter[2].trim()) ){
return splitter[2]+"-"+splitter[1]+"-"+splitter[0].substring(splitter[0].length()-2);
}
else{
	return splitter[1]+"-"+splitter[2]+"-"+splitter[0].substring(splitter[0].length()-2);	
}
 
}
}
