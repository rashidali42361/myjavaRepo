package pattern;

public class Practice {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((i<=j&&i+j<=4)||(i>=j && i+j>=4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((i>=j&&i+j<=4)||(i<=j&&i+j>=4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}
		System.out.println("Dimond hai================");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if((i+j<=1)||(j==0&&i==3)||(j==0&&i==4)||(j==1&&i==4)||(i+j>=7)||(j==3&&i==0)||(j==4&&i==0)||(j==4&&i==1))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
			
		}
		
		
		

	}

}
