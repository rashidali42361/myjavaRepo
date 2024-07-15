package array;

public class Unique {

	public static void main(String[] args) {
		int [] a= {10,20,30,10,20,30,50,60,40,40,40,70};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int p=0;
		for(int k=0;k<a.length-1;k++)
		{
			if(a[k]!=a[k+1])
			{
				a[p]=a[k];
				p++;
			}
		}
		a[p]=a[a.length-1];
		for(int i=0;i<=p;i++)
		{
			System.out.println(a[i]);
	
		
		}
		
	

	}

}
