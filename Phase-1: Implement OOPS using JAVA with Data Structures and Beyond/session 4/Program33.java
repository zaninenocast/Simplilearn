import java.util.Vector;

public class Program33 {
	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		
		System.out.println(vector.capacity());
		
		vector.addElement("a");
		vector.addElement("b");
		vector.addElement("c");
		
		System.out.println("****************");
		
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		// add(), addElement(), addAll(), add(index, Object)
		
		// remove(), removeElement(), removeAll(Coll), coll.removeAllElments(), coll.removeRange(ind1, ind2)
		
		// get(index), firstElement(), elementAt(index)
		
		
	}
}


