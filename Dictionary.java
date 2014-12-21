import java.util.*;
import java.lang.*;
import java.io.*;

public class Dictionary{
protected Map<String ,String> dictionary;
public Dictionary(){
try{
 dictionary = new HashMap<String , String>();
}catch(Exception e){
System.err.println("Cannot create Hashmap.");
e.printStackTrace();
}
dictionary.put("lol","Laugh out loud");
dictionary.put("dw", "Dont worry");
dictionary.put("hf", "Have fun");
dictionary.put("gg","Good game");
dictionary.put("brb","Be right back");
dictionary.put("g2g", "Got to go");
dictionary.put("wtf","What the fuck");
dictionary.put("wp","Well played");
dictionary.put("gl","Good luck");
dictionary.put("imo", "In my opinion");
}
public void add(String key,String value){
 this.dictionary.put(key,value);
}
private String find(Object key){
return this.dictionary.get( key);
}
public String expand(String str){
String str1 = "";
String splitter[] = str.trim().split(" ");
for(String val : splitter){
 if(val.equals(" ")){
}
else if(dictionary.containsKey(val)){
 str1+=find(val)+" ";
 str1.concat(" ");
System.out.println(find(val));
}
else{
 str1 += val+" ";
}
}
return str1;
}

}
