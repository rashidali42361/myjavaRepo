package Collection;

import java.util.ArrayList;
import java.util.List;

public class Program13 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		
		l1.add("Mohan");
		l1.add("34764");
		l1.add("dsgdf6");
		l1.add("Hi How are you");
		l1.add("Monday");
		l1.add("BYEE");
		String s1="MOHANN";
		System.out.println(s1.length());
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println("Length of element at index "+i+" is: "+l1.get(i).length());                 
		}
		

	}

}
