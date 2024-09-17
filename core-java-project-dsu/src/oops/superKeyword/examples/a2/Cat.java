package oops.superKeyword.examples.a2;

public class Cat extends Animal {

	public String catFoodPreference;

	public Cat(int age, String name, String catFoodPreference) {
		// System.out.println("Hi Mom!"); // not allowed anything before super
		super(age, name); // this should be the first statement
		// this.age = age;
		// this.name = name;
		this.catFoodPreference = catFoodPreference;
	}

	@Override
	public void makeNoise() {

		super.makeNoise();

		System.out.println("Meow meow meow.");

		// super is not required
		// super.eat();
		eat();

		// access to private methods not allowed
		// super.doSomethingPrivate();
	}

	public void jump() {
		System.out.println(super.name);
		super.makeNoise();
	}

}
