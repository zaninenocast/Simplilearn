import java.util.ArrayDeque;
import java.util.Arrays;

class ArrayQueue {
	private int[] items = new int[5];
	private int rear, front;
	private int count;
	
	public ArrayQueue(int capacity) {
		items = new int[capacity];
	}
	
	public void enqueue(int item) {
		if(count == items.length) 
			throw new IllegalStateException();
		items[rear] = item;
		rear = (rear + 1) % items.length;
		count++;
	}
	
	public int dequeue() {
		int item = items[front];
		items[front] = 0;
		front = (front+1) % items.length;
		count--;
		return item;
	}
	
	@Override
	public String toString() {
		int[] content = Arrays.copyOfRange(items, 0, count);
		return Arrays.toString(content);
	}
}

public class Program72 {
	
	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(5);
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.enqueue(400);
		queue.enqueue(500);
		queue.enqueue(600);
		queue.dequeue();
		queue.enqueue(700);
		System.out.println(queue);
	}
}
