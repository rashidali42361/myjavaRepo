package Collection;

import java.util.TreeSet;

public class Program19 {

	public static void main(String[] args) {
		TreeSet<Integer> hs=new TreeSet<Integer>();
		hs.add(12);
		hs.add(77);
		hs.add(56);
		hs.add(34);
		hs.add(32);
		hs.add(66);
		hs.add(77);
		hs.add(34);
		for(Integer x: hs)
		{
			System.out.println(x);
		}
		
		System.out.println(hs.contains(32));
		System.out.println(hs.contains(78));

	}

}
