package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CloneArrayList {

	public static void main(String[] args) {
		//How to copy or clone a ArrayList? 
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(24);
		nums.add(30);
		nums.add(40);
		System.out.println("original ArrayList is:"+nums);
		ArrayList<Integer> cloneNums=(ArrayList<Integer>) nums.clone();
		System.out.println("After clone ArrayList is "+cloneNums);
		System.out.println("=======================================");
		testArralistContainAll();
		
	}
	public static void testArralistContainAll()
	{
		ArrayList<String> grades=new ArrayList<String>();
		grades.add("A");
		grades.add("B");
		grades.add("C");
		System.out.println("Grades collection:"+grades);
		ArrayList<String> grades1=new ArrayList<String>();
		grades1.add("A");
		grades1.add("B");
		grades1.add("C");
		grades1.add("D");
		System.out.println("Grades1 collection:"+grades1);
		System.out.println(grades.containsAll(grades1));
		System.out.println(grades1.containsAll(grades));
		System.out.println("==========To copy ArrayList to Array===========");
		Object arr = grades.toArray();
		System.out.println(Collections.max(nums));
		
		
	
		
	}

}
