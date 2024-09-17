package oops.methods.parameters.task1;

/*
 * create a pojo class Dog
 * create 2 instance variables
 * 1. name of type string
 * 2. age of type int
 * in main class create method to print Dog 
 * which takes name and age as parameters=> printDog()
 * in main class create printDatatype() methods for all primitive data types
 * and string datatype with parameters
 * call all the methods in main method
 *   
 */
public class Main {

	public static void main(String[] args) {
		printString("KATTAPPA");
		printChar('B');
		printByte((byte) 127);
		printShort((short) 32767);
		printInt(100);
		printLong(123456789012345L);
		printFloat(1.12345F);
		printDouble(1.1234567890);
		printBoolean(true);
		printDog("Jimmy", 10);
	}

	public static void printString(String text) {
		System.out.println(text);
	}

	public static void printChar(char character) {
		System.out.println(character);
	}

	public static void printByte(byte number) {
		System.out.println(number);
	}

	public static void printShort(short number) {
		System.out.println(number);
	}

	public static void printInt(int number) {
		System.out.println(number);
	}

	public static void printLong(long number) {
		System.out.println(number);
	}

	public static void printFloat(float number) {
		System.out.println(number);
	}

	public static void printDouble(double number) {
		System.out.println(number);
	}

	public static void printBoolean(boolean flag) {
		System.out.println(flag);
	}

	public static void printDog(String dogName, int dogAge) {
		Dog myDog = new Dog();
		myDog.name = dogName;
		myDog.age = dogAge;
		System.out.println("Dog Name: " + myDog.name);
		System.out.println("Dog Age: " + myDog.age);
	}

}
