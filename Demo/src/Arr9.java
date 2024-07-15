//87.WAP TO CHECK ARRAYLENGTH WITHOUT USING LENGTH VARIABLE
import java.util.Arrays;
public class Arr9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,90,40,50,60,70};
		int size=ar.length;
		Arrays.sort(ar);
		System.out.println("sorted array ::"+Arrays.toString(ar));

	}
	public static int smallest(int a, int b)
	{
		int small=a<b?a:b;
		return small;
	}

}
