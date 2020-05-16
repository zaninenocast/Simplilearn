

import java.util.Scanner;


class Person1 {
	int	personId;
	String personName;
	String city;
	
	public Person1() {
		System.out.println("Default Constructor Invoked..");
		this.personId = 101;
		this.personName = "King";
		this.city = "Delhi";
	}

	public void displayDetails() {
		System.out.println("Person Id : " + this.personId);
		System.out.println("Person Name :" + this.personName);
		System.out.println("Current City : " + this.city);
		
	}
}

class Employee extends Person1 {
	float salary;
	public Employee() {
		super();
		this.salary = 10000;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Salary : " + this.salary);
		
	}
	
}

public class Program16 {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		emp.displayDetails();
	}

}