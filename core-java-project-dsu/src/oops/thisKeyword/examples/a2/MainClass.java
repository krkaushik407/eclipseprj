package oops.thisKeyword.examples.a2;

public class MainClass {

	public static void main(String[] args) {
		Dog hisDog = new Dog("Jimmy", 4);
		System.out.println(hisDog.getName() + " " + hisDog.getAge());

		Dog herDog = new Dog("Stella", 6);
		System.out.println(herDog.getName() + " " + herDog.getAge());
	}
}