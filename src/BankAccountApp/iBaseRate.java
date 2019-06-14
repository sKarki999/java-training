package BankAccountApp;

public interface iBaseRate {

	// write a method that returns a base rate
	
	default double getBaseRate() {
		return 2.5;
	}
		
}
