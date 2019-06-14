package javaProjectBankAccountApp;

public interface IInterest {

	
	// idea is to grab the interest rate from somewhere else so we dont
	// -need to define rate/interest in our BankAccount class.
	// bankAccount class will implements this interface and access the interest
	
	public double rate = 4.5;
	
	public void accrueInterest();
	
}
