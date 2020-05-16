
import java.io.FileInputStream;
//import java.io.FileOutputStream;

public class Program47 {

	public static void main(String[] args)  {
		try {
			FileInputStream fin = new FileInputStream("data.txt");
			int i = 0;
			while((i=fin.read())!= -1) {
				System.out.print((char)i);	
			}
			
			fin.close();
			System.out.println("Writing File is Complete..");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}