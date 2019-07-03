package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {

		// This will read a text file and will return phone number
				
		String filename = "C:\\Users\\S_karki\\Desktop\\stuffs\\Java-Projects\\Files\\phonenumber.txt";
		String phoneNumber = null;
		String[] phoneNums = new String[5];
		
		File file = new File(filename);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			for (int j=0; j<phoneNums.length; j++) {
			phoneNums[j] = br.readLine();
			}
			 br.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println(" Error: File not found");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println(" Error: couldnot read file");
			
		}
		
		// Valid PhoneNumber
					// 10 digits long
					// Area code cant start in 0 or 9
					// There cant be 911 in the number

		
			for (int n=0; n<phoneNums.length; n++) {
				
				phoneNumber = phoneNums[n];
				System.out.print("PhoneNumber " + (n+1) +": " + phoneNumber);
						
			try {
			
			// 10 Digits long
			if (phoneNumber.length() !=10) {
				
				throw new TenDigitsException(phoneNumber);
			}
			
			
			// Area code cant start in 0 or 9
			String firstNum = phoneNumber.substring(0,1);
			if (firstNum.equals("9") || firstNum.equals("0")) {
				
				throw new AreaCodeException(firstNum);
			
			}
			
			
			// There cant be 911 in the number
			for (int i=0; i<phoneNumber.length()-2; i++) {
				
				if (phoneNumber.substring(i, i+1).equals("9")) {
					
					if (phoneNumber.substring(i+1, i+2).equals("1")) {
						
						if (phoneNumber.substring(i+2, i+3).equals("1")) {
							
							throw new EmergencyException(phoneNumber);
						}
					}
				}
			}
			
		System.out.println(" -> CorrectNumber");
			
		} catch (TenDigitsException e) {
			
			System.out.println(" Error: Number should be equal to 10");
		//	e.printStackTrace();
			System.out.println(e.toString());
		
		} catch (AreaCodeException e) {
			
			System.out.println(" Error: cant start with 9 or 0");
			System.out.println(e.toString());
		
		} catch (EmergencyException e) {
			
			System.out.println(" Error: Cant have 911");
			System.out.println(e.toString());
		}
		
		
	}
				
	}

}
	

class TenDigitsException extends Exception{
	
	String phoneNumber;
	
	public TenDigitsException(String phoneNumber) {
		
		this.phoneNumber = phoneNumber;
	
	}
	
	@Override
	public String toString() {
		
		return "Given number is equal to : " + phoneNumber.length();
	}
	
}



class AreaCodeException extends Exception{
	
	String firstNum;
	
	public AreaCodeException(String firstNum) {
		this.firstNum = firstNum;
	}
	
	@Override
	public String toString() {
		return "Number starts with 9 or 0: " + firstNum; 
	}
}


class EmergencyException extends Exception{
	
	String phoneNumber;
	
	public EmergencyException(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "The phone number contains 911 sequence: " + phoneNumber; 
	}
	
}

	
