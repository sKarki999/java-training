package javaProjectBankAccountApp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("405123698", 1000.00);
		BankAccount acc2 = new BankAccount("321456987", 1500.00);
		BankAccount acc3 = new BankAccount("214532659", 2000.00);
		
		acc1.setName("Sagun");
		System.out.println(acc1.getName());
		acc1.makeDeposit(1000.00);
		acc1.makeDeposit(1000.00);
		acc1.payBill(1000.00);
		acc1.accrueInterest();
		System.out.println(acc1.toString());
		
	}
	
}

class BankAccount implements IInterest{
	
	// properties of Bank Account
	private static int iD = 1000; 				
	// Internal ID
	// As a bank, we want to have seperate internal ID 
	// we want to have unique ID for each person/ each new account, we want this
	// -to be static
	// we want this property to belong to class, not particular person
	 
	// iD + random 2 digit num + first 2 of SSN
	private String accountNumber; 	
	
	// routingNumber also should be static because the routingnumber is
	// -not going to be unique to each object but its going to be the case
	// -for all classes, objects or accounts
	// we cannot chance this routingNumber	
	private static final String routingNumber = "0045400";
	
	private String name;
	private String sSN;
	private double balance;
	
	// Constructor
	public BankAccount(String sSN, double initDeposit) {
		
	//	System.out.println("New Account Created");
		// making instance variable sSN to local variable
		this.sSN = sSN;
		
		balance = initDeposit;
		
		// Everytime we create new account, we want id to increase by 1
		iD++;
	//	System.out.println(iD);
		setAccountNumber();
	}
	
	
	// generate account number
	// make unaccessable to client , be auto generated in the backend
	// -so we make it private
	private void setAccountNumber() {
		
	// generate random number ,
	// the following function returns in double so need to cast into int
		int random = (int) (Math.random() * 100);
	//	System.out.println(random);
		accountNumber = iD + "" + random + sSN.substring(0,2);
		System.out.println("Your Account Number: "+ accountNumber);
		
		
	}
	
	
	// Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Congratulations. you paid the bill of "
		+ amount + " successfully.");
		currentBalance(balance);
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Congratulations. your deposit of $ "
		+ amount + " was successful.");
	    currentBalance(balance);
		
	}
	
	@Override
	public void accrueInterest() {
		balance = balance * (1 + (rate/100));
		
		System.out.print("With accumulated interest,");
		currentBalance(balance);
	}

	
	public void currentBalance(double balance) {
		System.out.println(" Your current balance is $ " + balance);
	}


	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", sSN=" + sSN + ", balance="
				+ balance + "]";
	}

}






