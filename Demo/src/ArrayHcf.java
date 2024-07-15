
public class ArrayHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,23,30};
		
			int j=10;
			while(j<=10)
			{
				if(ar[0]%j==0&& ar[1]%j==0 && ar[2]%j==0)
				{
					System.out.println(j);
					break;
				
				}
				j--;
			}
		}

	}


