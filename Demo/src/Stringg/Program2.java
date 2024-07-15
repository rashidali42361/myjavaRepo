package Stringg;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java program";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		String rev="";
		for(int i=ch.length-1;i>=00;i--)
		{
			
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}

}
