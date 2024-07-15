package Collection;

import java.util.LinkedList;

public class SubList {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		//To find sublist from linked list.
		System.out.println(l.subList(1, 3));
		//Reverse LinkedList content.
		System.out.println(l);
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.print(l.get(i));
		}
		
	}

}
