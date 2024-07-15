package Stringg;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is a programing languge";
		char ch[]=s.toCharArray();
		int temp[]=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=1+i;j<ch.length-1;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					temp[j]=-1;
				}
			}
			if(temp[i]!=-1)
			{
				System.out.println(ch[i]+" "+count);
			}
		}

	}

}
