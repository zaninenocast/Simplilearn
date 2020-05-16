
final class Shape1 {
	public void draw() {
		System.out.println("Draw method in Shape Class.");
	}
}

//This will give compile time error. Final method can't be EXTEND.
class Rectangle1 extends Shape1 {
	
//	public void draw() {
//	}
}

public class Program42 {
	
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.draw();
	}
}
