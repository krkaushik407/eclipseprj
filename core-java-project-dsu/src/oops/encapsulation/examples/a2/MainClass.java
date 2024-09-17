package oops.encapsulation.examples.a2;

public class MainClass {

	// Create a Customer class
	// In customer class create 4 instance variables namely:
	// 1. name of type string
	// 2. city of type string
	// 3. age of type int
	// 4. mobile of type long
	// Make sure you achieve encapsulation
	// create 2 objects in main method of main class
	// and give values and show values in sysout

	public static void main(String[] args) {
		Customer remo = new Customer();

		remo.setName("Narendra Modi");
		remo.setCity("New Delhi");
		remo.setAge(74);
		remo.setMobile(9876543210L);

		System.out.println(remo.getName());
		System.out.println(remo.getCity());
		System.out.println(remo.getAge());
		System.out.println(remo.getMobile());
	}

}
