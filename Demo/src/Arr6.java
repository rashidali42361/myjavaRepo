import java.util.Scanner;
public class Arr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double ar[]= new double[10];
		for(int i=0;i<10;i++)
		{
			System.out.println("enter the value for index:" +i);
			ar[i]=sc.nextDouble();
			//System.out.println(" "+ar[i]);
		}
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		

	}

}
