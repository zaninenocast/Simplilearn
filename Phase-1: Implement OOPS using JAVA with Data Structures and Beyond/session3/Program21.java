
class Arithmetic {
	public void division(int num1, int num2) {
		int result = num1/num2;
		System.out.println("Division : " + result);
	}
}

public class Program21 {
	public static void main(String[] args) {
		Arithmetic obj = new Arithmetic();
		obj.division(10, 0);
	}
}