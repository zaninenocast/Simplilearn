
import java.io.FileInputStream;
//import java.io.FileOutputStream;

public class Program46 {

	public static void main(String[] args)  {
		try {
			FileInputStream fin = new FileInputStream("data.txt");
			int i = fin.read();
			System.out.println((char)i);
			fin.close();
			System.out.println("Writing File is Complete..");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
