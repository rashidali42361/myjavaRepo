package array;
//write a program to reverse all the element of the array
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int start=0;
		int end=a.length-1;
		int j=0;
		while(j<a.length)
		{
			a[start]=a[end];
			start++;
			end--;
			j++;
			
		
		}
		System.out.println(a[3]);
		System.out.println(a[1]);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		

	}

}
