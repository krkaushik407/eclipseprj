package oops.modifiers.access.publicKeyword.examples.a1.x1;

import oops.modifiers.access.publicKeyword.examples.a1.Farmer;

public class FarmerChild extends Farmer {
	public void printFarmer() {
		System.out.println(village + " : " + cows);
	}

	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		farmer.village = "kodhalli";
		farmer.cows = 1;
		System.out.println(farmer.village);
		System.out.println(farmer.cows);

		FarmerChild farmerChild = new FarmerChild();
		farmerChild.village = "bidalur";
		farmerChild.cows = 5;
		farmerChild.printFarmer();

	}

}
