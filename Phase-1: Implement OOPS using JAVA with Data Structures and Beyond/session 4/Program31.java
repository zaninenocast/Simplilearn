
import java.util.ArrayList;
import java.util.Iterator;

public class Program31 {
	public static void main(String[] args) {
		
		ArrayList<String> emps = new ArrayList<String>();
		emps.add("King");
		emps.add("Kochhar");
		emps.add("Sarah");
		emps.add(2, "Bhawna");
		
		for(String ename: emps) {
			System.out.println(ename);
		}
		
		emps.remove(2);
		emps.set(2,  "Bhawna");
		
		Iterator<String> iterate = emps.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		System.out.println(emps.get(2));
		
		ArrayList<String> otheremps = new ArrayList<String>();
		otheremps.add("Kanak");
		otheremps.add("Gautam");
		
		System.out.println("*********************");
		
		emps.addAll(otheremps);
		
		for(String ename: emps) {
			System.out.println(ename);
		}
		
		System.out.println("*********************");
		
		System.out.println(emps.contains("Bhawna"));
		
		System.out.println("*********************");
		
		emps.removeAll(emps);
		for(String ename: emps) {
			System.out.println(ename);
		}
		
		System.out.println("*********************");
		
		for(String ename: otheremps) {
			System.out.println(ename);
		}
		
		System.out.println("*********************");
		
		ArrayList<String> otherempsOne = new ArrayList<String>();
		otherempsOne.add("Kanak");
		
		otheremps.retainAll(otherempsOne);
		
		for(String ename: otheremps) {
			System.out.println(ename);
		}
		
		
		
	}
}

