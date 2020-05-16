
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AutoBoxing or Boxing
		// Converting primitive type into object.
		
		int num = 100;
		Integer obj1 = Integer.valueOf(num); 	// Explicit AutoBoxing
		Integer obj2 = num; 					// Implicit AutoBoxing	
		
		System.out.println(num);
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
