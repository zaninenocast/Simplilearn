
class InvalidAgeException extends Exception {

	public InvalidAgeException() {
		super("User is not valid to vote.");
	}
	
}

class Arithmetic7 {

	public void validate(int age) {
		if(age >= 18) {
			System.out.println("User is valid to vote.");
		}
		else {
			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}

public class Program28 {
	public static void main(String[] args) {
		Arithmetic7 obj = new Arithmetic7();
			obj.validate(12);
	}
}
