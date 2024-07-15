package Stringg;

public class Practice4 {

	public static void main(String[] args) {
		//. Write a program to rotate one char in a given string 
		String s="arun";
		char[] ca=s.toCharArray();//{a,r,u,n}
		char temp = ca[s.length()-1];
	     int count=0;
	     for(char c:ca)
	     {
	    	 count++;
	     }
	     System.out.println("length of string is "+count);

	}

}
