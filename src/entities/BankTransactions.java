package entities;

public class BankTransactions {

	public static final double TAXA = 5.00;

	private int accountID;
	private String name;
	private double balance;

	public BankTransactions(int accountID, String name, double initialDeposit) {
		this.accountID = accountID;
		this.name = name;
		deposit(initialDeposit);
	}

	public BankTransactions(int accountID, String name) {
		this.accountID = accountID;
		this.name = name;
		balance = 0;
	}

	public int getAccountID() {
		return accountID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBankBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount + TAXA;
	}

	public String toString() {
		return "Dados da Conta: \nNúmero da conta: " + this.accountID + ", Titular: " + this.name + ", Saldo atual: R$ "
				+ String.format("%.2f%n", this.balance);
	}

}
