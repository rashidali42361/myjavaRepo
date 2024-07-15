
public class ArrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {21,34,25,28,30,27};
		int sum=0;
		int sum1=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				sum=sum+ar[i];
			}
			else
			{
				sum1=sum1+ar[i];
			}
		}
		System.out.println("sum of even number in array "+sum);
		System.out.println("sum of odd number in array "+sum1);

	}

}
