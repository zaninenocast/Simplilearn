public class Program38 {
	final int count = 100;
	public void setCount() {
		System.out.println(this.count);
		//count++;				// throws compilation Error
	}
	public static void main(String[] args) {
		Program38 obj = new Program38();
		obj.setCount();
	}
}


	

