
public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UnBoxing
				// Converting Object into primitive type
				
				Integer obj = new Integer(100);
				int num1 = obj.intValue();	// Explicit UnBoxing
				int num2 = obj;				// Implicit UnBoxing
				
				System.out.println(obj);
				System.out.println(num1);
				System.out.println(num2);

	}

}
