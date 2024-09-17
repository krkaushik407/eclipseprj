package oops.encapsulation.examples.a1;

public class MainClass {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		// access not allowed for private variables
		// myDog.name = "Pummy";
		// myDog.age = 15;
		myDog.setName("Pummy");
		myDog.setAge(15);
		System.out.println(myDog.getName());
		System.out.println(myDog.getAge());

		Dog herDog = new Dog();
		herDog.setName("Sweety");
		herDog.setAge(10);
		System.out.println(herDog.getName());
		System.out.println(herDog.getAge());
	}

}
