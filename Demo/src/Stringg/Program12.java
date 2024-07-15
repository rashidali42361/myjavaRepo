package Stringg;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java program";
		char ch[]=s.toCharArray();
		int temp[]=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+i;j<ch.length;j++)
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
