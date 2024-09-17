package oops.constructor.examples.a2;

public class Employee {

	public String name;
	public String city;

	// default constructor
	public Employee() {
	}

	// constructor with name
	public Employee(String name) {
		this.name = name;
	}

	// constructor with name and city
	public Employee(String name, String city) {
		this.name = name;
		this.city = city;
	}

}
