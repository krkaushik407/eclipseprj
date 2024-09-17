package oops.finalKeyword.examples.a1;

public class FinalExample {
	public static final double PI = 3.141159;

	public static void main(String[] args) {
		Dog myDog;
		myDog = new Dog();
		myDog.eat();
		myDog.sound();

		final Dog yourDog;
		yourDog = new Dog();

		// yourDog = new Dog();

		int a;
		a = 100;
		a = 200;

		// final double pi = 3.14159;
		// pi = 9;
		System.out.println(PI);

	}

}
