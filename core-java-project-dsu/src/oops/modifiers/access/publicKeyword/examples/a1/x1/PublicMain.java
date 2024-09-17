package oops.modifiers.access.publicKeyword.examples.a1.x1;

import oops.modifiers.access.publicKeyword.examples.a1.Farmer;

public class PublicMain {

	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		farmer.village = "banasandara";
		farmer.cows = 50;

		System.out.println(farmer.village);
		System.out.println(farmer.cows);

	}

}
