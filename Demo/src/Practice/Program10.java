package Practice;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int k=65;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print((char)k+++" ");
			}
			System.out.println();
		}

	}

}
