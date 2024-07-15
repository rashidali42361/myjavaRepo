package exception_handling;

import java.io.FileInputStream;

public class Program5 {

	public static void main(String[] args) {
		System.out.println("main starts");
		try
		{
			FileInputStream fis=new FileInputStream("d:\\text.txt");
			System.out.println("File found");
		}
		catch(Exception e)
		{
			System.out.println("File not found error");
			System.out.println("How to store input please define");
		}
		System.out.println("Programe end");
		

}}
