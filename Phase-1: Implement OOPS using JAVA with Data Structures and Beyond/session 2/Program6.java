import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		char gender;
		long contactno;
		double salary;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		name = scan.nextLine();
		System.out.print("Enter Your Age : ");
		age = scan.nextInt();
		System.out.print("Enter Your Gender : ");
		gender = scan.next().charAt(0);
		System.out.print("Enter Your Contact Number : ");
		contactno = scan.nextLong();
		System.out.print("Enter Your Salary : ");
		salary = scan.nextDouble();
		
		System.out.println("Your Name is : " + name);
		System.out.println("Your age is : " + age);
		System.out.println("Your gender is : " + gender);
		System.out.println("Your COntact Number is : " + contactno);
		System.out.println("Your Salary is " + salary);

	}

}
