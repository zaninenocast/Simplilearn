
//import java.io.File;
import java.io.FileWriter;

public class Program51 {

	public static void main(String[] args)  {
		try {
			FileWriter writer = new FileWriter("a.txt");
			writer.write("Hello Everyone..");
			writer.close();
			System.out.println("Successfully written to the file");
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
