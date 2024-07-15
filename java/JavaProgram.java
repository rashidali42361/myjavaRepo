import com.beust.ah.A;

public class JavaProgram {

	public static void main(String[] args) {
		//find the largest number with help of conditional operator.
		int[] ar= {3,2,5,3,1,8,4,0,9};
		//System.out.println(arr.length);
		//int ar[]= {80,46,38,26,89,54};
		for(int k=0;k<ar.length;k++)
		{
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
			}
		}}
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[j]);
		}
		System.out.println("Largest number in array:"+ar[ar.length-1]);
		System.out.println("Smallest number in array:"+ar[0]);
		 

	}

}
