package Stringg;

public class prog1 {

	public static void main(String[] args) {
		String s=" I love My India";
		//System.out.println(s.length());
        char c[]=s.toCharArray();
		int count=0;
		for(char i:c)
		{
			count++;
		}
		System.out.println("Length of the string is "+count);
		System.out.println(s.charAt(4));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.lastIndexOf(1));
		System.out.println(s.trim());
		System.out.println(s.substring(5));
		System.out.println(s.split("I"));
	}

}
