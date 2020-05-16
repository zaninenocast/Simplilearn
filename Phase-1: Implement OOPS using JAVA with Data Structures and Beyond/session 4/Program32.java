import java.util.LinkedList;

public class Program32 {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Karan");
		linkedList.add("Kartik");
		linkedList.add("Komal");
		linkedList.add("SHreya");
		linkedList.add("Kartik");
		
		for(String val : linkedList) {
			System.out.println(val);
		}
		
		System.out.println("***********************");
		
		linkedList.addFirst("ABC");
		linkedList.addLast("XYZ");
		
		for(String val : linkedList) {
			System.out.println(val);
		}
		
		System.out.println("***********************");
		
		linkedList.removeFirst();
		linkedList.removeLast();
		
		for(String val : linkedList) {
			System.out.println(val);
		}
		
		System.out.println("***********************");
		
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.get(2));
		
		System.out.println("***********************");
		
		for(int index=0; index<linkedList.size(); index++) {
			System.out.println(linkedList.get(index));
		}
		
System.out.println("***********************");

		linkedList.removeFirstOccurrence("Kartik");
		linkedList.removeLastOccurrence("Kartik");
		
		for(int index=0; index<linkedList.size(); index++) {
			System.out.println(linkedList.get(index));
		}
		
	}
}

