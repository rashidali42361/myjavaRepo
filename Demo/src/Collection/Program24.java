package Collection;

import java.util.Arrays;

public class Program24 {

	public static void main(String[] args) {
		int[] a= {12, 45, 67, 77, 18, 23, 88};
		System.out.println("Unsoted Array================");
		for(int x: a)
		{
			System.out.println(x);
		}
		Arrays.sort(a);
		System.out.println("Sorted elements================");
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
