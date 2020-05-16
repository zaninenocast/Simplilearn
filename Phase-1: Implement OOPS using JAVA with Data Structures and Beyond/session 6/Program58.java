
class Test1<T> {
	
	T value;
	Test1(T val) {
		this.value = val;
	}
	public T getValue() {
		return this.value;
	}
}


public class Program58 {

	public static void main(String[] args) {
		Test1<Integer> obj = new Test1<Integer>(10);
		System.out.println(obj.getValue());
		Test1<String> obj1 = new Test1<String>("Bhawna Gunwani");
		System.out.println(obj1.getValue());

	}

}
