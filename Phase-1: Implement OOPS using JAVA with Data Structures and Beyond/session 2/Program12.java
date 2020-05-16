import java.util.Scanner;

class Student2 {
	// Data Members
	int studentId;
	String studentName;
	
	public void acceptDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		this.studentName = scan.nextLine();
		System.out.print("Enter Your Id : ");
		this.studentId = scan.nextInt();
	}

	
	// Member Function (Method)
	public void displayDetails() {
		System.out.println("Student Id : " + this.studentId);
		System.out.println(" Student Name " + this.studentName);
	}
}

class Marks extends Student2 {
	protected float objectiveMarks;
	protected float subjectiveMarks;
	
	public void acceptDetails() {
		super.acceptDetails();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Objective Marks : ");
		this.objectiveMarks = scan.nextFloat();
		System.out.print("Enter Your Subjective Marks : ");
		this.subjectiveMarks = scan.nextFloat();
	}

	
	// Member Function (Method)
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks : " + this.objectiveMarks);
		System.out.println(" Subjective Marks " + this.subjectiveMarks);
	}
	
}

class Sports extends Marks {
	protected float score;
	
	public void acceptDetails() {
		super.acceptDetails();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Score : ");
		this.score = scan.nextFloat();

	}

	
	// Member Function (Method)
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Sports Score : " + this.score);
	}
	
}

class Result extends Sports {
	float totalMarks;
	float averageMarks;
	public void calculateResult() {
		this.totalMarks = this.objectiveMarks + this.subjectiveMarks + this.score;
		this.averageMarks = this.totalMarks/3;
		System.out.println("Total Marks Obtained : " + this.totalMarks);
		System.out.println("Average Marks Obtained : " + this.averageMarks);
	}
}

public class Program12 {

	public static void main(String[] args) {
		

		Result obj = new Result();
		obj.acceptDetails();
		obj.displayDetails();
		obj.calculateResult();
			
	}
}

