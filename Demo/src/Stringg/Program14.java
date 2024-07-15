package Stringg;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println(97-65);
		String s="prince is a good singer";
		String s1="PRINCE IS A GOOD SINGER";
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		String upper="";
		String lower="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				upper=upper+" ";
			}
			else
			{
				upper=upper+(char)(ch[i]-32);
			}
		}
		System.out.println(upper);
		//to conver uppercase to lower case.
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==' ')
			{
				lower=lower+" ";
			}
			else
			{
				lower=lower+(char)(ch1[i]+32);
			}
		}
		System.out.println(lower);
		
	
	}

}
