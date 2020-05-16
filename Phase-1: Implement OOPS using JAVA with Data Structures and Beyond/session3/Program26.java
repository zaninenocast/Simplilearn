
class Arithmetic5 {
	int array[] = {10,20,30,40};
	int num1 = 50;
	int num2 = 10;
	
	public void calc() {
		try {
			try {
				System.out.println(num1/num2);
				System.out.println("4th element of array : " + array[3]);
				System.out.println("5th element of array : " + array[4]);
			}	
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println(ex);
			}
			catch(ArithmeticException ex) {
				System.out.println(ex);
			}
			int num = Integer.parseInt("30");
			System.out.println(num);
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
		}
		
		finally {	// It will always execute
			System.out.println("Finally Code here..");
		}
		
		System.out.println("Remaining Code Here..");
		
	}
}

public class Program26 {
	public static void main(String[] args) {
		Arithmetic5 obj = new Arithmetic5();
		obj.calc();
	}
}

