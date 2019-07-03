package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		// Implement Map interfaces
		Map<Integer,String> hMap =  new HashMap<Integer,String>();
		mapUtil(hMap);
	}

	public static void mapUtil(Map<Integer,String> map) {
		
		//Add values
		map.put(9, "Bobby");
		map.put(10, "Mane");
		map.put(11, "Mo");
		map.put(15, "ox");
		map.put(4, "Virgil");
		
		
		// Expose Elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all key value pairs: " + map);
		
		
		// Iterate through map of key values pairs
		for (int key: map.keySet()) {
			System.out.println("[ Key: " + key + ". Value: " + map.get(key) + " ]");
		}
		
	}
	
	
}
