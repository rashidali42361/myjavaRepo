
public class Array109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//109.WAP TO DESIGN A METHOD TO RETURN SMALLEST ELEMENT IN AN ARRAY.
		int a[]= {10,20,30,40,89,3};
		System.out.println(smallest(a));


	}
	public static int smallest(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			
			}
		}
		return a[a.length-1];
		
	}

}
