
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable  {
	private static final long serialVersionUID = 1L;
	String country = "India";
	String nationality;
	public User() {
		System.out.println("User: Default Constructor");
	}
	public User(String country, String nationality) {
		super();
		this.country = country;
		this.nationality = nationality;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}


class Customer4 extends User implements Serializable {
	private static final long serialVersionUID = 1L;
	int custId;
	String custName;
	
	public Customer4(int custId, String custName, String country, String nationality) {
		super(country, nationality);
		this.custId = custId;
		this.custName = custName;
		System.out.println("Customer: Parameterized COnstructor");
	}
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

public class Program56 {

	public static void main(String[] args)  {
		
		
		Customer4 cust = new Customer4(101, "King", "US", "Indian");
		System.out.println(cust.getCustId());
		System.out.println(cust.getCustName());
		System.out.println(cust.getCountry());
		System.out.println(cust.getNationality());
		
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
		
		
		
		Customer4 cust1 = null;
		try {
			FileInputStream fileIn = new FileInputStream("customer.ser");
			ObjectInputStream inStream = new ObjectInputStream(fileIn);
			cust1 = (Customer4)inStream.readObject();
			inStream.close();
			fileIn.close();
			System.out.println("Customer Deserialization: ");
			System.out.println("Customer Id : " + cust1.getCustId());
			System.out.println("Customer Name : " + cust1.getCustName());
			System.out.println("Country : " + cust1.getCountry());
			System.out.println("Nationality : " + cust1.getNationality());
		} catch(Exception ex) {
			System.out.println(ex);
		}		
	}

}
