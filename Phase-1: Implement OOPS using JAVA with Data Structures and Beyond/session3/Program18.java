
abstract class ManageAccount {
	abstract void OpenAccount();
	abstract void CloseAccount();
}

abstract class BankAccount extends ManageAccount {
	public void message() {
		System.out.println("Welcome to ABC Bank Account.");
	}
	abstract void Deposit();
	abstract void Withdraw();
	abstract void Balance();
}

class SavingAccount extends BankAccount {

	@Override
	void Deposit() {
		System.out.println("Deposit in Saving Account");
		
	}

	@Override
	void OpenAccount() {
		System.out.println("OPening Saving Account");
		
	}

	@Override
	void CloseAccount() {
		System.out.println("Closing Saving Account");
		
	}

	@Override
	void Withdraw() {
		System.out.println("Withdraw from Saving Account");
		
	}

	@Override
	void Balance() {
		System.out.println("Balance in Saving Account");
		
	}
	
}

class CurrentAccount extends BankAccount {
	
	@Override
	void OpenAccount() {
		System.out.println("OPening Current Account");
		
	}

	@Override
	void CloseAccount() {
		System.out.println("Closing Current Account");
		
	}

	@Override
	void Deposit() {
		System.out.println("Deposit in Current Account");
		
	}

	@Override
	void Withdraw() {
		System.out.println("Withdraw from Current Account");
		
	}

	@Override
	void Balance() {
		System.out.println("Balance in Current Account");
		
	}
	
}

public class Program18 {
	
	public static void main(String[] args) {
		
		SavingAccount saving = new SavingAccount();
		saving.message();
		saving.OpenAccount();
		saving.Deposit();
		saving.Withdraw();
		saving.Balance();
		saving.CloseAccount();
		
		CurrentAccount current = new CurrentAccount();
		current.OpenAccount();
		current.Deposit();
		current.Withdraw();
		current.Balance();
		current.CloseAccount();
	}
	

}

