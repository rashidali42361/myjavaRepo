package Practice;

public class Program3 {

	public static void main(String[] args) {
		int n=5;
		int k=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((char)k++ +" ");
			}
			System.out.println();
		}

	}

}
