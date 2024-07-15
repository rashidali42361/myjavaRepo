package Collection;

public class Program5 {

	public static void main(String[] args) {
		double[] p= {34.6, 78.5, 88.9, 44.5, 66.7};
		int count=0;
		for(double x:p)
		{
			if(count%2==0)//even index elemnts are being accessed
			{
				System.out.println(x);
			}
			count++;
		}

	}

}
