package oops.methods.returnDatatype.demo;

public class MethodWithReturnDatatypeExample {

	public static void main(String[] args) {
		// String text = printString();

		String text = getString();
		System.out.println(text);
		System.out.println(text.toUpperCase());

			}

	public static void printString() {
		String text = "java";
		System.out.println(text);
	}

	public static String getString() {
		String text = "java";
		return text;
	}

	public static char getChar() {
		char character = 'z';
		return character;
	}

}
