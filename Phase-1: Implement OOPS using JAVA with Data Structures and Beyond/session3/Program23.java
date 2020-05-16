class Arithmetic2 {
	public void division(int num1, int num2) {
		try {
			int result = num1/num2;	
			System.out.println("Division : " + result);
		}
		
		catch(NumberFormatException ex) {
			System.out.println(ex);
		}
		catch(Exception ex) {
			System.out.println("Parent Exception Block");
			System.out.println(ex);
		}
		
		System.out.println("Remaining Code Here..");
		
	}
}

public class Program23 {
	public static void main(String[] args) {
		Arithmetic obj = new Arithmetic();
		obj.division(10, 0);
	}
}

