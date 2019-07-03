package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {

		
		//1. Define the file path
		String filename = "C:\\Users\\S_karki\\Desktop\\stuffs\\Java-Projects\\Files\\cl.txt";
		String message = " Allez Allez Allez";
		
		
		//2. Create the file in java
		File file = new File(filename);
		
		try {
		//3. Open the file
		FileWriter fw = new FileWriter(file);
		
		//4. write to the file
		fw.write(message);
		
		//5. close the resources
		fw.close();
		
		}catch (IOException e) {
			System.out.println("Error: Cant write to the file");
			e.printStackTrace();
			
		} finally {
			System.out.println("Closing the file writer");
		}
		
		
	}

}
