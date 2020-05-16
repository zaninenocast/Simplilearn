
class Test {	
	int value;
	Test(int val) {
		this.value = val;
	}
	public int getValue() {
		return this.value;
	}
}

public class Program57 {

	public static void main(String[] args) {
		Test obj = new Test(10);
		System.out.println(obj.getValue());

	}
}