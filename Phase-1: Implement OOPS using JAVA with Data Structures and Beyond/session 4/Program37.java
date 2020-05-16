
import java.util.*;

public class Program37 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			String value = iterator.next();
			System.out.println("Value : " + value);
			if(value.equals("C")) {
				iterator.remove();
			}
		}
		
		System.out.println(list);
		
		list.iterator().forEachRemaining(System.out::println);
		
		System.out.println("****************");
		
		ListIterator<String> iterator1 = list.listIterator();
		while(iterator1.hasPrevious()) {
			System.out.println(iterator1.previous() + ' ');
		}
				
	}
}
