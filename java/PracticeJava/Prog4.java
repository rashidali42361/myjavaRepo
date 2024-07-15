package PracticeJava;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test(10));
	}
	public static String test(int n)
	{
		if(n>0)
		{
			return n+" "+test(n-1);
		}
		else
		{
			return "program ended"; 
		}
	}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	

