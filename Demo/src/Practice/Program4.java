package Practice;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int k=0;
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				k++;
				if(k%2==0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			System.out.println();
		}

	}

}
