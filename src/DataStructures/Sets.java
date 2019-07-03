package DataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {

		//1. Create the Collection
		// HashSet is random order
		// LinkedHash is ordered
		// TreeSet is alphabetical order
		Set<String> animals = new HashSet<String>();
		
		//2.Add animals
		animals.add("dog");
		animals.add("cat");
		animals.add("elephant");
		animals.add("horse");
		
		System.out.println(animals.size() + " " + animals);
		
		animals.add("horse");
		animals.add("dog");
		animals.add("Fish");
		
		System.out.println(animals.size() + " " + animals);
		
		//Comparing of multiple collections can be done with collection of
		// -same types
		// Create and a new set that we use for comparision
		Set<String> petAnimals = new HashSet<String>();
		petAnimals.add("dog");
		petAnimals.add("chicken");
		petAnimals.add("horse");
		
		
		// Intersection betn animals and pet animals - common in both - AND
		// Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println(intersectionSet);
		
		//Retain the intersected animals
		intersectionSet.retainAll(petAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		
		//what is UNION - both animals - OR
		Set<String> unionSet = new HashSet<String>(petAnimals);
		
		// Union
		unionSet.addAll(animals);
		System.out.println("The union is " + unionSet);
		
		
		// Difference - Animals in one but not in other
		Set<String> diffSet = new HashSet<String>(animals);
		diffSet.removeAll(petAnimals);
		System.out.println("The animals other than pet animals: " +diffSet);
		
		
		
		
	}

}
