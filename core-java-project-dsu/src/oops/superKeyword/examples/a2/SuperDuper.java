package oops.superKeyword.examples.a2;

public class SuperDuper {

	public static void main(String[] args) {
		Cat myCat = new Cat(5, "Bekku", "Milk");
		System.out.println(myCat.age + " " + myCat.name + " " + myCat.catFoodPreference);
		myCat.makeNoise();
		// myCat.eat();
		myCat.jump();

	}

}
