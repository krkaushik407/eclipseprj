package oops.modifiers.access.publicKeyword.examples.a1;

public class FarmerChild extends Farmer {

	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		farmer.village = "Jalipalya";
		farmer.cows = 3;

		System.out.println(farmer.village);
		System.out.println(farmer.cows);
	}
}
