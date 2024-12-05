package Assignment3;

public class BankCollection {
	String accountNumber;
	String accountCustName;
	double balance;

	public BankCollection(String accountNumber, String accountCustName, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountCustName = accountCustName;
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited Amount: " + amount);
		} else {
			System.out.println("Invalid amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn Amount: " + amount);
		} else {
			System.out.println("Invalid withdrawal amount");
		}

	}

	public void checkBalance() {
		System.out.println("Account Balance: " + balance);
	}

	public static void main(String[] args) {
		BankCollection bc = new BankCollection("650221689", "Mounika", 25000);
		System.out.println("CustName "+bc.accountCustName+" "+"AcctNo: "+bc.accountNumber);
		bc.checkBalance();

		bc.deposit(2000);
		bc.withdraw(3500);
		bc.checkBalance();
	}
}
