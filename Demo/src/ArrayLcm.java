
public class ArrayLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {4,8,2,11};
		int j;
		for(j=11;;j+=j)
		{
			if(j%ar[0]==0&&j%ar[1]==0&&j%ar[2]==0&&j%ar[3]==0)
			{
				break;
			}
			
		}
		System.out.println("lcm is "+j);

	}
	

}
