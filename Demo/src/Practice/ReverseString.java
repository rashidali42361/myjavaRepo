package Practice;

public class ReverseString {

	public static void main(String[] args) {
		String s="I love my India";
		//char[] c=s.toCharArray();
		String[] arr= s.split(" ");
		String s1="";
		for(int i=arr.length-1;i>=0;i--)
		{
			s1=s1+arr[i]+" ";
		}
		System.out.println(s1);

	}

}
