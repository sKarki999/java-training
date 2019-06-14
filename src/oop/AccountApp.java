package oop;

public class AccountApp {

	public static void main(String[] args) {
		
		LoanAccount la = new LoanAccount();
		la.setRate();
		la.increaseRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		
		//polymorphism cause changes where we are pointing
		IRate account1 = new LoanAccount();
		account1.setRate();
	}

}
