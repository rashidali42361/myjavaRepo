
public class Arr98 {
	public static void main(String[]args)
	{
		int a1[]= {10,20,30,40,50};
		int a2[]=new int[a1.length];
		for(int i=a1.length-1;i>=0;i--)
		{
			a2[a1.length-i-1]=a1[i];
		}
		for(int j=0;j<a2.length;j++)
		{
			System.out.println(a2[j]);
		}
	}

}
