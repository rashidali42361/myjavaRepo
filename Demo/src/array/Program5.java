package array;
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
	int[] a1= {10,20,30,40,50};
	int[] a2=new int[a1.length+1];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the index number:");
;	int index=sc.nextInt();
	int element=99;
	for(int i=0;i<a2.length;i++)
	{
		if(i<index)
		{
			a2[i]=a1[i];
		}
		else if(i==index)
		{
			a2[index]=element;
		}
		else
		{
			a2[i]=a1[i-1];
		}
		System.out.println(a2[i]);
	}
	

}}
