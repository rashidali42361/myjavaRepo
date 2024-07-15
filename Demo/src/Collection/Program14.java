package Collection;

import java.util.ArrayList;
import java.util.List;

public class Program14 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Mohan");
		l1.add("34764");
		l1.add("dsgdf6");
		l1.add("Hi How are you");
		l1.add("Monday");
		l1.add("BYEE");
		int count=0;
		for(String x:l1)
		{
			System.out.println("Length of element at index "+count+" is:"+x.length()); 
			count++;
		}

	}

}
