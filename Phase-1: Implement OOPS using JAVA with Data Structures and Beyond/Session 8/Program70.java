import java.util.Stack;

class StringReverser1 {
	public String reverse(String input) {
		if(input == null) {
			throw new IllegalArgumentException();
		}
		Stack<Character> stack = new Stack<>();
		for (char ch : input.toCharArray())
			stack.push(ch);
		StringBuffer reversed = new StringBuffer();
		while(!stack.isEmpty())
			reversed.append(stack.pop());
		return reversed.toString();
	}
}

public class Program70 {
	public static void main(String[] args) {
		String str = null;
		StringReverser1 obj = new StringReverser1();
		String result = obj.reverse(str);
		System.out.println("Reversed String : " + result);
	}
}

