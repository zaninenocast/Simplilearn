
import java.util.Arrays;


class Array {
	private int[] items;
	private int count;
	
	public Array(int length) {
		items = new int[length];
	}
	
	public void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
	
	public void insert(int item) {
		// If the array is full, then resize it.
		if(items.length == count) {
			// Create a new array (Twice the size)
			int[] newItems = new int[count * 2];
			// Copy all the existing items
			for (int i = 0; i < count; i++)
				newItems[i]= items[i];
			// Set items to new array
			items = newItems;
		}
		// Add the new item at the end.
		items[count] = item;
		count++;
	}
	
	public void removeAt(int index) {
		// Validate the index
		if( index < 0 || index >= count) {
			throw new IllegalArgumentException();
		}
		// Shift the items towards left to fill the hole
		// [ 10, 30, 40]
		for (int i = 0; i < count; i++)
			items[i] = items[i+1];
		count--;
	}

	public int indexOf(int item) {
		// If we find item, return index
		// otherwise return -1
		// Best Case(Item at first position): O(1)
		// Worst Case(Item at last position): O(n)
		for (int i = 0; i < count; i++) {
			if(items[i] == item)
				return i;
		}
		return -1;
	}

}

public class Program66 {
	public static void main(String[] args) {
		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.print();
		System.out.println("-----------");
		numbers.removeAt(2);
		numbers.print();
		System.out.println("Index of item 50 : " + numbers.indexOf(50));
		System.out.println("Index of item 30 : " + numbers.indexOf(30));
	}
}
