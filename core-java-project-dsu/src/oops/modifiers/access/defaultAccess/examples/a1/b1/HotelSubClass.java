package oops.modifiers.access.defaultAccess.examples.a1.b1;

import oops.modifiers.access.defaultAccess.examples.a1.Hotel;

public class HotelSubClass extends Hotel {

	public void printHotel() {
		// access not allowed for default variables
		// from different package even for sub class
		// System.out.println(name + rooms);
	}

	public static void main(String[] args) {
		Hotel ritzCart = new Hotel();
		// access not allowed for default variables
		// from different package even for sub class
		// ritzCart.name = "Hotel Ritz Cart";

	}

}
