package Stringg;

public class Practice {

	public static void main(String[] args) {
		//write a java program to convert a string into upper case without using inbuilt method.
		String s="java is a programing language";
		String[] s1=s.split(" ");
		String upper="";
		for(String s2:s1)
		{
			String first=s2.substring(0, 1);
			String afterFirst=s2.substring(1);
			upper=upper+first.toUpperCase()+afterFirst+" ";
			
		}
		System.out.println(upper);
		
		
		
			
				
		
	}
}