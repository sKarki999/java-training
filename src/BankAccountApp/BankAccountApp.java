package BankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
//		Checking check1 = new Checking("John Cena","123456789",1500);
//		Saving save1 = new Saving("stone cold","987654321",2000);
// 	check1.showInfo();
//		save1.showInfo();
//		save1.compound();
		
		
		List<Account> accounts = new LinkedList<Account>();
		// Read a csv file and create new account based on that data
		String file = "C:\\Users\\S_karki\\eclipse-workspace\\Javaprojects\\bin\\utilities\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			Double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Saving(name, sSN, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for (Account acc : accounts) {
			System.out.println("\n*********");
			acc.showInfo();
		}
	}

}
