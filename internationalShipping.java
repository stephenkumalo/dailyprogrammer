import java.util.*;
import java.lang.*;
import java.io.*;

public class internationalShipping{
 public static void main(String args[]){
 Scanner keyboard = new Scanner(System.in) ;
System.out.print("Enter total volume needed: ");
int volume = keyboard.nextInt();
Sphere(volume);
Cube(volume);
Cone(volume);
Cylinder(volume);

}
public static void Sphere(int volume){
double radius = 0;
radius = Math.cbrt(volume/(1.33333*Math.PI));
System.out.print("radius of Sphere: " + radius+"\n");
}
public static void Cube(int volume){
double width,length,height;
width = Math.cbrt(volume);
length =Math.cbrt(volume);
height = Math.cbrt(volume);

System.out.print("The height of the cube should be: " + height+"\t");
System.out.print("The wight of the cube should be: "+ width+"\t");
System.out.print("The length of the cube should be: "+ length+"\n");
}
public static void Cylinder(int volume){
double height,radius;
height = Math.cbrt(volume/Math.PI);
radius = height;
System.out.print("The height of a cylinder should be: "+height+ "\t");
System.out.print("The radius of a cylinder should be: "+radius+ "\n");
}
public static void Cone(int volume){
double height,radius;
height = Math.cbrt((volume*3)/Math.PI);
radius = Math.cbrt((volume*3)/Math.PI);

System.out.print("The height of a cone should be: "+height+"\t");
System.out.print("The radius of a cone should be: "+radius+"\n");
}
}

