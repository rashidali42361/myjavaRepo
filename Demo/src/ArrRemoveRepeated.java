
public class ArrRemoveRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,10,20,30,40,20,30,50,10,60,70,50,10,10};
		int temp[]=new int[ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					temp[j]=-1;
					count++;
				}
			}
			if(temp[i]!=-1)
			{
				System.out.println(ar[i]+" "+count);
			}
		}
		

	}

}
