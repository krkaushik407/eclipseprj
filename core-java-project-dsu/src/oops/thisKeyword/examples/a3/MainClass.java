package oops.thisKeyword.examples.a3;

public class MainClass {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		System.out.println(myDog.getName() + " " + myDog.getAge());

		Dog hisDog = new Dog("Jimmy");
		System.out.println(hisDog.getName() + " " + hisDog.getAge());

		Dog herDog = new Dog("Jolly", 6);
		System.out.println(herDog.getName() + " " + herDog.getAge());
	}
}