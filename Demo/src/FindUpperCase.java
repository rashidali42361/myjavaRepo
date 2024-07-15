
public class FindUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I Love Java And Selenium";
		int upper=0;
		int lower=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				upper=upper+1;
				
			}
			else if (s.charAt(i)!=32)
			{
				lower++;
			}
			
			//System.out.println((char)90);
			
		}
		System.out.println("upper case letter are there: "+upper);
		System.out.println("lower case letter are there: "+lower);

	}

}
