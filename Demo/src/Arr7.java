import java.util.Scanner;
public class Arr7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ar[]=new String[11];
		for(int i=1;i<ar.length;i++)
		{
			System.out.println("enter the player name position:"+i);
			ar[i]=sc.nextLine();
		}
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[j]);
		}

	}

}
