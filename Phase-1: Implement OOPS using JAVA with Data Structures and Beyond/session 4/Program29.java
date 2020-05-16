
class  InvalidAgeException extends Exception {

	public InvalidAgeException() {
		super("User is not valid to vote.");
	}
	
}

class Arithmetic8 {

	public void validate(int age) throws InvalidAgeException {
		if(age >= 18) {
			System.out.println("User is valid to vote.");
		}
		else {
			throw new InvalidAgeException();
		
		}
	}
}

public class Program29 {
	public static void main(String[] args) {
		Arithmetic8 obj = new Arithmetic8();
			
		try {
			obj.validate(12);
		} catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
	}
}