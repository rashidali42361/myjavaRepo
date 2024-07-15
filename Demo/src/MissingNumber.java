
public class MissingNumber {

	public static void main(String[]args)
	{
		int[] a= {1,2,5,8,9,12,13,14,17};
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1]-1)
			{
				int p=a[i];
				while(p<a[i+1]-1)
				{
					p++;
					System.out.println(p);
				}
			}
		}
	}

}
