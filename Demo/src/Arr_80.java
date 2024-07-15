
public class Arr_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		int sumEven=0;
		int ar[]= {10,15,17,34,28,45,67,48};
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
				sumEven=sumEven+ar[i];
				count++;
			}
			
		}
		System.out.println("The even number in the array :"+count);
		System.out.println("The sum of array element is  "+sum);
		System.out.println("The sum of even  element of array is  "+sumEven);

	}

}
