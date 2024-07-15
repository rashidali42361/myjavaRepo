
public class ArrayDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,45,23,78,39,0,0};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]<ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int k=0;k<ar.length;k++)
		{
			System.out.println(ar[k]);
		}

	}

}
