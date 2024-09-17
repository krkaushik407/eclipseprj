package oops.interfaceConcept.multiple.examples.a1;

public class MultipleInterfaceExample {

	public static void main(String[] args) {
		MeghanaFoods meghana;
		// meghana = new MeghanaFoods();

		meghana = new Swiggy();
		meghana.deliverFromMeghanaFoods();

		meghana = new Zomato();
		meghana.deliverFromMeghanaFoods();

		A2B a2b;

		a2b = new Swiggy();
		a2b.deliverFromA2B();

		a2b = new Zomato();
		a2b.deliverFromA2B();

	}

}
