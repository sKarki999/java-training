package oop;

public class BankAccount implements IRate{

	String accountNumber;
	
	// by using static, property belongs to class, not the particular object.
	// final: we cant even assign new value to routing number. its predefined and final
	private static final String routingNumber = "0123456";
	
	// Instant variables
	private String name;
	private String sSN;
	String accountType;
	double balance = 0;
	
	// Creating Constructors ...
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	BankAccount(String accountType){
		System.out.println("Account Type: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType,errorMsg are local variables
		// local are defined within blocks.
		System.out.println("Account Type: " + accountType);
		System.out.println("Init Deposit of $" + initDeposit);
		
		String errorMsg = "";
		
		// scope of variables: String errorMsg must be defined outside
		// if block if we wish to use it outside if block.
		if (initDeposit < 1000) {
				errorMsg = "Initial deposit must be above $1000";
		}else {
				errorMsg =  "Thanks for Deposit";
		}
		System.out.println(errorMsg);
		balance = balance + initDeposit;
	}
	
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "Mr." + name;
	}
	
	
	
	public String getSSN(){
		return sSN;
	}
	public void setSSN(String sSN) {
		this.sSN = sSN;
	}
	
	
	//Interfaces
	public void setRate() {
		System.out.println("Setting Rate.");
	}
	
	public void increaseRate() {
		System.out.println("Increasing Rate.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposited");
	}
	
	
	void withDraw(double amount) {
		balance = balance - amount;
		showActivity("WithDrawn");
	}
	
	// private: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is: $" + balance);
		
	}
	
	
	void Balance() {
		System.out.println("Balance is: " + balance);
		
	}
	
	
	// using @override to ensure toString() from this class is called
	// not from the object class which is one step above the bankAccount class
	@Override
	public String toString() {
		return "[accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance 
			+ ", Routing Number= " + routingNumber	+ "]";
	}
	


}






