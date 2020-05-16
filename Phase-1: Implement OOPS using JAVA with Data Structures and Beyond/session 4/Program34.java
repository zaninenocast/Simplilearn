import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//import java.util.Vector;

public class Program34 {
	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		hashMap.put(4, "Four");
		hashMap.put(5, "Five");
		//hashMap.put("Gautam");		// Single element allowed with null key
		//hashMap.put(6);				// multiple elements allowed with null values
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(10));
		
		// put(), putAll
		
		// remove(), clear();
		
		Set<Integer> keys = hashMap.keySet();
		System.out.println(keys);
		
		Collection<String> values = hashMap.values();
		System.out.println(values);
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			Integer key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " : " + value);

		}		
	}
}

