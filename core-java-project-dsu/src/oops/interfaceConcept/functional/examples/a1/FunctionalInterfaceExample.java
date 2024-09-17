package oops.interfaceConcept.functional.examples.a1;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Animal cat;
		// cat = new Animal();
		cat = new Animal() {

			@Override
			public void sound() {
				System.out.println("Meow meow.");
			}

		};
		cat.sound();

		Animal dog;
		dog = new Animal() {

			@Override
			public void sound() {
				System.out.println("Bow bow.");
			}

		};
		dog.sound();
	}
}
