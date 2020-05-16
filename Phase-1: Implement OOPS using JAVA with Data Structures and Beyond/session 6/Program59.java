
class Test2<T, U> {
	
	T value1;
	U value2;
	Test2(T val1, U val2) {
		this.value1 = val1;
		this.value2 = val2;
	}
	public void getValue() {
		System.out.println(this.value1 + " : " + this.value2);
	}
}


public class Program59 {

	public static void main(String[] args) {
		Test2<Integer, String> obj = new Test2<Integer, String>(10, "King");
		obj.getValue();
		Test2<String, Integer> obj1 = new Test2<String, Integer>("Bhawna Gunwani", 101);
		obj1.getValue();

	}

}
