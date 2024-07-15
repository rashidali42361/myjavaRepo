
public class ArmStrong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test(1000));


	}
	public static int test(int n)
	{
		int count=0;
		for(int i=1;i<n;i++)
		{
		int	sum=ArmStrong.findSum(i);
		if(sum==i)
		{
			count++;
			System.out.println(i);
		}
		
		}
		return count;
	
	}
	}


