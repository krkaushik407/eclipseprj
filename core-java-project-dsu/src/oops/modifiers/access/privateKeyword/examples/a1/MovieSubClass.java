package oops.modifiers.access.privateKeyword.examples.a1;

public class MovieSubClass extends Movie {

	public void printMovie() {
		// access not allowed for sub classes for private fields
		// even for sub classes
		// System.out.println(name);
		// System.out.println(genre);
	}

	public static void main(String[] args) {
		Movie laksh = new Movie();
		// access not allowed for sub classes for private variables
		// laksh.name = "Laksh";
	}
}
