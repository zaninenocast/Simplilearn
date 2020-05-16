
public class Program40 {
	static final int count;
	static {
		count = 100;
	}
	public void setCount() {
		System.out.println(Program40.count);
		//count++;				// throws compilation Error
	}
	public static void main(String[] args) {
		Program40 obj = new Program40();
		obj.setCount();
	}
}