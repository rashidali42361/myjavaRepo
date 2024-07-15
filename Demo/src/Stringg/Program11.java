package Stringg;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//127.WAP TO CONVERT UPPERCASE TO LOWER CASE WITHOUT USING INBUILT METHOD.
		String s="JAVA IS PROGRAMMING LANGUAGE";
		char s1[]=s.toCharArray();
		String upper="";
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=' ')
			{
				char c=(char)(s1[i]+32);
				upper=upper+c;
			}
		//System.out.println(upper+" ");
			
		}
		System.out.println(upper);
		
		

	}

}
