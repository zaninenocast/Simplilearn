
interface ManageAccount1 {
	void OpenAccount();
	void CloseAccount();
}

interface BankAccount1 {
	default void message() {
		System.out.println("Welcome to ABC Bank.");
	}
	default void message1() {
		System.out.println("Welcome to ABC Bank.");
	}
	static void message2() {
		System.out.println("Welcome to ABC Bank again.");
	}
	static void message3() {
		System.out.println("Welcome to ABC Bank again.");
	}
	void Deposit();
	void Withdraw();
	void Balance();
}

class SavingAccount1 implements BankAccount1, ManageAccount1 {
	

	public void OpenAccount() {
		System.out.println("Opening Saving Account");
		
	}

	public void CloseAccount() {
		System.out.println("Closing Saving Account");
		
	}

	public void Deposit() {
		System.out.println("Deposit in Saving Account");
		
	}
	
	public void Withdraw() {
		System.out.println("Withdraw from Saving Account");
		
	}
	
	public void Balance() {
		System.out.println("Balance in Saving Account");
		
	}
	
}


public class Program20 {
	public static void main(String[] args) {
		
		BankAccount1.message2();
		BankAccount1.message3();
		SavingAccount1 saving = new SavingAccount1();
		saving.message();
		saving.message1();
		saving.OpenAccount();
		saving.Deposit();
		saving.Withdraw();
		saving.Balance();
		saving.CloseAccount();
		
	}
}
