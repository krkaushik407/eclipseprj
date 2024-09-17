package oops.polymorphism.examples.a2;

public class MainClass {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Animal();
		animal.sound();
		
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
	}

}
