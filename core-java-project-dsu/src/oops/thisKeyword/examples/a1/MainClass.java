package oops.thisKeyword.examples.a1;

public class MainClass {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.setName("Dolly");
		myDog.setAge(5);
		System.out.println(myDog.getName());
		System.out.println(myDog.getAge());

		Dog yourDog = new Dog();
		yourDog.setName("Jacky");
		yourDog.setAge(7);
		System.out.println(yourDog.getName() + " " + yourDog.getAge());
	}
}