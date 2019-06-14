package BankAccountApp;

public class Saving extends Account {
	
	// List properties for saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize saving account properties
	
	public Saving(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox(); 
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10,  3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,  4));
		
	}
	
	
	
	
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Saving Account features:" +
				"\nSafety Deposit Box ID: " + safetyDepositBoxID +
				"\nSafety Deposit Box Key: " + safetyDepositBoxKey +
				"\n***********"
				);
		
	}

	
		
	//List any methods specific for the saving account

}
