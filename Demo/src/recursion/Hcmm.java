package recursion;

public class Hcmm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findHcf(12,findHcf(30,60)));

	}
	public static int findHcf(int a,int b)
	{
		int small=a<b?a:b;
		int i;
		for(i=small; ;i=i/2)
		{
			if(a%i==0 && b%i==0)
			{
				break;
			}
		}
		return i;
	}

}
