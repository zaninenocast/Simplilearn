// Resource A
 class ClassA {
	private int num = 10;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

// Resource B
 class ClassB {
	private int num = 20;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}




public class Program63 {

	public static void main(String[] args) {
		Program63 obj = new Program63();
		
		final ClassA objA = new ClassA();
		final ClassB objB = new ClassB();
		
		// Thread 1
		Runnable b1 = new Runnable() {
			public void run() {
				synchronized(objB) {
					try {
						Thread.sleep(100);
					} catch(Exception ex) {
						ex.printStackTrace();
					}
					synchronized(objA) {
						System.out.println("I am in block one.");
					}
				}
			}
		};
		
		// Thread 2
		Runnable b2 = new Runnable() {
			public void run() {
				synchronized(objB) {
					
					synchronized(objA) {
						System.out.println("I am in block Two.");
					}
				}
			}
		};
		
		new Thread(b1).start();
		new Thread(b2).start();
	}
}


	

