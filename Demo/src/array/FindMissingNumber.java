package array;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] a= {2,4,6,7,9,13,19};
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
