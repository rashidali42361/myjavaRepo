package array;

public class MaxAtEvenIndex {

	public static void main(String[] args) {
		int a[]= {80,46,38,26,89,54,23,58,7,98,42};
		for(int i=2;i<a.length;i=i+2)
		{
			if(i<a.length-2)
			{
			int n=a[i]>a[i+2]?a[i]:a[i+2];
			System.out.println(n);
			}
		}

	}

}
