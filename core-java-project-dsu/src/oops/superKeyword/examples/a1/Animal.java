package oops.superKeyword.examples.a1;

public class Animal {
	public int age;
	public String name;

	public Animal() {
	}

	public void makeNoise() {
		System.out.println("Hello! I am an animal.");
	}

	public void eat() {
		System.out.println("Munch munch.");
	}

	private void doSomethingPrivate() {
		System.out.println("Hey this method is private.");
	}
}
