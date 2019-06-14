package BankAccountApp;

public class Cities {

	public static void main(String[] args) {

	// Declare and Define an Array
	// Explicitly defining the size	
		String[] cities = {"Kathmandu", "Butwal", "Pokhara", "Hetauda"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
	// Declare an array
	// Implicitly defining the size	(only size)
		String[] states = new String[5];
		states[0] = "Bagmati";
		states[1] = "Narayani";
		states[2] = "Lumbini";
		states[3] = "Gandaki";
		states[4] = "Koshi";

		int i = 0;
		do {
			System.out.println(states[i]);
			i++;
		}while(i<states.length);
		
		
//		for (int i=0; i<states.length; i++) {
//			System.out.println(states[i]);
//		}
		
		
	}

}
