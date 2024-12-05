package Assignment3;

public class UnionBankSystem {
	String accountNumber;
	String accountHolderName;
	double balance;

	public UnionBankSystem(String accountNumber, String accountHolderName, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}

	public void checkBalance() {
		System.out.println("Account Balance: " + balance);
	}
}

class SavingsAccount extends UnionBankSystem {
	double interestRate;

	public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
		super(accountNumber, accountHolderName, initialBalance);
		this.interestRate = interestRate;
	}

	public void applyInterest() {
		double interest = balance * (interestRate / 100);
		balance += interest;
		System.out.println("Interest applied: " + interest);
	}

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount("653218", "MounikaJonna", 100000, 6);
		System.out.println("Account Holder Name: "+savingsAccount.accountHolderName);
		
		savingsAccount.checkBalance();

		savingsAccount.deposit(6000);
		savingsAccount.withdraw(2500);

		System.out.println("\nBalance after transactions:");
		savingsAccount.checkBalance();

		savingsAccount.applyInterest();

		System.out.println("\nBalance after interest:");
		savingsAccount.checkBalance();
	}
}
