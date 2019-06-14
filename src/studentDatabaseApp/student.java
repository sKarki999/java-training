package studentDatabaseApp;

import java.util.Scanner;

public class student {
	
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tuitionBalance = 0;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	// constructor: prompts user to enter student's name and year
	
	public student() {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the First Name: ");
		 this.firstName = in.nextLine();
		 
		 
		 System.out.println("\nEnter the Last Name: ");
		 this.lastName = in.nextLine();
		 
		 System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter the class level:  ");
		 this.gradeYear = in.nextInt();
		 
		setStudentID();
	}
	// generate an ID
	
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentId =  gradeYear + "" + id;
	}
	
	
	// enroll in course
	
	public void enroll() {
		// Get inside a loop, user hits 0
		
		do {
			System.out.println("Enter the course to enroll(Q to quit): ");
			Scanner scan = new Scanner(System.in);
			String course = scan.nextLine();
			
			if (!course.equals("Q")) {
				
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
				}
			else {
				
				break; 
			}
		} while(1 != 0);
		
}
	
	// view balance 
	
	public void viewBalance() {
		
		System.out.println("\nTotal Balance: " + "$" + tuitionBalance);
	}
	
	
	// pay tuition fee
	
	public void payTuition() {
		
		viewBalance();
		System.out.println("\nEnter the payment amount: ");
		Scanner scan1 = new Scanner(System.in);
		int payment = scan1.nextInt(); 
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for payment of $" + payment + "\n");
		
	}
	
	// show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance;
	}
	
}
