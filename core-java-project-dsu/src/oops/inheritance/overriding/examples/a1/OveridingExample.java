package oops.inheritance.overriding.examples.a1;

public class OveridingExample {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		myAnimal.sound();

		Cat myCat = new Cat();
		myCat.sound();

		Dog myDog = new Dog();
		myDog.sound();
	}

}
