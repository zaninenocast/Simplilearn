import java.util.Stack;

class StringReverser {
	public String reverse(String input) {
		Stack<Character> stack = new Stack<>();
		String reversed = "";
		for (char ch : input.toCharArray())
			stack.push(ch);
		while(!stack.isEmpty())
			reversed += stack.pop();
		return reversed;
	}
}

public class Program69 {
	public static void main(String[] args) {
		String str = "abcd";
		StringReverser obj = new StringReverser();
		String result = obj.reverse(str);
		System.out.println("Reversed String : " + result);
	}
}
