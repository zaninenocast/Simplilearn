
interface Executable {
	int execute();
}

class Runner {
	public void run(Executable ex) {
		System.out.println("Executable Block");
		int value = ex.execute();
	}
	
}

public class Program43 {
	public static void main(String[] args) {
		Runner obj = new Runner();
		obj.run(new Executable(){
				public int execute(){
					System.out.println("Hell from Executable Method..");
					return 0;
			};
		System.out.println("**************");
		obj.run(()-> {
			System.out.println("Hell from Executable Method..");
			return 0;
		});
		
		System.out.println("**************");
		obj.run(()-> 8);
	});
}
}

