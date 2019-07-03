package emailApp;

import java.util.Scanner;

public class Email {

	
	// make private so that cant be accessed publicly
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companySuffix = "anycompany.com";
	
	// constructor to receive first name and last name
	
	public Email(String firstName, String lastName) {
		
		// make the variables local
		// this keyword refers to the class level variable

		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Full Name: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the Department
		// we are saying that a class variable department which is private
		// -we are setting that equal to state department, and asking 
		// -the user to enter that information.
		// whatever is returned from Setdepartment is stored in department variable
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		
		// call a method that returns a random password
		this.password = setrandomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		// Combine elements to generate email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//		System.out.println("Your Email is: " + this.email);
	}
	

	// Ask for the Department
	private String setDepartment() {
		
		System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1) {return "Sales";}
		else if(depChoice == 2) {return "Development";}
		else if(depChoice == 3) {return "Accounting";}
		else { return ""; }
	
	}
	
	
	// generate a random password
	private String setrandomPassword(int length) {
		
		// choose from this possibilities, choose randomly
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$";
		
		// an array of character
		char[] password = new char[length];
		
		// iterate through value of length
		for (int i=0; i<length; i++) {
		
		// taking random number, need casting to integer  
		// if there is 30 characters, we want random number between 0 and 30
		// random() returns number betn 0 and 1 and we multiply by 30
		// -make an integer and store it in rand variable
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		}
		
		//Since password now is set of characters so need to modify this 
		//-to be a new string so we simply write syntax as of below
		return new String(password);
	}
		
	
	// set the mailbox capacity
	//encapsulation
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	public int getMailBoxCapacity( ) {
		return mailBoxCapacity; 
	}
	
	
	
	
	// set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	public String getAlternateEmail() {
		return alternateEmail; 
	}
	
	
	

 // change the password
	public void changePassword(String password) {
		this.password = password;
	}	
	public String getPassword() {
		return password; 
	}
	

	
	
	public String showInfo() {
		
		return "Display Name :" + firstName + " " + lastName + 
				"\nCompany Email: " + email + 
				"\nMailBox Capacity: " + mailBoxCapacity + "mb" ;
	}
	
	
}
