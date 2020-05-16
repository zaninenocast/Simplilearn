
class Arithmetic4 {
	public void division(int num1, int num2) {
		try {
			int result = num1/num2;	
			System.out.println("Division : " + result);
		}
		
		
		finally {	// It wil always execute
			System.out.println("Finally Code here..");
		}
		
		System.out.println("Remaining Code Here..");
		
	}
}

public class Program25 {
	public static void main(String[] args) {
		Arithmetic obj = new Arithmetic();
		obj.division(10, 0);
	}
}