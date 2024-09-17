package oops.inheritance.overriding.examples.a2;

public class OverridingExample {

	/*
	 * create a class called Restaurant{} 
	 * create a method called makeDish() in Restaurant class 
	 * create a class called BiryaniChef{} 
	 * create a class called PalakPaneerChef{} 
	 * override method makeDish from Restaurant class in classes
	 * namely BiryaniChef & PalakPaneerChef 
	 * show the implementation in main method
	 * with 2 objects
	 */
	public static void main(String[] args) {
		Restaurant restaurant;

		restaurant = new Restaurant();
		restaurant.makeDish();

		restaurant = new BiryaniChef();
		restaurant.makeDish();

		restaurant = new PalakPaneerChef();
		restaurant.makeDish();

	}

}
