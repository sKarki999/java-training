package oop;

public class Demo {

	public static void main(String[] args) {

	person per = new person();
	per.name = "Mo";
	per.email = "salah@lfc.com";
	per.phone = "987654321";
	
	person per2 = new person();
	per2.name = "Bobby";
	per2.email = "Bob@lfc.com";
	per2.phone = "987654322";
	
	per.walk();
	per2.sleep();
		
	}

}

class person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void contact() {
		System.out.println(email + " is contact email");
	}
	
	void sleep() {
		System.out.println(name + " is eating");
	}
}
