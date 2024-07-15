package array;
//write program to find sum of all the odd number present in the array.
//write the program to find the product of the element present at even index.

public class Program2 {

	public static void main(String[]args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenSum=evenSum+a[i];
			}
			else
			{
				oddSum=oddSum+a[i];
			}
			
		}
		System.out.println("Even number sum id "+evenSum);
		System.out.println("odd number sum id "+oddSum);
		System.out.println(a[0]);
		

	}

}
