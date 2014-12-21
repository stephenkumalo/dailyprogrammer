import java.util.*;
import java.io.*;

public class acronymExpander{
public static void main(String args[]){
Dictionary  diction = new Dictionary();
Scanner keyboard = new Scanner(System.in);
System.out.print("Chat: ");
System.out.print(diction.expand(keyboard.nextLine()));
}

}

