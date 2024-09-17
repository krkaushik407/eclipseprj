package oops.modifiers.access.defaultAccess.examples.a1.b1;

import oops.modifiers.access.defaultAccess.examples.a1.Hotel;

public class DefaultMain {

	public static void main(String[] args) {
		Hotel nandini = new Hotel();
		// access not allowed for default variables
		// from different packages
		// nandini.name = "Hotel Nandini";
	}
}
