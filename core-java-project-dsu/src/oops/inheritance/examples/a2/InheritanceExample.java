package oops.inheritance.examples.a2;

public class InheritanceExample {

	/*
	 * create class Animal create a method sound() in Animal class create class Cat
	 * create class Dog show inheritance between Animal with Cat & Dog class in this
	 * main method with the help of one object of Cat and Dog class
	 */

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		myAnimal.sound();

		Cat myCat = new Cat();
		myCat.sound();

		Dog myDog = new Dog();
		myDog.sound();
	}

}
