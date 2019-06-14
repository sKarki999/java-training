package BankAccountApp;

public class Strings {

	public static void main(String[] args) {

		String bookTitle = "Lord of the Rings";
		String wordChoice = "Ring";
		
		if(bookTitle.contains("Ring")) {
			System.out.println("The Book contains the word Ring");
		}
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The Book contains " + wordChoice);
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The Brower is " + browser);
		}
		
		
		String firstName = "Roberto";
		String lastName = "Firmino";
		String SSN = "987659999";
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.println(SSN.substring(5));
		
	}

}
