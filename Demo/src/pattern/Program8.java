package pattern;

public class Program8 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<=1 ||i+j>=7||i==3&&j==0||i==4&&j==0||i==4&&j==1||i==0&&j==3||i==0&&j==4||i==1&&j==4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}
