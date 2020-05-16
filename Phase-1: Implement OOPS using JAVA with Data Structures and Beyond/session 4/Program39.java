
// Blank Final Variable:
	
	public class Program39 {
	final int count;
	Program39() {
		this.count = 100;
	}
	public void setCount() {
		System.out.println(this.count);
		//count++;				// throws compilation Error
	}
	public static void main(String[] args) {
		Program39 obj = new Program39();
		obj.setCount();
	}
	}
