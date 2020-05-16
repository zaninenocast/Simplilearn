
import java.util.Collection;
//import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
//import java.util.*;

public class Program35 {
	public static void main(String[] args) {

		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(1, "One");
		hashTable.put(2, "Two");
		hashTable.put(3, "Three");
		hashTable.put(4, "Four");
		hashTable.put(5, "Five");
		
		System.out.println(hashTable);
		System.out.println(hashTable.get(1));
		System.out.println(hashTable.get(10));
		
		// put(), putAll
		
				// remove(), clear();
				
		Set<Integer> keys = hashTable.keySet();
		System.out.println(keys);
				
		Collection<String> values = hashTable.values();
		System.out.println(values);
				
		for(Map.Entry<Integer, String> entry : hashTable.entrySet()) {
			Integer key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " : " + value);

		}
		
		
		
		
	}
}
