package Collection;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"babaur");
		hm.put(2, "himayun");
		hm.put(3, "akbar");
		hm.put(4, "shahjahan");
		System.out.println(hm.get(3));
		System.out.println(hm.remove(4));
		HashMap<Integer,String> hm1 = (HashMap<Integer,String>)hm.clone();
		System.out.println(hm1);
		//Tosearch key in set.
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("akbar"));
		System.out.println(hm.entrySet());
		hm.clear();
		System.out.println(hm);
		//Treemap methods
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1,"smith");
		tm.put(2, "azam");
		tm.put(3, "asad");
		tm.put(4, "imran");
		System.out.println(tm);
		TreeMap<Integer, String> newTreeMap = new TreeMap<Integer,String>();
		newTreeMap.putAll(tm);
		System.out.println(newTreeMap);
		System.out.println(tm.subMap(1,false , 3,true));
		
	

	}

}
