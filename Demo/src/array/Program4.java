package array;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int small=0;
		for(int i=0;i<a.length-1;i++)
		{
		small=a[i]<a[i+1]?a[i]:a[i+1];
		}
		System.out.println(small);


	}

}
