import java.util.Scanner;


class Person2 {
	int	personId;
	String personName;
	String city;
	
	public Person2(int id, String name) {
		System.out.println("Default Constructor Invoked..");
		this.personId = id;
		this.personName = name;
		this.city = "Delhi";
	}

	public void displayDetails() {
		System.out.println("Person Id : " + this.personId);
		System.out.println("Person Name :" + this.personName);
		System.out.println("Current City : " + this.city);
		
	}
}

class Employee1 extends Person2 {
	float salary;
	public Employee1(int id, String name, float sal) {
		//super(id, name);
		this(id, name);
		this.salary = sal;
	}
	public Employee1(int id, String name) {
		super(id, name);
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Salary : " + this.salary);
		
	}
	
}

public class Program17 {

	public static void main(String[] args) {
	
		Employee1 emp = new Employee1(101, "King", 12000);
		emp.displayDetails();
	}

}
