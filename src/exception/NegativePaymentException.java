package exception;

public class NegativePaymentException extends Exception{

	double payment;
	
	// Constructor that takes the value that would throw the exception
	// Assign value at local variable class variable 
	public NegativePaymentException(double payment) {
		 
	this.payment = payment;
	
	}
	
	// Override the toString() to include the specific exception message
	@Override
	public String toString() {
		
		return "Error: cant take Negative payment: " + payment;
	}
	
	
}
