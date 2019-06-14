package BankAccountApp;

public class Checking extends Account {
	
	// List properties for checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	// Constructor to initialize checking account properties
	
	public Checking(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		
		rate = getBaseRate() * .15;
	}
	
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		
		// showInfo() is overridden at first because parent and child
		// have same method and child method is called. But we want
		// both methods to be called. so user super(**) so that at first
		// parent class method showinfo() is called followed by child class
		
		super.showInfo();
		System.out.println("Your Checking Account features: "
				+ "\nDebit Card Number: " + debitCardNumber
				+ "\nDebit Card PIN: " + debitCardPin
				+ "\n****************"
				);
		
	}
	
	//List any methods specific for the checking account

}
