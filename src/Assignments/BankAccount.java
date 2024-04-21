package Assignments;

public class BankAccount {
	private String accountnumber;
	private double balance;
	private String owner;
	
	public BankAccount(String accountnumber, double balance) {
		this.accountnumber = accountnumber;
		this.balance = balance;
	}
	
	public BankAccount() {

	}
	
	public void deposit(double depositAmount) {
		this.balance=balance+depositAmount;
	}
	
	public void withdraw(double withdrawAmount) {
		this.balance= balance-withdrawAmount;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void printStatement() {
		System.out.println("Person details are : AccountNumber: "+accountnumber +" OwnerName: "+owner+" Current Balance: "+balance);
	}
	

}
