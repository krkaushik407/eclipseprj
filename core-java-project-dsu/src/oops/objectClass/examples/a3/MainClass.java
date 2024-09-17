package oops.objectClass.examples.a3;

public class MainClass {
	// Create a Manager class
	// in Manager class create 3 instance variables namely
	// 1. name of type string
	// 2. city of type string
	// 3. age of type int
	// create a object of Manager class in main method
	// give the values to the object and
	// show the string value of object in sysout
	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println(manager);
		manager.name = "Kattappa";
		manager.city = "Bangalore";
		manager.age = 50;
		System.out.println(manager);

	}

}
