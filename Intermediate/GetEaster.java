package helper;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;
public class GetEaster {

	public static void main(String[] args) throws IOException {
		Scanner  keyboard = new Scanner(System.in);
		System.out.print("Enter Year:" );
		String y = keyboard.nextLine();
		  while(!y.matches("\\d{4}")){
		       System.out.print("Invalid Year.Try Again: ");
		        y = keyboard.nextLine();
		       }
		int year = Integer.parseInt(y);
		Document easterDate;
     easterDate = Jsoup.connect("http://www.wheniseastersunday.com/year/"+year+"/").userAgent("Mozilla").get();
     Elements dayofYear = easterDate.getElementsByClass("easterdate");
     System.out.println(dayofYear.text() + " "+ year);
      
	}

}
