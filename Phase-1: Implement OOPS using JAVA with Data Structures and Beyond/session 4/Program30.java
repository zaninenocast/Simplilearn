class Arithmetic9 {
	public void method1(int num1, int num2) throws ArithmeticException {
		System.out.println(num1/num2);
		
	}
	public void method2(int num1, int num2) {
		try {
			method1(num1, num2);	
		} catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}

public class Program30 {
	public static void main(String[] args) {
		Arithmetic9 obj = new Arithmetic9();
		obj.method2(100,20);
	}
}

