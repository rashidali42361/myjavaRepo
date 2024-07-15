package incapsulation;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the student");
		String n=sc.nextLine();
		Employ e1=new Employ();
		e1.setName(n);
		System.out.println(e1.getName());
		//System.out.println(e1.getEid());
		
		
		
		
		
		

	}

}
