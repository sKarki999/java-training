package DataStructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {

		//1. create a collection
		// By using generics, we want this to be list of Strings
		ArrayList<String> cities = new ArrayList<String>();
		
		
		//2. Add Elements
		// we arenot initializing, not using the size of it
		// rightaway we just add elements because of collection
		// -framework which is actually classes and interfaces
		// -which have API Methods
		// now with 'cities' we can work with all the methods available 
		// -as its a collection
		// In arrays, cant add new spaces, cant remove
		
		cities.add("Chitwan");
		cities.add("kathmandu");
		cities.add("Butwal");
		cities.add("Frankfurt");
		
		//3.Iterate through cities
		for (String city: cities) {
			System.out.println(city);
		}
		
		
		//4.Get the size
		int size = cities.size();
		System.out.println("There are " + size + " elements in the collection");

		
		//5. Retrieve Specific element
		System.out.println(cities.get(2));
		
		
		//6. Remove
		cities.remove(0);
		size = cities.size();
		System.out.println("Now there are: ");
		for (String city: cities) {
			System.out.println(city);
		}
				
	}

}
