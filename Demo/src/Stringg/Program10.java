package Stringg;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is programmimg language";
		char s1[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=' ')
			{
				count++;
			}
		}
		System.out.println("The number of character is "+count);

	}

}
