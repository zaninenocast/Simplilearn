class MyOuterClass {
	private int value = 100;
	class MyInnerClass {
		public int getValue() {
			return value;
		}
	}
}

public class Program60 {

	public static void main(String[] args) {
		
		MyOuterClass outer = new MyOuterClass();
		MyOuterClass.MyInnerClass inner = outer.new MyInnerClass();
		System.out.println(inner.getValue());
	}

}

