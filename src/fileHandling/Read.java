package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {

		// 1. Define the file (path) that we want to read
		// We have now the file that we want to bring in
		String filename = "C:\\Users\\S_karki\\Desktop\\stuffs\\Java-Projects\\Files\\liverpool.txt";
		String text = null;
		
		//2.create the file in Java 
		File file = new File(filename);
		
		
		
		try {
			
			//3. Open the file
			// instead of creating a new file reader and then creating a new
			// -buffer reader: just a nested statement
			BufferedReader br;
			//	FileReader fileR = new FileReader(file);
			//	BufferedReader br = new BufferedReader(fileR);
			
			br = new BufferedReader(new FileReader(file));
		
			//4. Read the file
			// IOExcepton: what if it encounters a picture or 
			// -reading a powerpoint file
			
			text = br.readLine();
			
			//5. close the resources
			br.close();
			
		} catch(FileNotFoundException e) {
		
			System.out.println("Error: File not Found " + filename );
			e.printStackTrace();
		
		} catch (IOException e) {
			
			System.out.println("Error: Couldnot Read the file" + filename);
			e.printStackTrace();
		
		} finally {
		
			System.out.println("Finished Reading the File");
		}
		
			System.out.println(text);
		
	}

}

