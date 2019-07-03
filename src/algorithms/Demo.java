package algorithms;

public class Demo {

	public static void main(String[] args) {

		int[] numbers = {5, 29, 99, 27, 44, 49};
		int[] sortedNumber = {3, 7, 9, 12, 16, 20, 24, 29, 31, 36, 39, 45, 51, 59, 60, 75, 81, 99};
		
		
//		// call the linear search function for a specific number
//		int pos = algorithms.Search.linearSearch(numbers, 27);
//		System.out.println("Found at position: " + pos);
//	
//		
//		// call the binary search function for a specific number
//		int index = algorithms.Search.binarySearch(sortedNumber, 81, 0, sortedNumber.length-1);
//		System.out.println("Found at position: " + index);
		
		
		// call the bubble sort function
		algorithms.Sort.bubbleSort(numbers);
		
	}

}
