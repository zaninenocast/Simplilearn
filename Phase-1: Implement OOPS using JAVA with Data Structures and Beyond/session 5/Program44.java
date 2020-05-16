
import java.io.FileOutputStream;
import java.io.IOException;

public class Program44 {

	public static void main(String[] args)  {
		try {
			FileOutputStream fout = new FileOutputStream("data.txt");
			fout.write(65);
			fout.close();
			System.out.println("Writing File is Complete..");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}