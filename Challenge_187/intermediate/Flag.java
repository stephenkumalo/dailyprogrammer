import java.util.*;
import java.lang.*;
import java.io.*;

public class Flag{
private boolean output;
private Map<String,String> shortform;
private String flag;
publc Flag(String flag,String cmd){
  if(flag.charAt(0) == '*'){
     this.output = true;
     }
  else{
  this.output = false;
  }
  this.shortform = new HashMap<String,String>();
  this.shortform.put(flag.replace("*",""),cmd);
  this.flag = flag.replace("*","");
}
public String getCmd(){
  return this.shortform.get(this.flag);
}
public void setOutput(boolean output){
  this.output = true;
}
public boolean getOutput(boolean output){
  return this.output;
}

}
