package DataStructures;

public class Arrays {

	public static void main(String[] args) {

		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g"};
		
		// transversing a single array
		
		// using the old fashion way
		System.out.println("Old fashion way: ");
		for (int n=0; n<7; n++) {
			System.out.print(alphabet[n] + " ");
		}
		
		
		// using the length property
		System.out.println("\n\nusing Length property: ");
		for (int i=0; i<alphabet.length; i++) {
			
			System.out.print(alphabet[i] + " ");
		
		}
		
		
		// For-each will iterate through alphabet and 
		// -store it in new variable created
		System.out.println("\n\nFor-each method");
		for (String letter: alphabet) {
			System.out.print(letter + " ");
		}
		
	
		
		// transversing multidimensional array
		System.out.println("\n\nDouble arrays");
		
		String[][] users = { 
				{"Roberto", "Firmino", "25 goals", "15416151" },
				{"Mo", "Salah", "20 goals", "1584684354"},
				{"Sadio", "Mane", "20 goals", "9874651535"}
		};
		
		// get the size of the array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of Fields: " + numOfFields);
		
		
		
		
		
		System.out.println("\n\nUsing single array");
		for (int i=0; i<numOfUsers; i++){
			String firstName = users[i][0];
			String lastName = users[i][1];
			String goals = users[i][2];
			String phoneNum = users[i][3];
			System.out.println("Name: " + firstName + " " + lastName + " Goals: " + goals + " PhoneNumber: " + phoneNum);
		}
		
	
		// old fashion way
		System.out.println("\n\nUsing Nested loop");

		for (int i=0; i<numOfUsers; i++) {
			for (int j=0; j<numOfFields; j++) {
				System.out.println(users[i][j]);
			}
			System.out.println("\n");
		}
		
		
		
		// using for-each
		// to create double array
		System.out.println("\nUsing ForEach");
		
		
		for (String[] user: users) {
			System.out.print("[ ");
			for (String field: user) {
				System.out.print(field + " ");
			}
			System.out.println("]");
			
		}		
		
		
	}

}
