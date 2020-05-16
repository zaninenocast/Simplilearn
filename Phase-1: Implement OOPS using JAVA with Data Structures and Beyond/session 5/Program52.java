
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Program52 {

	public static void main(String[] args)  {
		try {
			FileReader reader = new FileReader("a.txt");
			Scanner data = new Scanner(reader);
			while(data.hasNextLine()) {
				System.out.println(data.nextLine());
			}
			
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
