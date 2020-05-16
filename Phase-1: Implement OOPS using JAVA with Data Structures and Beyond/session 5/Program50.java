
import java.io.File;

public class Program50 {

	public static void main(String[] args)  {
		try {
			File file = new File("data.txt");
			if(file.exists()) {
				System.out.println("File exists..");
				System.out.println(file.getName());
				System.out.println(file.length());
				System.out.println(file.getAbsolutePath());
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.getTotalSpace());
			} else {
				System.out.println("File doesn't exist.");
			}
			
		}
		catch(Exception ex) {
			System.out.println(ex);
		}

	}

}

