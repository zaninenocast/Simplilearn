
import java.io.FileOutputStream;

public class Program45 {

	public static void main(String[] args)  {
		try {
			FileOutputStream fout = new FileOutputStream("data.txt");
			String message = "Hello World";
			byte data[] = message.getBytes();
			fout.write(data);
			fout.close();
			System.out.println("Writing File is Complete..");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
