import java.util.*;
import java.io.*;
import java.lang.*;

public class BasicEquations{
  public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter Expression 1:");
    String equation1 = keyboard.nextLine();
    System.out.print("Enter Expression 2:");
    String equation2 = keyboard.nextLine();
    
    while(!(equation2.matches("y=[\\d]+x[\\+\\-][\\d]+") && equation1.matches("y=[\\d]+x[\\-\\+][\\d]+"))){
       System.out.print("Error:Enter Expression 1:");
       equation1 = keyboard.nextLine();
       System.out.print("Error:Enter Expression 2:");
       equation2 = keyboard.nextLine();
      }
    equation1 = equation1.replace("-"," -");
    equation2 = equation2.replace("-"," -");
  
    String equation[] = equation1.split("[=x+ ]+");
    String equations2[]  = equation2.split("[=x+ ]+");
    
    

    XY ep1 = new XY(Integer.parseInt(equation[1]),Integer.parseInt(equation[2]));
    XY ep2 = new XY(Integer.parseInt(equations2[1]),Integer.parseInt(equations2[2]));
    
    int x = 0,y =0;
    for(int index = -1000; index <= 1000; index++){
        int y1 = add(ep1.getX(),ep1.getY(),index);
        int y2 = add(ep2.getX(),ep2.getY(),index);
        
        if(y1 == y2){ 
            x = index;
            y = y1;
         }
       }
   System.out.println("(" + x+", "+y+")");

}
   public static int add(int x, int y,int count){
     return (x * count)+y;
      }

}

 class XY{
private int x;
private int y;

  public XY(int x,int y){
     this.x = x;
     this.y = y;
     }
  public XY(){
     this.x = 0;
     this.y = 0;
    }
  public int getX(){
     return this.x;
   }
  public int getY(){
     return this.y;
   }
  public void setX(int x){
     this.x = x;
   }
  public void setY(int y){
     this.y = y;
   }
}
