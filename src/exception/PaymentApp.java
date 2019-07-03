package exception;

import java.util.Scanner;

public class PaymentApp {

	// Take a payment from the user.
	
	public static void main(String[] args) {

		double payment = 0;
		boolean positivePayt = true;
		
		do {
			
		//1. Ask for user input
		System.out.print("Enter the Amount: ");
		
		
		//2. Get the Amount , Test the value
		// how to take user input
		Scanner scan1 = new Scanner(System.in);
		
		//3. Handle exceptions appropriately
		try {
		payment = scan1.nextDouble();
			if (payment <0) {
				// throw error
				throw new NegativePaymentException(payment);
			} else {
				positivePayt = true;
			}	
			} catch(NegativePaymentException e) {
				// exception
				System.out.println(e.toString());
				System.out.println("Please Try Again!!");
				positivePayt = false;
			} 
		
		}while(!positivePayt);
		
		
		//4. Print Confirmation
		System.out.println("Thank for the your payment of " + payment);
		
		
		
	}

}
