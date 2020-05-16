
class Arithmetic3 {
	public void division(int num1, int num2) {
		try {
			int result = num1/num2;	
			System.out.println("Division : " + result);
		}
		
		catch(ArithmeticException ex) {
			System.out.println(ex);
			System.out.println("getMessage() : " + ex.getMessage());
			System.out.println("getCause() : " + ex.getCause());
			System.out.println("toString() :" + ex.toString());
			System.out.println("printStackTrace() : ");
			ex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Parent Exception Block");
			System.out.println(ex);
		}
		
		System.out.println("Remaining Code Here..");
		
	}
}

public class Program24 {
	public static void main(String[] args) {
		Arithmetic3 obj = new Arithmetic3();
		obj.division(10, 0);
	}
}
