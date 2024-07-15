package Stringg;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MADAM";
		String rev="";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>0;i--)
		{
			rev=rev+ch[i];
		}
		if(s.equals(rev))
		{
			System.out.println("this is palindome word");
		}
		else
		{
			System.out.println("this is not palindrome word");
		}

	}

}
