package basics.ch_06_typeCasting;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
		int intNumber = 10;
		System.out.println(intNumber); // 10

		double doubleNumber = intNumber;
		System.out.println(doubleNumber);

		doubleNumber = 1.123456789012345;
		System.out.println(doubleNumber); // 1.123456789012345

		int number = (int) doubleNumber;
		System.out.println(number); // 1

		float floatNumber = (float) doubleNumber;
		System.out.println(floatNumber); // 1.1234568

		long longNumber = (long) doubleNumber;
		System.out.println(longNumber);

		char character = (char) doubleNumber;
		System.out.println(character);

		short shortNumber = (short) doubleNumber;
		System.out.println(shortNumber);

		byte byteNumber = (byte) doubleNumber;
		System.out.println(byteNumber);

		longNumber = 1_234_567_890_123_45L;
		intNumber = (int) longNumber;
		System.out.println(intNumber);

		String stringNumber = "20";
		// number = (int)stringNumber; // not allowed
		stringNumber = stringNumber + 10;
		System.out.println(stringNumber); // 2010
		System.out.println(stringNumber + 15 + 10); // 20101510
		System.out.println(stringNumber + (15 + 10)); // 201025

		int digit = Integer.parseInt(stringNumber);
		System.out.println(digit); // 2010
		System.out.println(digit + 10); // 2010 + 10 => 2020
	}
}
