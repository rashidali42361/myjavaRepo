package pattern;

public class Practice2 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			int k=i+1;
			int p=2;
			for(int j=0;j<5;j++)
			{
				
				if((i<=j&&i+j<=4)||(i>=j&&i+j>=4))
				{
					System.out.print(k);
					k++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		

	}

}
