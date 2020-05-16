import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	String street;
	String city;
	
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

class Customer2 implements Serializable {
	private static final long serialVersionUID = 1L;
	int custId;
	String custName;
	Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}

public class Program54 {

	public static void main(String[] args)  {
		
		
		Customer2 cust = new Customer2();
		cust.setCustId(101);
		cust.setCustName("King Kochhar");
		Address address = new Address("Civil Lines", "Delhi");
		cust.setAddress(address);
		
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
		
		
		
		Customer2 cust1 = null;
		try {
			FileInputStream fileIn = new FileInputStream("customer.ser");
			ObjectInputStream inStream = new ObjectInputStream(fileIn);
			cust1 = (Customer2)inStream.readObject();
			inStream.close();
			fileIn.close();
			System.out.println("Customer Deserialization: ");
			System.out.println("Customer Id : " + cust1.getCustId());
			System.out.println("Customer Name : " + cust1.getCustName());
			System.out.println("City : " + cust1.address.getCity());
		} catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}

}
 

