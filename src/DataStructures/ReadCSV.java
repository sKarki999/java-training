package DataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {

		// This method will read data from a CSV file
		List<String[]> data = new ArrayList<String[]>();
		
		
		// we dont know how many sets of data we have
		// can have unknown amt of users so using List rathar
		// -than array
		String filename = "C:\\Users\\S_karki\\Desktop\\stuffs\\Java-Projects\\Files\\haha.csv";
		String dataRow;
		
		
		try {
			// open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// read the data as long as its not empty
			while ((dataRow = br.readLine()) != null) {
			
			// data parsing
			String[] line = dataRow.split(",");
			data.add(line);
		}
			br.close();
	
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		
		}catch (IOException e) {
			
			e.printStackTrace();
		
		}
	
		// Not the arrays, its collection of arrays so we need
		// foreach iteration to print. cant print directly
		for (String[] account : data) {
			System.out.print("[ ");
				for (String field : account) {
					System.out.print(field + " ");
				}
				System.out.println(" ]");
		}
		
	}

}






