package oops.methods.parameters.demo1;

import oops.methods.demo.Cat;

public class MethodWithParametersExample {

	public static void main(String[] args) {
		printCat("Mickey", 5);
		printChar('A');
		printString("python");
		printString("sql");
	}

	public static void printCat(String name, int age) {
		Cat myCat = new Cat();
		myCat.name = name;
		myCat.age = age;
		System.out.println(myCat.name);
		System.out.println(myCat.age);
	}

	public static void printChar(char character) {
		System.out.println(character);
	}

	public static void printString(String text) {
		System.out.println(text);
	}

}
