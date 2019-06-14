package emailApp;

import java.util.Scanner;

public class Email {

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
		
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("Full Name: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the Department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		
		// call a method that returns a random password
		this.password = setrandomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		// Combine elements to generate email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	//	System.out.println("Your Email is: " + this.email);
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
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		}
		
		//password now is set of characters so need to modify
		return new String(password);
	}
	
	
	// set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	public int getMailBoxCapacity( ) {return mailBoxCapacity; }
	
	
	
	// set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	public String getAlternateEmail() {return alternateEmail; }
	
	
	
	// change the password
	public void changePassword(String password) {
		this.password = password;
	}	
	public String getPassword() {return password; }
	
	
	public String showInfo() {
		
		return "Display Name :" + firstName + " " + lastName + 
				"\nCompany Email: " + email + 
				"\nMailBox Capacity: " + mailBoxCapacity + "mb" ;
	}
	
	
}
