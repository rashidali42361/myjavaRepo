package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class ShuffleArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(60);
		nums.add(70);
		nums.add(80);
		nums.add(90);
		nums.add(100);
		System.out.println("The original nums ArrayList: "+nums);
		System.out.println("=============To swap two element in ArrayList=============");
		//Collections.swap(nums, 1, 3);
		//System.out.println(nums);
		Iterator<Integer> itr = nums.iterator();
		while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        }
		Random rm=new Random();
		for(int i=nums.size()-1;i>=0;i--)
		{
			Collections.swap(nums, i, rm.nextInt(i+1));
		}
		System.out.println("===================After shuffle the ArrayList==================");
		itr=nums.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}

	}

}
