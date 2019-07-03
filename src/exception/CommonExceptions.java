package exception;

public class CommonExceptions {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		// Identify the potential problem area
		// Surround with try catch block
		
		try {
		
			int c = a/b;
		
		} catch(Exception e) {
			
			System.out.println(e.toString());
		
		}
		
		
		String[] states = {"Ktm", "btwl", "chtwn"};
		for (int i=0; i<=states.length; i++) {
			try {
			
				System.out.println(states[i]);
			
			}catch(Exception e) {
				
				System.out.println(e.toString());
			
			} finally {
				
				System.out.println("Iteraing through array");
			
			}
			
		}
		
		System.out.println("Programming is closing");

	}

}
