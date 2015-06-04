import java.util.*;
import java.io.*;

public class EasterChallenge{
   public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    String y = keyboard.nextLine();
    while(!y.matches("\\d{4}")){
       System.out.print("Invalid Year.Try Again: ");
        y = keyboard.nextLine();
       }
    int goldenNum,year = Integer.parseInt(y);
    goldenNum = year % 19;
    int FourCenturyMark = year%4, whatdayIsSunday = year%7,
    k = year/100, p = (13+8*k)/25, q = k/4, days =(15-p+k-q)%30,
    N =(4-k-q)%7, d = (19*goldenNum + days)%30,pascalFullMoon = ((2*FourCenturyMark) +(4*whatdayIsSunday)+(6*d)+N)% 7,
    daysAfterMarch20 = d+pascalFullMoon+22;

        if(pascalFullMoon == 6){
          if(d == 29 && daysAfterMarch20 == 57){
             daysAfterMarch20 = 50;
          }
          else if(d ==28 && ((11*days+11)%30) < 19 && daysAfterMarch20 == 56){
            daysAfterMarch20 = 49;
          }
        }
        Calendar march20 = Calendar.getInstance();
        march20.set(year,2,0);
        march20.set(march20.DAY_OF_MONTH,22+19+daysAfterMarch20);
         System.out.println( march20.getTime());
  }

}
