package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Program25 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(34);
		a1.add(44);
		a1.add(23);
		a1.add(28);
		System.out.println("Unsoted Elements===========");
		for(Integer x: a1)
		{
			System.out.println(x);
		}
		Collections.sort(a1);
		System.out.println("Sorted elements=============");
		for(Integer x:a1)
		{
			System.out.println(x);
		}

	}

}
