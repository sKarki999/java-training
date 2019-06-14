package studentDatabaseApp;

import java.util.Scanner;

public class studentDatabaseApp {

	public static void main(String[] args) {
		
		
//		student s1 = new student();
//		s1.enroll();
//		s1.payTuition();
//		System.out.println(s1.toString());

		// how many new students to add
		System.out.print("Enter how many students to enroll: ");
		Scanner scan2 = new Scanner(System.in);
		int numOfStudents = scan2.nextInt();
		student[] students = new student[numOfStudents];
		
		// create n number of new students
		for (int i=0; i<numOfStudents; i++ ) {
			students[i] = new student();
			students[i].enroll();
			students[i].payTuition();
		}
		
		for (int n=0; n<numOfStudents; n++) {
			System.out.println(students[n].toString() + "\n");
		}
		  
		
		
		
		
		
	}

}
