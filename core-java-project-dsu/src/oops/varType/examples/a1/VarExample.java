package oops.varType.examples.a1;

// Var Type

public class VarExample {

	public static void main(String[] args) {
		// byte
		var byteNumber = 127;
		System.out.println(byteNumber);

		// short
		var shortNumber = 32767;
		System.out.println(shortNumber);

		// int
		var number = 100;
		System.out.println(number);

		// long
		var longNumber = 1_234_567_890_123L;
		System.out.println(longNumber);

		// float
		var floatNumber = 1.25F;
		System.out.println(floatNumber);

		// double
		var doubleNumber = 1.90;
		System.out.println(doubleNumber);

		// char
		var character = 'a';
		System.out.println(character);

		// String
		var text = "sun shine";
		System.out.println(text);

		// Cat
		var myCat = new Cat("Zoro", 1);
		System.out.println(myCat.getName() + " " + myCat.getAge());

		printCat(new Cat("Luna", 2));

		// Cannot use var on variables without initializer
		// var name;uuujkiann

	} // end main method()

	public static void printCat(Cat cat) {
		System.out.println(cat.getName() + " " + cat.getAge());
	}

}
