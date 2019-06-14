package BankAccountApp;

public abstract class Account implements iBaseRate {
	
	// List common properties for saving and checking account
	private String name;
	private String sSN;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
	
		// set the account number
		
		// to generate unique number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
		
	}
	
	public abstract void setRate();
	
	
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		
		// to generate random number
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		double accrudInterest = (balance + (rate/100));
		balance = accrudInterest;
		System.out.println("Accrud Interest: " + accrudInterest);
		printBalance();
	}
	
	// List common methods
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withDraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Current Balance $" + balance);
	}
	
	public void showInfo() {
		
		System.out.println(
				
				"NAME: " + name +
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nRate: " + rate + "%" + 
				"\nPrevious BALANCE: " + balance 
				
				);
		
		
	}

}








