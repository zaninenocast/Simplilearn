// Parent Class: Abstract Person
	abstract class Person3 {
		private String name;
		private String gender;
		public Person3(String nm, String gen) {
			this.name = nm;
			this.gender = gen;
		}
		// abstract method
		public abstract void work();
		@Override
		public String toString() {
			return "Name=" + this.name + "::Gender=" + this.gender;
		}
		public void changeName(String newName) {
			this.name = newName;
		}
	}

	// Child Class: Non-Abstract Child Class
	class Employee3 extends Person3 {
		private int empId;
		public Employee3(String nm, String gen, int id) {
			super(nm, gen);
			this.empId = id;
		}
		@Override
		public void work() {
			if (empId == 0) {
				System.out.println("Not working");
			} else {
				System.out.println("Working as employee!!");
			}
		}
	}

	public class Program19 {
		public static void main(String[] args) {
			// coding in terms of abstract classes
			Person3 student = new Employee3("Dove", "Female", 0);
			student.work();
			System.out.println(student.toString());
			
			System.out.println("*****************************************");
			Person3 employee = new Employee3("Pankaj", "Male", 123);
			employee.work();
			// using method implemented in abstract class - inheritance
			employee.changeName("Pankaj Kumar");
			System.out.println(employee.toString());
		}
	}

