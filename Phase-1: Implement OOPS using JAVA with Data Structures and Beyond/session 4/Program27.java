
class Arithmetic6 {

	
	public void validate(int age) {
		if(age >= 18) {
			System.out.println("User is valid to vote.");
		}
		else {
			throw new ArithmeticException("User is not valid to vote.");
		}
	}
}

public class Program27 {
	public static void main(String[] args) {
		Arithmetic6 obj = new Arithmetic6();
		try {
			obj.validate(12);
		} catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
