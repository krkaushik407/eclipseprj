package basics.ch_05_datatypes;

public class DatatypeExample {

	public static void main(String[] args) {
		// single character
		char character = 'Z';
		System.out.println(character);

		// set of characters
		String subject = "java";
		System.out.println(subject);

		// whole numbers
		byte byteNumber = 127;
		System.out.println(byteNumber);

		short shortNumber = 32767;
		System.out.println(shortNumber);

		int intNumber = 1_234_567;
		System.out.println(intNumber);

		long longNumber = 1_234_567_890_123L;
		System.out.println(longNumber);

		// decimal numbers
		float floatNumber = 1.123456F;
		System.out.println(floatNumber);

		double doubleNumber = 1.123456789012345;
		System.out.println(doubleNumber);

		// boolean values
		boolean isTrueOrFalse = true;
		System.out.println(isTrueOrFalse);
	}

}
