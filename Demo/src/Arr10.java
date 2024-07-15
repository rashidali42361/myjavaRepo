//111
public class Arr10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30,20,40,10,50,50,50,30};
		int temp[]=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					//System.out.println(ar[i]+" "+j);
					count++;
					temp[j]=-1;
				}
			}
			if(temp[i]!=-1)
			{
				System.out.println(ar[i]+"\t "+count);
			}
			;
		}

	}

}
