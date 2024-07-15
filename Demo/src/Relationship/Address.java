package Relationship;

public class Address {
	String city;
	String state;
	int pin;
	


Address(String city,String state,int pin)
{
	this.city=city;
	this.state=state;
	this.pin=pin;
	
}
public  void addressDisplay()
{
	System.out.println("City of student:"+city);
	System.out.println("State of student:"+state);
	System.out.println("Pin of student:"+pin);
	
}
}