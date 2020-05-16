import java.util.Scanner;

class Student4 {
	// Data Members
	int studentId;
	String studentName;
	static String universityName;
	static {
		Student4.universityName = "ABC University";
	}
	
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
		System.out.println(" Student Name :" + this.studentName);
		System.out.println("University Name :" + Student4.universityName);
	}
}

class Marks2 extends Student4 {
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

class Sports2 extends Marks2 {
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

class Result2 extends Sports2 {
	float totalMarks;
	float averageMarks;
	public void calculateResult() {
		this.totalMarks = this.objectiveMarks + this.subjectiveMarks + this.score;
		this.averageMarks = this.totalMarks/3;
		System.out.println("Total Marks Obtained : " + this.totalMarks);
		System.out.println("Average Marks Obtained : " + this.averageMarks);
	}
}

public class Program14 {

	public static void main(String[] args) {
		

		Result2 obj[] = new Result2[3];
		for(int i =0;i<=2;i++) {
			obj[i] = new Result2();
			obj[i].acceptDetails();
			obj[i].displayDetails();
			obj[i].calculateResult();
		}	
		
	}

}

