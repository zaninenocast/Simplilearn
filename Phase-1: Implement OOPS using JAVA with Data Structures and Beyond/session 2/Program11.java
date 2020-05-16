class Student1 {
	// Data Members
	int studentId;
	String studentName;
	
	// Default Constructor (Non-Parameterized Constructor)
	public Student1() {
		System.out.println("Default Constructor Invoekd..");
		this.studentId = 101;
		this.studentName = "King Kochhar";
	}
	
	// Parameterized Constructor
	public Student1(int sid, String sname) {
		System.out.println("Paameterized Constructor Invoked..");
		this.studentId = sid;
		this.studentName = sname;
	}
	
	// Copy Constructor
	public Student1(Student1 student) {
		System.out.println("Copy Constructor Invoked..");
		this.studentId = student.studentId;
		this.studentName = student.studentName;
	}
	
	// Member Function (Method)
	public void displayDetails() {
		System.out.println("Student Id : " + this.studentId);
		System.out.println(" Student Name " + this.studentName);
	}
}

public class Program11 {

	public static void main(String[] args) {
		
		Student1 obj1 = new Student1();
		obj1.displayDetails();
		Student1 obj2 = new Student1(102, "John Smith");
		obj2.displayDetails();
		
		// Copying values without Constructor
		Student1 obj3 = new Student1();
		obj3.studentId = obj2.studentId;
		obj3.studentName = obj2.studentName;
		obj3.displayDetails();
		
		// Copying values with Copy Constructor
		Student1 obj4 = new Student1(obj2);
		obj4.displayDetails();
		
	}

}

