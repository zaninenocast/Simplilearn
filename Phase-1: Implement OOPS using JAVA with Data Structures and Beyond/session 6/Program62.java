
class MyOuterClass2 {
	
	static class MyInnerStaticClass {
		void MyInnerMethod() {
			System.out.println("I am inside inner Method");
		}
	}
}

public class Program62 {

	public static void main(String[] args) {
		
		MyOuterClass2.MyInnerStaticClass outer = new MyOuterClass2.MyInnerStaticClass();
		outer.MyInnerMethod();
	}

}
