package Collection;

import java.util.HashSet;

public class Program17 {

	public static void main(String[] args) {
		HashSet <Integer> hs=new HashSet <Integer>();
		hs.add(12);
		hs.add(77);
		hs.add(56);
		hs.add(null);
		hs.add(null);
		hs.add(null);
		hs.add(32);
		hs.add(66);
		hs.add(77);
		//hs.add("fg");
		
		for(Integer x: hs)
		{
			System.out.println(x);
		}
		
		System.out.println(hs.contains(32));
		System.out.println(hs.contains(78));
	

	}

}
