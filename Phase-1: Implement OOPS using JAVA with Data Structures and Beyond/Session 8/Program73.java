import java.util.Stack;

class QueueWithTwoStacks {
	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
	
	// O(1)
	public void enqueue(int item) {
		stack1.push(item);
	}
	
	// O(n)
	public int dequeue() {
		
		if(stack1.isEmpty() && stack2.isEmpty()) {
			throw new IllegalStateException();
		}
		
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	} 
	
	public int peek() {
		
		if(isEmpty()) {
			throw new IllegalStateException();
		}
		
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	} 
	
	public boolean isEmpty() {
		return (stack1.isEmpty() && stack2.isEmpty());
	}
}

public class Program73 {
	
	public static void main(String[] args) {
		QueueWithTwoStacks queue = new QueueWithTwoStacks();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
		int item = queue.dequeue();
		System.out.println(item);
		System.out.println("Queue is Empty ? " + queue.isEmpty());
		System.out.println("Element at First : " + queue.peek());
		
	}
}
