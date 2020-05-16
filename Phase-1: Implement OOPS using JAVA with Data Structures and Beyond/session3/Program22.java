
class Arithmetic1 {
	public void division(int num1, int num2) {
		try {
			int result = num1/num2;	
			System.out.println("Division : " + result);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println("Remaining Code Here..");
		
	}
}

public class Program22 {
	public static void main(String[] args) {
		Arithmetic1 obj = new Arithmetic1();
		obj.division(10, 0);
	}
}