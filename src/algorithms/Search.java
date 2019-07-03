package algorithms;

public class Search {
	
	// Public because want to make it available outside class
	// Static because we dont want to make object to access
	// -we want to access it directly
	
	public static int linearSearch(int[] dataSet, int target) {
		// takes two arguments.
		// target is we're going to try ; dataset is where we are finding it in
		
		// iterate through dataSet searching for target
		for (int i=0; i<dataSet.length; i++) {
			if(dataSet[i] == target) {
				// if returns happen, its going to break out of this
				// -altogether
				return i;
			}
		}
		
		// as long as line 14-18 evaluates somethings, return below wont execute
		return -1;
	}
	
	public static int binarySearch(int[] dataSet, int target, int start, int end) {
	
		// binary search assume a sorted number and continually split search domain in half
		
		
		System.out.println("Searching Between " + dataSet[start] + " and " + dataSet[end]);
		int midpoint = (int) Math.floor((start+end)/2);
		int value = dataSet[midpoint];
		
		if (target > value) {
			
			System.out.println(target + " > " + value);
			// implementing recursion
			return  binarySearch(dataSet, target, midpoint +1, end);
		
		} else if (target < value) {
			
			System.out.println(target + " < " + value);
			return binarySearch(dataSet, target, start, midpoint -1);
		
		}
		
		System.out.println(target + " = " + value );
		return midpoint;
		
	}
	
	
}
