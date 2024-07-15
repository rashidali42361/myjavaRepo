package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program1 {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		System.out.println("main starts");
		System.out.println(12+45+100);
		//System.out.println(10/0);
		System.out.println(12+40*2);
		System.out.println("Program ends");
		System.out.println("Thank You");
		
		FileInputStream fis=new FileInputStream("d:\\text.txt");
	

	}

}
