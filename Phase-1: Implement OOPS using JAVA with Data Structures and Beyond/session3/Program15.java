

import java.util.Scanner;


class Person {
	int	personId;
	String personName;
	String city;
	public Person() {
		//this(111,"Unknown");
		System.out.println("Default Constructor Invoked..");
		this.city = "Delhi";
	}
	public Person(int personId, String personName) {
		this();
		System.out.println("Parameterized Constructor Invoked..");
		this.personId = personId;
		this.personName = personName;
	}
	
	public void displayDetails() {
		System.out.println("Person Id : " + this.personId);
		System.out.println("Person Name :" + this.personName);
		System.out.println("Current City : " + this.city);
		
	}
}

public class Program15 {

	public static void main(String[] args) {
	
		
//		Person obj = new Person();
//		obj.displayDetails();
		
		Person obj1 = new Person(102, "Sarah James");
		obj1.displayDetails();
	}

}