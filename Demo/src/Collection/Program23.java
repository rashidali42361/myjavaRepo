package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program23 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
		hm.put(23, "mohan");
		hm.put(13, "sohan");
		hm.put(33, "rohan");
		hm.put(43, "manmohan");
		hm.put(33, "jagmohan");
		System.out.println(hm);
		System.out.println("Access the key===================");
		for(Integer x:hm.keySet())
		{
			System.out.println(x);
		}
		System.out.println("Access the values============");
		for(String s:hm.values())
		{
			System.out.println(s);
		}
		System.out.println("Access the entry with key and value===========");
		for(Map.Entry<Integer, String> x :hm.entrySet())
		{
			System.out.println(x.getKey()+" ===>"+x.getValue());
		}

	}

}
