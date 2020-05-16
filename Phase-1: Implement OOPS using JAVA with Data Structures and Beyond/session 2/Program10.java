class Student {
	// Data Members
	int studentId;
	String studentName;
	
	// Default Constructor (Non-Parameterized Constructor)
	public Student() {
		System.out.println("Default Constructor Invoekd..");
		this.studentId = 101;
		this.studentName = "King Kochhar";
	}
	
	// Parameterized Constructor
	public Student(int sid, String sname) {
		System.out.println("Paameterized Constructor Invoked..");
		this.studentId = sid;
		this.studentName = sname;
	}
	
	// Member Function (Method)
	public void displayDetails() {
		System.out.println("Student Id : " + this.studentId);
		System.out.println(" Student Name " + this.studentName);
	}
}

public class Program10 {

	public static void main(String[] args) {
		
		Student obj1 = new Student();
		obj1.displayDetails();
		Student obj2 = new Student(102, "John Smith");
		obj2.displayDetails();
		
	}

}

