package oops.thisKeyword.examples.a3;

public class Dog {
	private String name;
	private int age;

	// No Args Constructor
	public Dog() {
		// System.out.println("Hi Mom!"); // not allowed
		this("No Name", 0); // this has to be the very first statement
		// this.name = "No Name";
		// this.age = 0;
	}

	public Dog(String name) {
		this.name = name;
		this.age = 1;
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	Usage of this keyword is not allowed in static context	
//	public static void printStuff() {
//		this.name;
//	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void bark() {
		System.out.println("Bark");
	}
}