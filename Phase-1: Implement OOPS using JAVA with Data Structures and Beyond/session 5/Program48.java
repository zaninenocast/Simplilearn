
import java.io.File;

public class Program48 {

	public static void main(String[] args)  {
		try {
			File file = new File("data.txt");
			if(file.createNewFile()) {
				System.out.println("File is created now..");
			} else {
				System.out.println("File already exists.");
			}
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}