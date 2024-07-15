
public class Arr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {50,40,30,35,45,10};
		for(int j=0;j<ar.length;j++)
		{
			
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
			}
			
		}
	}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("the highest number in array:"+ar[ar.length-1]);
		System.out.println("second highest number is "+ar[ar.length-2]);

}}
