import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	int custId;
	String custName;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
}

public class Program53 {

	public static void main(String[] args)  {
		
		/*
		Customer cust = new Customer();
		cust.setCustId(101);
		cust.setCustName("King Kochhar");
		
		try {
			FileOutputStream fileOut = new FileOutputStream("customer.ser");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(cust);
			outStream.close();
			fileOut.close();
			System.out.println("Customer object written successfully...");
			
		} catch(Exception ex) {
			System.out.println(ex);
		}
		*/
		
		Customer cust = null;
		try {
			FileInputStream fileIn = new FileInputStream("customer.ser");
			ObjectInputStream inStream = new ObjectInputStream(fileIn);
			cust = (Customer)inStream.readObject();
			inStream.close();
			fileIn.close();
			System.out.println("Customer Deserialization: ");
			System.out.println("Customer Id : " + cust.getCustId());
			System.out.println("Customer Name : " + cust.getCustName());
		} catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}

}
