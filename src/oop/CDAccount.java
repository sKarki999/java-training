package oop;

public class CDAccount extends BankAccount implements IRate{
	
	// class can have multiple interfaces but single extension
	String interestRate;
	
	void compound() {
		System.out.println("Compounding Interest");
	}
	
}
