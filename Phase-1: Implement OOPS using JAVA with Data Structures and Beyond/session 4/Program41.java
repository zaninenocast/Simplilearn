
class Shape {
	public final void draw() {
		System.out.println("Draw method in Shape Class.");
	}
}

class Rectangle extends Shape {
	// This will give compile time error. Final method can't be overridden.
//	public void draw() {
//	}
}

public class Program41 {
	
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.draw();
	}
}
