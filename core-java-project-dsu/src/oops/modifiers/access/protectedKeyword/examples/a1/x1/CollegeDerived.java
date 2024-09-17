package oops.modifiers.access.protectedKeyword.examples.a1.x1;

import oops.modifiers.access.protectedKeyword.examples.a1.College;

public class CollegeDerived extends College {
	public void printName() {
		System.out.println(name);
	}

	public void print() {
		printCity();
	}

	public static void main(String[] args) {
		College college = new College();
		// access not allowed for protected variables
		// college.name = "XYZ College";

		CollegeDerived abc = new CollegeDerived();
		abc.name = "ABC College";
		abc.city = "Bangalore";
		abc.printName();
		abc.printCity();
		abc.print();

	}

}
