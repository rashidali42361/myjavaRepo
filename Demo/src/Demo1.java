
public class Demo1 {
public static void main(String[]args)
{
	String s="welcome";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			System.out.print(s.charAt(i));
			count++;
		}
	}
	System.out.println(count);
	System.out.println((int)'a');
	System.out.println((char)65);
}



}
