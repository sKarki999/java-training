package oop;

public class HelloWorld {

	public static void main(String[] args) {
		
		Hello h = new Hello();
		h.setName("Sagun");
		h.setAddress("Fechenheim");
		System.out.println(h.toString());
		
	}
}

	
	 class Hello {
		
		String name;
		String address;
		
		
		// constructor
		public Hello() {
			
			System.out.println("Welcome ");
			System.out.println("adding code from github");
		}
		
		
		// Getter and Setters
		//Encapsulation
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

		
		// toString method		
		@Override
		public String toString() {
			return "Hello [name=" + name + ", address=" + address + "]";
		}
		
}

	 
	 
	 
