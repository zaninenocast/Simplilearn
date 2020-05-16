
class MyOuterClass1 {
	
	void MyOuterMethod() {
		System.out.println("I am inside outer method..");
		class MyInnerClass {
			void MyInnerMethod() {
				System.out.println("I am inside inner Method");
			}
		}
		MyInnerClass innerObj = new MyInnerClass();
		innerObj.MyInnerMethod();
	}
}

public class Program61 {

	public static void main(String[] args) {
		
		MyOuterClass1 outer = new MyOuterClass1();
		outer.MyOuterMethod();
	}

}