
public class Arr119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {3,6,7,9,5,11};
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			int j=1;
			while(j<ar[i])
			{
				if(ar[i]%j==0)
				{
					count++;
				}
				j++;
			}
			if(count==1)
			{
				System.out.println(ar[i]);
			}
		}
		
		
		
		
	}

}
