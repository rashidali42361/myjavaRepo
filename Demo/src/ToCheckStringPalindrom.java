
public class ToCheckStringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ToCheckStringPalindrom.toCheckPalindrom());
		String s1="happy";
		String s2=new String("happy");
		System.out.println(s1.in==s2);

	}
	/*public static boolean checkPalindrom()
	{
		String str="level";
		StringBuilder strBuilder=new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}*/
	public static boolean toCheckPalindrom()
	{
		String str="radar";
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
		return str.equals(temp);
		
	}
	
	

}
