
import java.io.File;

public class Program49 {

	public static void main(String[] args)  {
		try {
			File file = new File("data.txt");
			if(file.exists()) {
				System.out.println("File exists..");
			} else {
				System.out.println("File doesn't exist.");
			}
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
