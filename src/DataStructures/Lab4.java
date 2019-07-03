package DataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4 {

	public static void main(String[] args) {

		List<String[]> transactions = new ArrayList<String[]>();
		
		String fileName = "C:\\Users\\S_karki\\Desktop\\stuffs\\Java-Projects\\Files\\asign2.csv ";
		String dataRow;
		double balance = 0.0;
		
		try {
		
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			while ((dataRow = br.readLine()) != null) {
			String[] line = dataRow.split(",");
			transactions.add(line);
		}
			
			br.close();
			
		}catch(FileNotFoundException e) {
		
			e.printStackTrace();
		
		}catch(IOException e) {
		
			e.printStackTrace();
		
		}
		
//		for (String[] transaction: transactions) {
//			for(String field: transaction) {
//				System.out.print(field + " ");
//			}
//				System.out.println();
//		}
		
		// Instead of iterating through its individual variable name
		// now we have a variable based on the array
		// isolate the data
		System.out.println("Date | Transaction | Vendor | Amount | Balance");
		for (String[] transaction: transactions) {
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			// convert String to double
			double amount = Double.parseDouble(transaction[3]);
			System.out.print(date + " | " + type + " | " + vendor + " | $" + amount);
		
		
		if (type.equalsIgnoreCase("credit")) {
			
		//	System.out.println("Add to Balance");
			balance = balance + amount;
		
		} else if (type.equalsIgnoreCase("debit")) {
			
		//	System.out.println("Subtract from balance");
			balance = balance - amount;
			
		} else {
			
		//	System.out.println("Some other transaction");
			
		}
		
			System.out.print(" | " + balance + "\n");
			
		}	
		
		if (balance > 0) {
			System.out.println("You have a balance of " + balance);
			System.out.println("You are charged 10%: " + balance*0.1);
			System.out.println("New balance: " + balance*1.1);
		} else if (balance < 0) {
			System.out.println("Thanks for you payment.");
			System.out.println("You have the overpayment of - " + balance);
		}else {
			System.out.println("Thank for your payment");
		}
		
  }

}
