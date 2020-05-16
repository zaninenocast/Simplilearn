class LinkedList {
	private class Node {
		private int value;
		private Node next;
		public Node(int value) {
			this.value = value;
		}
	}
	private Node first;
	private Node last;
	
	public void addLast(int item) {
		Node node = new Node(item);
		if(first == null) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
	}
	
	public void addFirst(int item) {
		Node node = new Node(item);
		if(isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		while(current != null) {
			if(current.value == item)
				return index;
			current = current.next;
			index++;
		}
		return -1;
	}
	
	public boolean contains(int item) {
		return indexOf(item) != -1;
	}
	
	public void removeFirst() {
		// 100 -> 200 -> 300
		Node second = first.next;
		first.next = null;
		first = second;
		
	}
	
	// remove LastNode
	// print entire linkedList

	
}


public class Program67 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(100);
		list.addLast(200);
		list.addLast(300);
		System.out.println("list contains 100 or not ? " + list.contains(100));
		list.removeFirst();
		System.out.println("Index of 200 : " + list.indexOf(200));
		System.out.println("Index of 500 : " + list.indexOf(500));
		System.out.println("list contains 200 or not ? " + list.contains(200));
		System.out.println("list contains 500 or not ? " + list.contains(500));
		System.out.println("list contains 100 or not ? " + list.contains(100));
		
		
	}
}


