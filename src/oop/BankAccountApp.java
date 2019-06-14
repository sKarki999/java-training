package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acct1 = new BankAccount();
		acct1.accountNumber = "1213";
	//	acct1.name = "Jordan Henderson";
	//	With encapsulation: Public API Methods
	//	its about hiding 		
		
		acct1.setName("Jordan Henderson");
		System.out.println(acct1.getName());
		acct1.setSSN("182736");
		System.out.println(acct1.getSSN());

		acct1.balance = 1000.0;
		acct1.setRate();
		acct1.increaseRate();
		
		acct1.deposit(1000.0);
		acct1.withDraw(1000.0);
		
		// polymorphism through overriding
		System.out.println(acct1.toString());
		
		
		// polymorphism through overloading
		BankAccount acct2 = new BankAccount("Checking Type");
		acct2.accountNumber = "2153165";
		
		BankAccount acct3 = new BankAccount("Saving", 900.0);
		acct3.accountNumber = "1515346415";
		
/*		acct3.Balance();
		
		// demo for inheritance
		// cd1 object now can access all the methods in BankAccount class
		// as BankAccount class is parent for CDAccount class.
		// but acct1 object cant access methods from CDAccount class
		CDAccount cd1 = new CDAccount();
		cd1.balance = 2000.0;
		cd1.name = "Alisson Becker";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
*/
	}
}
