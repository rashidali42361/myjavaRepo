package Stringg;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is high level language";
		String s1[]=s.split(" ");
		for(String s2:s1)
		{
			String rev="";
			char ch[]=s2.toCharArray();
			for(int i=ch.length-1;i>=0;i--)
			{
				rev=rev+ch[i];
			}
			System.out.print(rev+" ");
		}

	}

}
